import sys

# Part 1: Input from a File
# These lists hold the data you will base your calculations off of
# Note: The data is organized by age to facilitate simple median calculation for age
names = []
ages = []
incomes = []
yearsWorking = []

file_path = "WorkData.txt"
try:
    with open(file_path, 'r') as file:
        for line in file:
            line_parts = line.split()
            names.append(line_parts[0])
            ages.append(int(line_parts[1]))
            incomes.append(int(line_parts[2]))
            yearsWorking.append(int(line_parts[3]))
except FileNotFoundError as fnfe:
    print(fnfe)

# Part 2: Mean, Median, and Mode
# Mean age
sumAges = sum(ages)
meanAge = sumAges / len(ages)

# Median age
sortedAges = sorted(ages)
size = len(sortedAges)
middleEntry = size // 2
if size % 2 == 0:
    medianAge = (sortedAges[middleEntry - 1] + sortedAges[middleEntry]) / 2
else:
    medianAge = sortedAges[middleEntry]

# Mode age
counts = {}
maxCount = 0
modeAge = None
for age in ages:
    counts[age] = counts.get(age, 0) + 1
    if counts[age] > maxCount:
        maxCount = counts[age]
        modeAge = age

print(f"Mean age: {meanAge:.2f}")
print(f"Median age: {medianAge}")
print(f"Mode age: {modeAge}")

# Part 3: Random Variables
bikesSold = [6, 42, 98, 106, 79, 17, 10, 5, 0, 1, 1]

# Probability of three bikes being sold in a day
totalEntries = sum(bikesSold)
probabilityThreeBikes = bikesSold[3] / totalEntries

# Probability of five or more bikes being sold in a day
probabilityFiveOrMoreBikes = sum(bikesSold[5:]) / totalEntries

print(f"\nProbability of three bikes being sold in a day: {probabilityThreeBikes:.3f}")
print(f"Probability of five or more bikes being sold in a day: {probabilityFiveOrMoreBikes:.3f}")
