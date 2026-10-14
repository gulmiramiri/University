import csv
from pathlib import Path

INPUT_FILE = "students.csv"
OUTPUT_FILE = "results.csv"
PASS_THRESHOLD = 50

# Create sample input with names containing spaces and punctuation.
if not Path(INPUT_FILE).exists():
    with open(INPUT_FILE, "w", newline="", encoding="utf-8") as file:
        writer = csv.writer(file)
        writer.writerow(["student_id", "name", "midterm", "final"])
        writer.writerow(["S1", "Sam Lee, Jr.", 70, 80])
        writer.writerow(["S2", "Alex O'Neil", 40, 55])
        writer.writerow(["S3", "Jamie Smith", 90, 88])

results = []

# Read students and calculate totals and averages.
with open(INPUT_FILE, "r", newline="", encoding="utf-8") as file:
    for student in csv.DictReader(file):
        midterm = float(student["midterm"])
        final = float(student["final"])
        total = midterm + final

        results.append({
            "student_id": student["student_id"],
            "name": student["name"],
            "midterm": midterm,
            "final": final,
            "total": total,
            "average": total / 2,
        })

# Save calculated results.
fields = ["student_id", "name", "midterm", "final", "total", "average"]
with open(OUTPUT_FILE, "w", newline="", encoding="utf-8") as file:
    writer = csv.DictWriter(file, fieldnames=fields)
    writer.writeheader()
    writer.writerows(results)

# Display students whose average meets the pass threshold.
print("Students who passed:")
for student in results:
    if student["average"] >= PASS_THRESHOLD:
        print(
            f'{student["name"]}: total {student["total"]:.0f}, '
            f'average {student["average"]:.1f}'
        )