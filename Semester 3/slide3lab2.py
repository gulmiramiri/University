import csv
from pathlib import Path

INPUT_FILE = "students.csv"
OUTPUT_FILE = "results.csv"
PASS_THRESHOLD = 50

# Create sample input, including names with spaces and punctuation.
if not Path(INPUT_FILE).exists():
    with open(INPUT_FILE, "w", newline="", encoding="utf-8") as file:
        writer = csv.writer(file)
        writer.writerow(["student_id", "name", "midterm", "final"])
        writer.writerow(["S1", "Sam Lee, Jr.", 70, 80])
        writer.writerow(["S2", "Alex O'Neil", 40, 55])
        writer.writerow(["S3", "Jamie Smith", 90, 88])

results = []

# Read records and calculate totals and averages.
with open(INPUT_FILE, "r", newline="", encoding="utf-8") as file:
    for student in csv.DictReader(file):
        midterm = float(student["midterm"])
        final = float(student["final"])
        total = midterm + final
        average = total / 2

        results.append({
            "student_id": student["student_id"],
            "name": student["name"],
            "midterm": midterm,
            "final": final,
            "total": total,
            "average": average,
        })

# Write calculated results to a new CSV file.
with open(OUTPUT_FILE, "w", newline="", encoding="utf-8") as file:
    fields = ["student_id", "name", "midterm", "final", "total", "average"]
    writer = csv.DictWriter(file, fieldnames=fields)
    writer.writeheader()
    writer.writerows(results)

print("Students who passed:")
for student in results:
    if student["average"] >= PASS_THRESHOLD:
        print(f'{student["name"]}: total {student["total"]:.0f}, '
              f'average {student["average"]:.1f}')