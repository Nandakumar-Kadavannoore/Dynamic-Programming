/*
Find the length of maximum increasing subsequence
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
	    System.out.println("The Maximum Increase Subsequence length is "+maxSumIS(array, array.length));

		
	}
	
	static int maxSumIS(int array[], int size) {
		int i,j, max = 0;
		int MSIS[] = new int [size];
		
		for ( i = 0; i < size; i++)
			MSIS[i] = array[i];
		
		for ( i = 1; i < size; i++)
			for ( j = 0; j < i; j++)
				if (array[i] > array[j] &&
						MSIS[i] < MSIS[j] + array[i])
					MSIS[i] = MSIS[j] + array[i];
		
		for ( i = 0 ; i < size; i++)
			if ( max < MSIS[i])
				max  = MSIS[i];
		
		return max;
	}
	}
