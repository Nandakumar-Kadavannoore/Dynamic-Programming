/*
To find Maximum Sum Pair With difference less than K
@author Nandakumar.K
*/
public class Mainclass {
	
	public static void main(String ... args) {
	    int[] array = new int[5];
	    array[0] = 1;
	    array[1] = 4;
	    array[2] = 5;
	    array[3] = 2;
	    array[4] = 6;
	    System.out.println("The Maximum Sum Pair With difference less than K is "+maxSumPairWithDifferenceLessThanK(array, array.length, 3));

		
	}
	
	
	static int maxSumPairWithDifferenceLessThanK(int array[], int size, int k) {
		Arrays.sort(array);
		int dp[] = new int[size];
		
		dp[0] = 0;
		
		for (int i = 1; i < size; i++) {
			dp[i] = dp[i-1];
			if (array[i] - array[i-1] < k) {
				if ( i >= 2) 
					dp[i] = Math.max(dp[i], dp[i-2] + array[i] + array[i-1]);
				else
					dp[i] = Math.max(dp[i], array[i] + array[i-1]);
			}
		}
		
		return dp[size - 1];
	}
  }
