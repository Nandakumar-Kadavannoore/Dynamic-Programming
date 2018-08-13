/**
The Minimum Cost for Steps
@author Nandakumar.K
**/
public class MainClass {

	public static void main(String[] args) {
		int cost[] = {3,6,8,12,28};
		System.out.println("The Minimum Cost is "+minimumCost(cost, cost.length));
	}

	static int minimumCost(int cost[], int size)  {
		int dp[] = new int[size];
		if (size == 1) {
			return cost[0];
		}
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < size; i++) {
			dp[i] = Math.min(dp[i-1], dp[i-2] + cost[i]);
		}
		return Math.min(dp[size - 1], dp[size - 2]);
	}
	
}
