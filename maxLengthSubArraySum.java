/*
To find Maximum length of the largest contiguous array sum 
@author Nandakumar.K
*/
public class MainClass {
	
	public static void main(String ... args) {
	    int[] array = new int[5];
	    array[0] = 1;
	    array[1] = 4;
	    array[2] = 5;
	    array[3] = 2;
	    array[4] = 6;
	    System.out.println("The Maximum length of the largest contiguous array sum is "+maxSubArraySum(array, array.length));
		
	}	
	
	// Java program to print length of the largest 
	// contiguous array sum
	static int maxSubArraySum(int array[], int size) {
		int maximumSum = Integer.MAX_VALUE;
		int maximumEndPoint = 0, start = 0, end = 0, sum = 0;
		
		for (int i = 0; i < size; i++) {
			maximumEndPoint += array[i];
			
			if (maximumSum < maximumEndPoint) {
				maximumSum = maximumEndPoint;
				start = sum;
				end = i;
			}
			
			if (maximumEndPoint < 0) {
				maximumEndPoint = 0;
				sum = i + 1;
			}
		}
		
		return (end - start + 1);
	}
	
