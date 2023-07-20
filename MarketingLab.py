# Part 1: Input from a File
# These lists hold the data you will base your calculations off of
# Note: The data is organized by age to facilitate simple median calculation for age
names = []
ages = []
incomes = []
years_working = []

# Import data from the WorkData.txt file
data_file = "WorkData.txt"
try:
    with open(data_file, "r") as file:
        for line in file:
            # TODO: Extract information from the file and store it in the lists
            pass
except FileNotFoundError as fnfe:
    print(fnfe)

# Part 2: Mean, Median, and Mode
# Could ask questions like:
#   What age group should you target (based on mean, median, and mode)?
#   What is the average salary for someone younger than 35?
#   On average, how many years do people work to make more than $40,000 a year?

# Part 3: Random Variables
# Could ask questions like:
#   Probability of selling 3 bikes in a day
#   Probability of selling more than 5 bikes in a day
#   Probability of selling less than 1000 bikes in a year

# Below is the representation of a random variable of bikes sold in a day throughout the year
# The index represents how many bikes were sold, for example (X=0, 6).
bikes_sold = [6, 42, 98, 106, 79, 17, 10, 5, 0, 1, 1]