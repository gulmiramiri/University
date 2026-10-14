from abc import ABC, abstractmethod
from decimal import Decimal


def to_decimal(value):
    return Decimal(str(value))


class Account(ABC):
    def __init__(self, owner, opening_balance=0):
        balance = to_decimal(opening_balance)
        if balance < 0:
            raise ValueError("Opening balance cannot be negative.")

        self.owner = owner
        self._balance = balance

    @property
    def balance(self):
        return self._balance

    def deposit(self, amount):
        amount = to_decimal(amount)
        if amount <= 0:
            raise ValueError("Deposit amount must be positive.")
        self._balance += amount

    def withdraw(self, amount):
        amount = to_decimal(amount)
        if amount <= 0:
            raise ValueError("Withdrawal amount must be positive.")
        if amount > self._balance:
            raise ValueError("Insufficient funds.")
        self._balance -= amount

    @abstractmethod
    def calculate_monthly_adjustment(self):
        """Return a positive amount for a benefit or negative amount for a fee."""
        raise NotImplementedError

    def apply_monthly_adjustment(self):
        adjustment = self.calculate_monthly_adjustment()
        if adjustment > 0:
            self.deposit(adjustment)
        elif adjustment < 0:
            self.withdraw(-adjustment)
        return adjustment


class SavingsAccount(Account):
    def __init__(self, owner, opening_balance=0, interest_rate="0.02"):
        super().__init__(owner, opening_balance)
        self.interest_rate = to_decimal(interest_rate)
        if self.interest_rate < 0:
            raise ValueError("Interest rate cannot be negative.")

    def calculate_monthly_adjustment(self):
        return self.balance * self.interest_rate


class CurrentAccount(Account):
    def __init__(self, owner, opening_balance=0, monthly_fee="5.00"):
        super().__init__(owner, opening_balance)
        self.monthly_fee = to_decimal(monthly_fee)
        if self.monthly_fee < 0:
            raise ValueError("Monthly fee cannot be negative.")

    def calculate_monthly_adjustment(self):
        return -self.monthly_fee


def process_accounts(accounts):
    for account in accounts:
        adjustment = account.apply_monthly_adjustment()
        print(
            f"{account.owner}: adjustment {adjustment:.2f}, "
            f"balance {account.balance:.2f}"
        )


if __name__ == "__main__":
    accounts = [
        SavingsAccount("Ava", "1000.00"),
        CurrentAccount("Noah", "500.00"),
    ]

    process_accounts(accounts)