/*
Find the Binomial Coefficient
@author Nandakumar.K
*/
public class MainClass {
	
	public static void main(String ... args) {
	    System.out.println("The binomial Coefficient is "+binomialCoeff(10,5));	
	}
	

// find the Binomial Coefficient
static int binomialCoeff(int n, int k) {
	int coeff[][] = new int [n+1][k+1];
	
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j < Math.min(i, k); j++) {
			if (j ==0 || j == i)
				coeff[i][j] = 1;
			else
				coeff[i][j] = coeff[i-1][j-1] + coeff[i-1][j];
		}
	}
	return coeff[n][k];
}
}
