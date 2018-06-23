/**
find the maximum sum bitonic Array
@author Nandakumar.K
**/
public class MainClass {
	
	public static void main(String ... args) {

        int arr[] = { 1, 15, 51, 45, 33, 100, 12, 18, 9 };
        int n = arr.length;
        System.out.println("Maximum Sum : " + MaxSumBitonic(arr, n));
	}
	
	static int MaxSumBitonic(int array[], int size) {
		int maxSum = Integer.MIN_VALUE;
		int MSIBS[] = new int[size];
		int MSDBS[] = new int[size];
		
		for (int i = 0 ; i < size ; i ++) {
			MSDBS[i] = array[i];
			MSIBS[i] = array[i];
		}
		
		for (int i = 1; i < size; i++)
			for (int j = 0 ; j < i ; j++)
				if (array[i]> array[j] && 
						MSIBS[i] < MSIBS[j] + array[i])
					MSIBS[i] = MSIBS[j] + array[i];
		
		for (int i = size - 2; i >= 0 ; i--)
			for(int j = size - 1; j > i ; j--)
				if (array[i] > array[j] && 
						MSDBS[i] < MSDBS[j] + array[i])
					MSDBS[i] = MSDBS[j] + array[i];
		
		for (int i = 0; i < size; i++)
			maxSum = Math.max(maxSum, (MSDBS[i] + MSIBS[i] - array[i]));
		
	  return maxSum;
	}
	

}
