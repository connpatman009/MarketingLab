import java.util.*;
import java.io.*;

public class MarketingLab {
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
			/* --- TODO 1: Extract information from the file and store in the linked lists --- */
		}

		/* ---------- Part 2: Mean, Median, and Mode ---------- */
		// Could ask questions like:
		//		What age group should you target (based on mean, median, and mode)?
		//		What is the average salary for someone younger than 35?
		//		On average how many years do people work to make more than $40,000 a year?


		/* ---------- Part 3: Random Variables ---------- */
		// Could ask questions like:
		// 		Probability of selling 3 bikes in a day
		// 		Probability of selling more than 5 bikes in a day
		// 		Probability of selling less than 1000 bikes in a year

		// Below is the representation of a random variable of bikes sold in a day throughout the year
		// The index represents how many bikes were sold, for example (X=0, 6).
		int[] bikesSold = {6, 42, 98, 106, 79, 17, 10, 5, 0, 1, 1};
	}
}