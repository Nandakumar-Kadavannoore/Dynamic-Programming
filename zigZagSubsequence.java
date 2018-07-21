/*
The Number of Zig Zag Subsequence in an array
@author Nandakumar.k
*/
public class MainClass {

	public static void main(String[] args) {
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 3;
		array[2] = 2;
		System.out.println("The number of Zig Zag Subsequence is "+zigZagSubsequence(array, array.length));
	
	}
	
	static int zigZagSubsequence(int array[],int size) {
		int Z[][] = new int [size][2];
		for (int i = 0; i < size; i++)
			Z[i][0] = Z[i][1] = 1;
		int result = 1;
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] < array[i] &&
						Z[i][0] < Z[j][1] + 1)
					Z[i][0] = Z[j][1] + 1;
				if (array[j] > array[i] &&
						Z[i][1] < Z[j][0] + 1)
					Z[i][1] = Z[j][0] + 1;
			}
			
			if ( result < Math.max(Z[i][0], Z[i][1])) 
				result = Math.max(Z[i][0], Z[i][1]);
		}
		
		return result;
	}
	
  }
