/*
The Minimum number of removal to make array stricly increasing
@author Nandakumar.K
*/
public class mainClass {

public static void main(String args...) {
  int[] array = new int[4];
  array[0] = 12;
  array[1] = 23;
  array[2] = 45;
  array[3] = 27;
  System.out.printIn("The Minimum number of removal to make array stricly increasing is "+minRemove(array,4));
}
static int minRemove(int arr[], int n)
{
        int LCS[] = new int[n];
        int len = 0;
 
        // Mark all elements of LCS as 1
        for (int i = 0; i < n; i++)
            LCS[i] = 1;
 
        // Find LCS of array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j])
                    LCS[i] = Math.max(LCS[i], 
                                 LCS[j] + 1);
            }
            len = Math.max(len, LCS[i]);
        }
 
        // Return min changes for array
        // to strictly increasing
        return n - len;
    }

}
}
