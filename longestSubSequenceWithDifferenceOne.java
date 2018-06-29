/*
The longest subsequence such that the difference between adjacent elements of the subsequence is one.
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
	    System.out.println("the longest subsequence such that the difference between adjacent elements of the subsequence is on "+longestSubSequenceWithDifferenceOne(array, array.length));
	}
	
	/*
	 * find the longest subsequence such that the difference between adjacent 
	 * elements of the subsequence is one.
	 */
	static int longestSubSequenceWithDifferenceOne(int array[], int size) {
		int dp[] = new int[size];
		for (int i = 0; i < size; i++)
			dp[i] = 1;
		
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((array[i] == array[j] + 1) ||
						(array[i] == array[j] - 1)) {
					dp [i] = Math.max(dp[i], dp[j] + 1);
				}
					
			}
		}
		
		int result = 1;
		for (int i = 0; i < size; i++)
			if (result < dp[i])
				result = dp[i];
		
		return result;
	}
}
