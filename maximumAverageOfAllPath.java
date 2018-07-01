/*
	 * Find maximum average of all path of cost matrix
	 */
	static double maxAverageOfPath(int cost[][], int size) {
		int dp[][] = new int[size+1][size+1];
		dp[0][0] = cost[0][0];
		
		for (int i = 1; i < size; i++)
			dp[i][0] = dp[i-1][0] + cost[i][0];
		
		for (int j = 1; j < size; j++)
			dp[0][j] = dp[0][j-1] + cost[0][j];
		
		for (int i = 1; i < size; i++)
			for (int j = 1; j < size; j++)
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1] + cost[i][j]);
		
		return (double) dp[size-1][size-1]/(2*size - 1);
	}
