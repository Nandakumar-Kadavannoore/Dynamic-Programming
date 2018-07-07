/**
To find probability to reach N with P probability to take 2 steps (1-P) to take 3 steps
@author Nandakumar.K
**/
public class MainClass {
	
	public static void main(String ... args) {
	    System.out.println("The Probability of "+findProbability(10,0.66F));
	}
	
	
	 //To find probability to 
	// reach N with P probability to take
	// 2 steps (1-P) to take 3 steps
static float findProbability(int size, float probability) {
	double dp[] = new double[size + 1];
	dp[0] = 1;
	dp[1] = 0;
	dp[2] = probability;
	dp[3] = 1 - probability;
	
	for (int i = 4; i <= size; i++)
		dp[i] = (probability) * dp[i-2] +
		          (1-probability) * dp[i-3];
	
	return ((float) dp[size]);
}

}
