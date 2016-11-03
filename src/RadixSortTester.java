import java.util.Random;

public class RadixSortTester {

	public static void main(String[] args) {
		int[] unsorted = new int[30];
		Random rand = new Random();
		int[] sorted = new int[30];
		int[] temp = new int[10];
		
		for(int i = 0; i < unsorted.length; i++){
			unsorted[i] = rand.nextInt(1000);
			if(i < unsorted.length - 1){
				System.out.print(unsorted[i] + ", ");
			}
			else{
				System.out.print(unsorted[i]);
			}
		}

	}

}
