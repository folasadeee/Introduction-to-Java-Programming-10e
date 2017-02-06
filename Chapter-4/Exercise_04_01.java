/** Write a program that prompts the user to enter
*   the length from the center of a pentagon to a
*   vertex and computes the area of the pentagon. */

import java.util.Scanner;

public class Exercise_04_01 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Prompt user to enter the length from the center of pentagon

	System.out.print("Enter the length from the center of a pentagon to a vertex: ");
	double lengthToVertex = input.nextDouble();

// Compute length of side

	double side = 2 * (lengthToVertex) * Math.sin(Math.PI / 5);

// Compute area of pentagon

	double area = ( 5 * Math.pow(side, 2) ) / ( 4 * Math.tan(Math.PI / 5) );

// Display result

	System.out.printf("The area of the pentagon is: %5.2f", area);

	}
}
