/*
To find nth stern's diatomic series
@author Nandakumar.K
*/
public class MainClass {
	
	public static void main(String ... args) {
	    System.out.println("The nth element of stern's diatomic series is "+findSternDiatomic(5));
		
	}
	
//Java program to find the nth element 
//of Stern's Diatomic Series
static int findSternDiatomic(int n) {
	int dp[] = new int[n+1];
	dp[0] = 0;
	dp[1] = 1;
	for (int i = 2; i <= n; i++) {
		if (i%2 == 0)
			dp[i] = dp[i/2];
		else
			dp[i] = dp[(i-1)/2] + dp[(i+2)/2];
	}
	return dp[n];
}

}
