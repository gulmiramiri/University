def set_age(age: int) -> int:
    if not isinstance(age , int):
        raise TypeError("Age Must Be int")

    if age < 0 :
        assert age > 0

    return age


set_age(-3
        )