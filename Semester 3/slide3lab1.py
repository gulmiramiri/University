FILE_NAME = "students.txt"
STARTER_RECORDS = [
    "S1,Sam",
    "S2,Alex",
    "S3,Jamie",
    "S4,Taylor",
    "S5,Jordan",
]


def read_records() -> list[str]:
    try:
        with open(FILE_NAME, "r") as file:
            return [line.strip() for line in file if line.strip()]
    except FileNotFoundError:
        # Create the file with five records if it is missing.
        with open(FILE_NAME, "w") as file:
            file.write("\n".join(STARTER_RECORDS) + "\n")
        return STARTER_RECORDS.copy()


records = read_records()

print("Student records:")
for record in records:
    print(record)

search_id = "S3"
match = next((r for r in records if r.split(",", 1)[0] == search_id), None)
print(f"\nSearch {search_id}:", match or "Student not found")

# Append a new record.
with open(FILE_NAME, "a") as file:
    file.write("S6,Casey\n")

# Count records by reading the file.
with open(FILE_NAME, "r") as file:
    total = sum(1 for line in file if line.strip())

print("\nTotal records:", total)