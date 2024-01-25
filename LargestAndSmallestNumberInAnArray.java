package Programs.java;

public class LargestAndSmallestNumberInAnArray {

	public static void main(String[] args) {
		int number[] = new int[] { 32, 43, 53, 54, 32, 65, 63, 98, 43, 23 };
		int smallNumber = number[0];
		int largeNumber = number[0];
		
		for(int i = 1 ; i < number.length ; i++ ) {
			if(number[i] > largeNumber) {
				largeNumber = number[i];
			}
			else if(number[i] < smallNumber) {
				smallNumber = number[i];
			}
		}
		System.out.println("Largest Number is: " + largeNumber);
		System.out.println("Smallest Number is: " + smallNumber);

	}

}
