import java.util.Random;

public class RadixSortTester {

	public static void main(String[] args) {
		int[] unsorted = new int[30];
		Random rand = new Random();
		int[] sorted = new int[30];
		int[] temp = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < unsorted.length; i++){
			unsorted[i] = rand.nextInt(1000);
			if(i < unsorted.length - 1){
				System.out.print(unsorted[i] + ", ");
			}
			else{
				System.out.print(unsorted[i]);
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < unsorted.length; i++){
			temp[unsorted[i]%10] += 1;
		}
		
		for(int i = 0; i < temp.length; i++){
			if(i < temp.length - 1){
				System.out.print(temp[i] + ", ");
			}
			else{
				System.out.print(temp[i]);
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < temp.length; i++){
			if(i > 0){
				temp[i] += temp[i-1];
			}
			
		}
		
		for(int i = 0; i < temp.length; i++){
			if(i < temp.length - 1){
				System.out.print(temp[i] + ", ");
			}
			else{
				System.out.print(temp[i]);
			}
		}
		

		
		/*
		for(int i = unsorted.length - 1; i >= 0; i--){
			sorted[temp[unsorted[i]%10]] = unsorted[i];
			if(i < unsorted.length - 1){
				System.out.print(sorted[i] + ", ");
			}
			else{
				System.out.print(sorted[i]);
			}
		}
		*/

	}

}
