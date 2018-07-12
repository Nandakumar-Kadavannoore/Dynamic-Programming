/*
The Sum of SubString of a number represented as a string
@author Nandakumar.K
*/

public class MainClass {
	
	public static void main(String ... args) {
	    System.out.println("The Sum of SubString of a number represented as a string is"+sumOfSubString("1254124589");
		
	}
  
  //Java program to print sum of all substring of
//a number represented as a string
static int sumOfSubString(String number) {
	int length = number.length();
	
	int sumOfDigits[] = new int[length];
	
	sumOfDigits[0] = number.charAt(0) - '0';
	int result = sumOfDigits[0];
	
	for (int i = 1; i < length; i++) {
		int numAt = number.charAt(i) - '0';
		sumOfDigits[i] = (i+1) * numAt + 10 * sumOfDigits[i-1];
		result += sumOfDigits[i];
	}
	return result;
}

}
	
