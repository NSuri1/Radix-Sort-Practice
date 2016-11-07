import java.util.Arrays;
import java.util.Random;

public class RadixSortTester {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 10000000;
		int[] toSort = new int[ARRAY_SIZE];
		Random rand = new Random();
		int upperBound = 100000;
		int digits = Integer.toString(upperBound).length() - 1;
		int[] benchmark = new int[ARRAY_SIZE];
		long startTime = 0;
		long endTime = 0;
		
		double radixSum = 0;
		double arraySortSum = 0;

		//Run 100 times to get average
		for (int j = 0; j < 100; j++) {
			// Generate Random ints to fill array
			for (int i = 0; i < toSort.length; i++) {
				toSort[i] = rand.nextInt(upperBound);
				// fill another array to compare how long each sort takes
				benchmark[i] = toSort[i];
			}

			// Call RadixSort and mark times
			startTime = System.currentTimeMillis();
			RadixSort.sort(toSort, digits);
			endTime = System.currentTimeMillis();
			
			radixSum += (endTime - startTime);

			/*
			 * System.out.println("Sorted Array Using Radix Sort: "); for (int i
			 * = 0; i < toSort.length; i++) { if (i < toSort.length - 1) {
			 * System.out.print(toSort[i] + ", "); } else {
			 * System.out.print(toSort[i]); } }
			 */

			

			// Call Arrays.sort() and mark times
			startTime = System.currentTimeMillis();
			Arrays.sort(benchmark);
			endTime = System.currentTimeMillis();
			
			arraySortSum += (endTime - startTime);

			System.out.println("Finished iteration " + (j + 1));
		}
		
		System.out.println(
				"\nIt took and average of " + radixSum/100 + " milliseconds to sort the array using the Radix sort.");
		
		System.out.println(
				"\nIt took " + arraySortSum/100 + " milliseconds to sort the array using Arrays.sort().");


	}

}
