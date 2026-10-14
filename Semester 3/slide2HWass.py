from typing import Callable, Iterable, TypeVar, TypedDict


class Student(TypedDict):
    name: str
    courses: set[str]


T = TypeVar("T")


def filter_items(items: Iterable[T], test: Callable[[T], bool]) -> list[T]:
    """Generic helper that filters any iterable."""
    return [item for item in items if test(item)]


students: dict[str, Student] = {}


def add_student(student_id: str, name: str) -> None:
    students[student_id] = {"name": name, "courses": set()}


def register_course(student_id: str, course: str) -> None:
    students[student_id]["courses"].add(course)


def drop_course(student_id: str, course: str) -> None:
    students[student_id]["courses"].discard(course)


def search_student(student_id: str) -> Student | None:
    return students.get(student_id)


def all_courses() -> set[str]:
    return {course for student in students.values() for course in student["courses"]}


def students_in_course(course: str) -> list[tuple[str, Student]]:
    return filter_items(
        students.items(),
        lambda item: course in item[1]["courses"],
    )


def display_students() -> None:
    for student_id, student in sorted(students.items(), key=lambda item: item[1]["name"]):
        print(f"{student['name']} ({student_id}): {', '.join(sorted(student['courses']))}")


add_student("S1", "Sam")
add_student("S2", "Alex")
register_course("S1", "CS101")
register_course("S1", "MATH101")
register_course("S2", "CS101")

print("Students:")
display_students()
print("All courses:", sorted(all_courses()))
print("Students in CS101:", [student["name"] for _, student in students_in_course("CS101")])
print("Search S1:", search_student("S1"))