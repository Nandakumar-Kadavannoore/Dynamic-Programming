/*
To find the longest palindrome subsequence
@author Nandakumar.K
*/

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Longest Palindrome Subsequence is "+longestPalindromeSubsequence("stringofstrings"));
	
	}
	
	static int longestPalindromeSubsequence(String subString) {
		int size = subString.length();
		int i,j,count;
		int longest[][] = new int[size][size];
		
		for (i = 0; i < size; i++)
			longest[i][i] = 1;
		
		for (count = 2; count <= size; count++) {
			for (i = 0; i < size - count + 1; i++) {
				j = i + count - 1;
				if (subString.charAt(i) == subString.charAt(j) && count == 2) {
					longest[i][i] = 2;
				}else if (subString.charAt(i) == subString.charAt(j)) 
					longest[i][j] = longest[i+1][j-1] + 2;
				else
					longest[i][j] = Math.max(longest[i][j-1], longest[i+1][j]);
			}
		}
		
		return longest[0][size-1];
	}

}
