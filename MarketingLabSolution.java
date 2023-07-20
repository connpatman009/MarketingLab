import java.util.*;
import java.io.*;

public class MarketingLabSolution {
	public static void main(String[] args) {
		/* ---------- Part 1: Input from a File ---------- */
		// These linked lists hold the data you will base your calcluations off of
		// Note: The data is organized by age to facilitate simple median calculation for age
		LinkedList<String> names = new LinkedList<String>();
		LinkedList<Integer> ages = new LinkedList<Integer>();
		LinkedList<Integer> incomes = new LinkedList<Integer>();
		LinkedList<Integer> yearsWorking = new LinkedList<Integer>();

		// Import data from the WorkData.txt file
		Scanner fReader = new Scanner(System.in);
		File dataFile = new File("WorkData.txt");
		try {
			fReader = new Scanner(dataFile);
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
		}
		for (int i = 0; fReader.hasNextLine(); i++) {
			String fLine = fReader.nextLine();
			/* --- Student's TODO 1: Extract information from the file and store in the linked lists --- */
			String[] lineParts = fLine.split(" ");
			names.push(lineParts[0]);
			ages.push(Integer.parseInt(lineParts[1]));
			incomes.push(Integer.parseInt(lineParts[2]));
			yearsWorking.push(Integer.parseInt(lineParts[3]));
			/* --- End of TODO 1 Example --- */
		}

		/* ---------- Part 2: Mean, Median, and Mode ---------- */
		// Could ask questions like:
		//		What age group should you target (based on mean, median, and mode)?
		//		What is the average salary for someone younger than 35?
		//		On average how many years do people work to make more than $40,000 a year?

		/* --- Student's TODO 2 Example --- */
		// Mean
		int sumAges = 0;
		for (int i = 0; i < ages.size(); i++) {
			sumAges += ages.get(i);
		}
		double meanAge = (double) sumAges / ages.size();
		// Median
		int middleEntry;
		if (ages.size() % 2 == 0) {
			middleEntry = ages.size() / 2;
		}
		else {
			middleEntry = (ages.size() + 1) / 2;
		}
		int medianAge = ages.get(middleEntry);
		// Mode
		int modeAge = -1;
		int countModeAge = -1;
		for (int i = 0; i < ages.size(); i++) {
			int count = 0;
			int currentAge = ages.get(i);
			for (int j = i; j < ages.size(); j++) {
				if (currentAge == ages.get(j)) {
					count++;
				}
			}

			if (count > countModeAge) {
				countModeAge = count;
				modeAge = currentAge;
			}
		}
		System.out.printf("Mean age: %.2f\n", meanAge);
		System.out.println("Median age: " + medianAge);
		System.out.println("Mode age: " + modeAge);

		/* Personal note: The other two can be done in the same way */
		/* ---------- End of TODO 2 Example ---------- */

		/* ---------- Part 3: Random Variables ---------- */
		// Could ask questions like:
		// 		Probability of selling 3 bikes in a day
		// 		Probability of selling more than 5 bikes in a day
		// 		Probability of selling less than 1000 bikes in a year

		// Below is the representation of a random variable of bikes sold in a day throughout the year
		// The index represents how many bikes were sold, for example (X=0, 6).
		int[] bikesSold = {6, 42, 98, 106, 79, 17, 10, 5, 0, 1, 1};

		/* ---------- Student's TODO 3 Example ---------- */
		int totalEntries = 0;
		for (int i = 0; i < bikesSold.length; i++) {
			totalEntries += bikesSold[i];
		}
		double probabilityThreeBikes = (double) bikesSold[3] / totalEntries;
		double probabilityFiveOrMoreBikes = (double) (bikesSold[5] + bikesSold[6] + bikesSold[7]
													+ bikesSold[8] + bikesSold[9] + bikesSold[10]) / totalEntries;
		// I forget how to do the cumulative probabilities for random variables, but that would go here

		System.out.printf("\nProbability of three bikes being sold in a day: %.3f\n", probabilityThreeBikes);
		System.out.printf("Probability of five or more bikes being sold in a day: %.3f\n", probabilityFiveOrMoreBikes);
		/* ---------- End of TODO 3 Example ---------- */
	}
}