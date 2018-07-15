/**
Minimum number of trails required for egg dropping trails
@author Nandakumar.k
**/
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Minimum number of trails is "+eggDrop(3,4));
		
	}
	
	static int eggDrop(int n,int k) {
		int eggFloor[][] = new int [n+1][k+1];
		int result;
		int i,j,x;
		
		for (i = 1; i <= n; i++) {
			eggFloor[i][1] = 1;
			eggFloor[i][0] = 0;
		}
		
		for (j = 1; j <= k; j++) {
			eggFloor[1][j] = j;
		}
		
		for (i = 2; i <= n; i++) {
			for (j = 2; j <= k ; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for ( x = 1; x <= j; j++) {
					result = 1 + Math.max(eggFloor[i][x-1], eggFloor[i][j-x]);
					if ( result < eggFloor[i][j])
						eggFloor[i][j] = result;
				}
			}
		}
		return eggFloor[n][k];
	}

}
