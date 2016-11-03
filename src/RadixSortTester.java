import java.util.Random;

public class RadixSortTester {

	public static void main(String[] args) {
		int[] unsorted = new int[30];
		Random rand = new Random();
		int[] sorted = new int[30];
		int[] temp = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		// Generate Random ints to fill array and print out to console
		System.out.println("Starting Array:");
		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = rand.nextInt(1000);
			if (i < unsorted.length - 1) {
				System.out.print(unsorted[i] + ", ");
			} else {
				System.out.print(unsorted[i]);
			}
		}
		System.out.println();

		// Count how many of each number have certain i digit in one's place
		for (int i = 0; i < unsorted.length; i++) {
			temp[unsorted[i] % 10] += 1;
		}

		for (int i = 0; i < temp.length; i++) {
			if (i > 0) {
				temp[i] += temp[i - 1];
			}

		}

		// Sort only one's place
		for (int i = unsorted.length - 1; i >= 0; i--) {
			temp[unsorted[i] % 10] -= 1;
			sorted[temp[unsorted[i] % 10]] = unsorted[i];
		}
		
		// Copy sorted array into unsorted for further sorting
		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = sorted[i];
		}
		
		//reset temp values to 0 to prevent out of bounds error
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;
		}

		// Count how many of each number have certain i digit in ten's place
		for (int i = 0; i < unsorted.length; i++) {
			temp[(unsorted[i] / 10) % 10] += 1;
		}

		for (int i = 0; i < temp.length; i++) {
			if (i > 0) {
				temp[i] += temp[i - 1];
			}

		}

		// Sort ten's place
		for (int i = unsorted.length - 1; i >= 0; i--) {
			temp[(unsorted[i] / 10) % 10] -= 1;
			sorted[temp[(unsorted[i] / 10) % 10]] = unsorted[i];
		}

		// Copy sorted array into unsorted for further sorting
		for (int i = 0; i < unsorted.length; i++) {
			unsorted[i] = sorted[i];
		}

		// reset temp values to 0 to prevent out of bounds error
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 0;
		}

		// Count how many of each number have certain i digit in hundred's place
		for (int i = 0; i < unsorted.length; i++) {
			temp[unsorted[i] / 100] += 1;
		}

		for (int i = 0; i < temp.length; i++) {
			if (i > 0) {
				temp[i] += temp[i - 1];
			}

		}

		// Sort hundred's place
		for (int i = unsorted.length - 1; i >= 0; i--) {
			temp[unsorted[i] / 100] -= 1;
			sorted[temp[unsorted[i] / 100]] = unsorted[i];
		}

		System.out.println("Sorted Array of 3 Digit Numbers:");
		// Display sorted hundred's place to console
		for (int i = 0; i < sorted.length; i++) {
			if (i < sorted.length - 1) {
				System.out.print(sorted[i] + ", ");
			} else {
				System.out.print(sorted[i]);
			}
		}

		System.out.println();

	}

}
