/**
 * Author: Brandon B.
 * Date: 9-10-15
 */
 
import java.util.Scanner;
public class rightTriangle {
    public static void main(String[] args) {
    	// Declare variables
    	double side1, side2, side3;
    	Scanner kbReader = new Scanner(System.in);

		// Query values from the user
		System.out.print("Enter one side: ");
		side1 = kbReader.nextDouble();

		System.out.print("Enter another side: ");
		side2 = kbReader.nextDouble();

		System.out.print("Enter one last side: ");
		side3 = kbReader.nextDouble();

		pythagorean(side1, side2, side3);
    }
    static void pythagorean(double side1, double side2, double side3) {
    	// This gets the largest number and does the pythagorean theorem.
    	// Set our variables
    	boolean isRightTriangle;
    	double largestSide, secondarySide, secondarySide2, cSquared, mathResults;

    	// Do some calculations!
    	largestSide = Math.max(side1, Math.max(side2, side3));
    	cSquared = Math.pow(largestSide, 2);

		// Run the numbers through some checks.
		if (side1 != largestSide) {
			// Side 1 is NOT the largest side.
			secondarySide = side1;
		}

		if (side2 != largestSide) {
			// Side 2 is NOT the largest side.
			if (secondarySide == null) {
				// Secondary side hasn't been set yet. (1 was the largest?)
				secondarySide = side2;
			}
			else {
				// We'll use the backup.
				secondarySide2 = side2;
		}

		if (side3 != largestSide) {
			// Side 3 is NOT the largest side.
			if (secondarySide == null) {
				// Secondary side hasn't been set yet. (1 or 2 was the largest?)
				secondarySide = side2;
			}
			else {
				// We'll use the backup.
				secondarySide2 = side2;
		}

		if ()
		
		/* if (side1 == side2) {
			// Side 1 is equal to Side 2!
			if (largestSide == side1) {
				// Side 1 and 2 are both the largest sides.
				mathResults = Math.pow(side1, 2) + Math.pow(side2, 2);
			}
		}

		else if (side1 == side3) {
			//Side 1 is equal to Side 3!
			if (largestSide == side1) {
				//Side 1 and 3 are both the largest sides.
				mathResults = Math.pow(side1, 2) + Math.pow(side3, 2);
			}
		}

		else if (side2 == side3) {
			//Side 2 is equal to Side 3!
			if (largestSide == side2) {
				//Side 2 and 3 are both the largest sides.
				mathResults = Math.pow(side1, 2) + Math.pow(side3, 2);
			}
		}

		else {
			mathResults = Math.pow
		} */
    	System.out.println(":debug: Largest side is " + largestSide + "m!");
    }
}
