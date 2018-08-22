import java.io.*;
 
class Mainclass {
 
    static int MAX = 100;
 
    // Fills table C[n+1][k+1] such that C[i][j]
    // represents table of binomial coefficient
    // iCj
    static void binomialCoeff(int C[][], int n, int k)
    {
 
        // Calculate value of Binomial Coefficient
        // in bottom up manner
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++)
            {
 
                // Base Cases
                if (j == 0 || j == i)
                    C[i][j] = 1;
 
                // Calculate value using previously
                // stored values
                else
                    C[i][j] = C[i - 1][j - 1] + 
                                         C[i - 1][j];
            }
        }
    }
 
    // Return Recontres number D(n, m)
    static int RencontresNumber(int C[][], int n, int m)
    {
        int dp[][] = new int[n + 1][m + 1];
 
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j <= i) {
 
                    // base case
                    if (i == 0 && j == 0)
                        dp[i][j] = 1;
 
                    // base case
                    else if (i == 1 && j == 0)
                        dp[i][j] = 0;
 
                    else if (j == 0)
                        dp[i][j] = (i - 1) * (dp[i - 1][0] 
                                           + dp[i - 2][0]);
                    else
                        dp[i][j] = C[i][j] * dp[i - j][0];
                }
            }
        }
 
        return dp[n][m];
    }
 
    // Driver Program
    public static void main(String[] args)
    {
        int n = 7, m = 2;
 
        int C[][] = new int[MAX][MAX];
        binomialCoeff(C, n, m);
 
        System.out.println(RencontresNumber(C, n, m));
    }
}
