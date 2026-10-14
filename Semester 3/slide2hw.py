from typing import Generic, TypeVar

T = TypeVar("T")


class Stack(Generic[T]):
    def __init__(self) -> None:
        self._items: list[T] = []

    def push(self, item: T) -> None:
        self._items.append(item)

    def pop(self) -> T:
        if self.is_empty():
            raise IndexError("Cannot pop from an empty stack.")
        return self._items.pop()

    def peek(self) -> T:
        if self.is_empty():
            raise IndexError("Cannot peek at an empty stack.")
        return self._items[-1]

    def is_empty(self) -> bool:
        return len(self._items) == 0

    def size(self) -> int:
        return len(self._items)


numbers: Stack[int] = Stack()
numbers.push(10)
numbers.push(20)
print(numbers.peek(), numbers.size())
print(numbers.pop())

words: Stack[str] = Stack()
words.push("hello")
print(words.peek())

empty_stack: Stack[int] = Stack()
try:
    empty_stack.pop()
except IndexError as error:
    print(error)