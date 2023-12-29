/* SquareRootComputer.java - Class that computes square roots using recursion
 * @author - Kimberly Ramos
 * @date - 27 Nov 23
 */
import java.util.Scanner; // Scanner
/**
 * Greek's method to approximate the square root of a given number.
 */
public class SquareRootComputer {
	public static void main(String[] args) {
		// this is your tester
		// read a value from the user and print the results 
		// along with expected value
		Scanner scan = new Scanner(System.in);
		System.out.println("This program will give you the square root of a number");
		System.out.println("Enter a number: ");
		double n = scan.nextDouble(); // Scans user input
		SquareRootComputer comp = new SquareRootComputer();
		System.out.println("The square root of " + n + " is: " + comp.squareRoot(n));
		System.out.println("Expected value: 5.19615");

		scan.close(); // close scanner
		
	}

	public double squareRoot(double x) {
		// from this method come up with a guess
		// and then make the call to the recursive method
		// squareRootGuesser()
		double guess = squareRootGuess(x,2);
		return guess;
	}

	private static double squareRootGuess(double x, double g) {
		// recursive method to compute the square root of x
		// you will need to have a base case and a recursive case
		// in this method
		if (g* g-x <= 0.0001 && x-g*g <= 0.0001) {
			return g; 
		}
			else {
				// recursive call and updates guess  
				g = (g + (x/g))/2;
				return squareRootGuess(x, g);
			}
		
	}
}
