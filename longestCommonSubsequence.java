/*
Find the longest common subsequence
@author Nandakumar.K
*/

public class Knapsack {
	
	public static void main(String ... args) {
		char[] X = "Abcdedf".toCharArray();
		char[] Y = "bcdjhhe".toCharArray();
		
		System.out.println("The Longest Common Subsequence is "+longestCommonSubsequece(X, Y, X.length, Y.length));
	}
	
	private static int longestCommonSubsequece(char[] X, char[] Y, int firstlength, int secondLength) {
		int longest[][] = new int [firstlength][secondLength];
		for (int i = 0; i <= firstlength ; i++) {
			for (int j = 0; j <= secondLength ; j++) {
				if (i == 0 || j == 0)
					longest[i][j] = 0;
				else if (X[i-1] == Y[j-1])
					longest[i][j] = longest[i-1][j-1] + 1;
				else
					longest[i][j] = Math.max(longest[i-1][j], longest[i][j-1]);
			}
		}
		return longest[firstlength][secondLength];
	}

}
