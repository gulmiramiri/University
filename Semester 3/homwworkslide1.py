from abc import ABC, abstractmethod


class Person(ABC):
    def __init__(self, name):
        self.name = name

    @property
    @abstractmethod
    def role(self):
        pass

    def __str__(self):
        return f"{self.role}: {self.name}"


class Member(Person):
    role = "Member"

    def __init__(self, name, member_id):
        super().__init__(name)
        self.member_id = member_id


class Librarian(Person):
    role = "Librarian"


class Book:
    def __init__(self, title):
        self.title = title
        self.available = True

    def __str__(self):
        return f"{self.title} ({'available' if self.available else 'loaned'})"


class Loan:
    def __init__(self, member, book):
        self.member, self.book = member, book
        book.available = False


class Library:
    def __init__(self):
        self.books, self.members, self.loans = [], [], []

    def checkout(self, member, book):
        if not book.available:
            raise ValueError("Book is not available.")
        self.loans.append(Loan(member, book))


library = Library()
member = Member("Sam", "M1")
librarian = Librarian("Alex")
book = Book("Python Basics")

library.members.append(member)
library.books.append(book)
library.checkout(member, book)

# Polymorphism: both subclasses use Person's shared interface.
for person in [member, librarian]:
    print(person)
print(book)