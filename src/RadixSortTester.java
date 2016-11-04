import java.util.Random;

public class RadixSortTester {

	public static void main(String[] args) {
		int[] toSort = new int[30];
		Random rand = new Random();
		RadixSort test = new RadixSort();
		int upperBound = 100000;
		int digits = Integer.toString(upperBound).length() - 1;

		// Generate Random ints to fill array and print out to console
		System.out.println("Starting Array:");
		for (int i = 0; i < toSort.length; i++) {
			toSort[i] = rand.nextInt(100000);
			if (i < toSort.length - 1) {
				System.out.print(toSort[i] + ", ");
			} else {
				System.out.print(toSort[i]);
			}
		}
		System.out.println();

		test.sort(toSort, digits);

		System.out.println("Sorted Array: ");
		for (int i = 0; i < toSort.length; i++) {
			if (i < toSort.length - 1) {
				System.out.print(toSort[i] + ", ");
			} else {
				System.out.print(toSort[i]);
			}
		}

	}

}
