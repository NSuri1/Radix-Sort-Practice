
public class RadixSort {

	public static void sort(int[] toSort, int largestDigit) {
		int counter = 0;
		int divisor = 1;
		int[] sorted = new int[toSort.length];
		int[] temp = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		while (counter < largestDigit) {

			// Count how many of each number have certain digit
			for (int i = 0; i < toSort.length; i++) {
				temp[(toSort[i] / divisor) % 10] += 1;
			}

			for (int i = 0; i < temp.length; i++) {
				if (i > 0) {
					temp[i] += temp[i - 1];
				}

			}

			// Sort
			for (int i = toSort.length - 1; i >= 0; i--) {
				temp[(toSort[i] / divisor) % 10] -= 1;
				sorted[temp[(toSort[i] / divisor) % 10]] = toSort[i];
			}

			// Copy sorted array into toSort for further sorting
			for (int i = 0; i < toSort.length; i++) {
				toSort[i] = sorted[i];
			}

			// reset temp values to 0 to prevent out of bounds error
			for (int i = 0; i < temp.length; i++) {
				temp[i] = 0;
			}

			divisor *= 10;
			counter++;
		}
	}
}
