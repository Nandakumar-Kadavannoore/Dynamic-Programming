int countFriendsPairings(int n) 
{ 
    int dp[n + 1]; 
  
    // Filling dp[] in bottom-up manner using 
    // recursive formula explained above. 
    for (int i = 0; i <= n; i++) 
    { 
        if (i <= 2) 
        dp[i] = i; 
        else
        dp[i] = dp[i - 1] + (i - 1) * dp[i - 2]; 
    } 
  
    