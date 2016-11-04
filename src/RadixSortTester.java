import java.util.Arrays;
import java.util.Random;

public class RadixSortTester {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 100000;
		int[] toSort = new int[ARRAY_SIZE];
		Random rand = new Random();
		int upperBound = 100000;
		int digits = Integer.toString(upperBound).length() - 1;
		int[] benchmark = new int[ARRAY_SIZE];
		long startTime = 0;
		long endTime = 0;

		// Generate Random ints to fill array
		for (int i = 0; i < toSort.length; i++) {
			toSort[i] = rand.nextInt(upperBound);
			//fill another array to compare how long each sort takes
			benchmark[i] = toSort[i];
		}

		
		//Call RadixSort and mark times
		startTime = System.currentTimeMillis();
		RadixSort.sort(toSort, digits);
		endTime = System.currentTimeMillis();
		
		/*
		System.out.println("Sorted Array Using Radix Sort: ");
		for (int i = 0; i < toSort.length; i++) {
			if (i < toSort.length - 1) {
				System.out.print(toSort[i] + ", ");
			} else {
				System.out.print(toSort[i]);
			}
		}
		*/
		
		System.out.println("\nIt took " + (endTime - startTime) +
				" milliseconds to sort the array using the Radix sort.");
		
		
		
		//Call Arrays.sort() and mark times
		startTime = System.currentTimeMillis();
		Arrays.sort(benchmark);
		endTime = System.currentTimeMillis();
		
		
		System.out.println("\nIt took " + (endTime - startTime) +
				" milliseconds to sort the array using Arrays.sort().");
		

	}

}
