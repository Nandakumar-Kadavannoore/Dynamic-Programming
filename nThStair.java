/**
To find nth-series stair using size of 1, 2 or 3
@author Nandakumar.K
**/
Class MainClass {

   public static void main(String args...) {
    System.out.println("The Number of Count  of Ways "+countWays(5));
   }
   
   public static int countWays(int n)
    {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
 
        for (int i = 3; i <= n; i++)
            res[i] = res[i - 1] + res[i - 2]
                                + res[i - 3];
 
        return res[n];
    }
 
}
