/* RecursionSum.java - program to compute the sum of all values in an array using recursion
 * @author - Kimberly Ramos
 * @date - 27 Nov 23
 * 
 */
public class RecursionSum {
	// Recursive method to add values in an array
	public static int Sum(int [] x, int y){
	if (y == 0) { 
		// returns value at index zero when y is zero
		return x[0];
	}
	else {
		// uses recursion to sum current element with rest of array
		return x[y] + Sum(x, y - 1);
	}
	}
	
	public static void main (String args[]) {
		// example of an array
		int[] x = { 1, 2, 3, 4, 5};
		// calculate sum of array using Sum method
		int Sum = Sum(x, x.length - 1);
		System.out.println("The sum of the values is: " + Sum); // prints result
		System.out.println("Expected value: 15");
	}
}


