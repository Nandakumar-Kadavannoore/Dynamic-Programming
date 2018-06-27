/*
The maximum sum such that no three are consecutive
@author Nandakumar.k
*/
public class Example {
	
	public static void main(String ... args) {
	    int[] array = new int[5];
	    array[0] = 1;
	    array[1] = 4;
	    array[2] = 5;
	    array[3] = 2;
	    array[4] = 6;
	    System.out.println("The maximum sum such that no three are consecutive "+maxSum(array, array.length));
	}
	
	/*
	 * Find the maximum sum such that no three are consecutive
	 */
	static int maxSum(int array[], int size) {
		int sum[] = new int[size];
		if (size >= 1)
			sum[0] = array[0];
		if (size >= 2)
			sum[1] = array[0] + array[1];
		if (size > 2)
			sum[2] = Math.max(sum[1], Math.max(array[1] + array[2], array[0] + array[2]));
		for (int i = 3; i < size; i++)
			sum[i] = Math.max(Math.max(sum[i-1], sum[i-2] + array[i]), 
					array[i] + array[i-1] + sum[i-3]);
		return sum[size-1];
	}
  }
