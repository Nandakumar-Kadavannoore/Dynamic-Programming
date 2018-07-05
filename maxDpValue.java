/**
To find the maximum value computed by 2,3,4,5
@author Nandakumar.K
**/
public class MainClass {
	
	public static void main(String ... args) {
	    int[] array = new int[5];
	    array[0] = 1;
	    array[1] = 4;
	    array[2] = 5;
	    array[3] = 2;
	    array[4] = 6;
	    System.out.println("The Maximum value of "+maxDP(array.length));
		
	}
	
	
static int maxDP(int size) {
	int result[] = new int[size + 1];
	result[0] = 0;
	result[1] = 1;
	
	for (int i = 2; i <= size; i++)
		result[i] = Math.max(i, (result[i/2] + result[i/3]
				+ result[i/4] + result[i/5] ));
	
	return result[size];
}
}
