import csv
import re
import shutil
from pathlib import Path

DATA_FILE = Path(__file__).with_name("students.csv")
FIELDS = ["student_id", "name", "department", "semester"]
Student = dict[str, str]


def validate_student(student_id: str, name: str, department: str, semester: str) -> Student:
    student_id, name = student_id.strip(), name.strip()
    department, semester = department.strip(), semester.strip()

    if not re.fullmatch(r"[A-Za-z0-9-]+", student_id):
        raise ValueError("ID must contain only letters, numbers, or hyphens.")
    if not name or not department:
        raise ValueError("Name and department are required.")
    if not semester.isdigit() or int(semester) < 1:
        raise ValueError("Semester must be a positive number.")

    return {
        "student_id": student_id,
        "name": name,
        "department": department,
        "semester": semester,
    }


def load_students() -> list[Student]:
    if not DATA_FILE.exists():
        return []

    try:
        with DATA_FILE.open(newline="", encoding="utf-8") as file:
            reader = csv.DictReader(file)
            if reader.fieldnames != FIELDS:
                raise ValueError("CSV headers are missing or incorrect.")

            students = []
            for row in reader:
                if None in row or any(row.get(field) is None for field in FIELDS):
                    raise ValueError(f"Invalid CSV row near line {reader.line_num}.")
                students.append(validate_student(*(row[field] for field in FIELDS)))

        ids = [student["student_id"] for student in students]
        if len(ids) != len(set(ids)):
            raise ValueError("CSV contains duplicate student IDs.")
        return students
    except (csv.Error, UnicodeDecodeError) as error:
        raise ValueError(f"Could not read student file: {error}") from error


def save_students(students: list[Student], backup: bool = True) -> None:
    if backup and DATA_FILE.exists():
        shutil.copy2(DATA_FILE, DATA_FILE.with_suffix(".csv.bak"))

    temporary_file = DATA_FILE.with_suffix(".tmp")
    with temporary_file.open("w", newline="", encoding="utf-8") as file:
        writer = csv.DictWriter(file, fieldnames=FIELDS)
        writer.writeheader()
        writer.writerows(students)
    temporary_file.replace(DATA_FILE)


def add_student(student: Student) -> None:
    students = load_students()
    if any(item["student_id"] == student["student_id"] for item in students):
        raise ValueError("That student ID already exists.")
    students.append(student)
    save_students(students, backup=False)


def search_student(student_id: str) -> Student | None:
    return next(
        (student for student in load_students()
         if student["student_id"] == student_id.strip()),
        None,
    )


def update_student(student_id: str, name: str, department: str, semester: str) -> None:
    students = load_students()
    for index, student in enumerate(students):
        if student["student_id"] == student_id.strip():
            students[index] = validate_student(student_id, name, department, semester)
            save_students(students)
            return
    raise ValueError("Student not found.")


def delete_student(student_id: str) -> None:
    students = load_students()
    remaining = [student for student in students if student["student_id"] != student_id.strip()]
    if len(remaining) == len(students):
        raise ValueError("Student not found.")
    save_students(remaining)


def display_student(student: Student) -> None:
    print(
        f'{student["student_id"]}: {student["name"]}, '
        f'{student["department"]}, semester {student["semester"]}'
    )


def main() -> None:
    while True:
        print("\n1 Add  2 List  3 Search  4 Update  5 Delete  0 Exit")
        choice = input("Choose: ").strip()

        try:
            if choice == "1":
                student = validate_student(
                    input("ID: "), input("Name: "),
                    input("Department: "), input("Semester: "),
                )
                add_student(student)
                print("Student added.")
            elif choice == "2":
                for student in load_students():
                    display_student(student)
            elif choice == "3":
                student = search_student(input("Student ID: "))
                display_student(student) if student else print("Student not found.")
            elif choice == "4":
                student_id = input("Student ID: ")
                update_student(
                    student_id, input("New name: "), input("New department: "),
                    input("New semester: "),
                )
                print("Student updated. Backup saved.")
            elif choice == "5":
                delete_student(input("Student ID: "))
                print("Student deleted. Backup saved.")
            elif choice == "0":
                break
            else:
                print("Choose a listed option.")
        except (ValueError, OSError) as error:
            print("Error:", error)


if __name__ == "__main__":
    main()