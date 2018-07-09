/*
The Minimum number of jumps to reach end of array
@author Nandakumar.K
*/
public class MainClass {
	
	public static void main(String ... args) {
	    int[] array = new int[5];
	    array[0] = 1;
	    array[1] = 4;
	    array[2] = 5;
	    array[3] = 2;
	    array[4] = 6;
	    System.out.println("Minimum number of jumps to reach end is "+minJumps(array, array.length));
		
	}
  
  static int minJumps(int[] array, int size){
	int jumps[] = new int[size];
	
	if ( size == 0 || array[0] == 0)
		return Integer.MAX_VALUE;
	
	jumps[0] = 0;
	
	for (int i = 1 ; i < size; i++) {
		jumps[i] = Integer.MAX_VALUE;
		for (int j = 0; j < i; j++) {
			if (i <= j + array[j] && jumps[j] != Integer.MAX_VALUE) {
				jumps[i] = Math.min(jumps[i], jumps[i] + 1);
				break;
			}
		}
	}
	return jumps[size - 1];
}
}
	
  }
