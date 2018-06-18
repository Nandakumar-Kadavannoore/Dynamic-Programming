/*
Longest Increase SubSequence
@author Nandakumar.K
*/
class MainClass {

static int longestIncreaseSubSequence(int array[], int size) {
		int longestIncreaseSub[] = new int[size];
		int i,j, max = 0;
		for (i = 0 ; i < size; i++)
			longestIncreaseSub[i] = 1;
		for (i = 1; i < size; i++)
			for (j = 0; j < i ; j++)
				if  ( array[i] > array[j] &&
						longestIncreaseSub[i] < (longestIncreaseSub[j] + 1))
					longestIncreaseSub[i] = longestIncreaseSub[j] + 1;
		for (i = 0; i < size; i++)
			if (max < longestIncreaseSub[i])
				max = longestIncreaseSub[i];
		
		return max;
	}
  
  public static void main(String args[])
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
            int n = arr.length;
            System.out.println("Length of lis is " + longestIncreaseSubSequence( arr, n ) + "n" );
    }
    }
