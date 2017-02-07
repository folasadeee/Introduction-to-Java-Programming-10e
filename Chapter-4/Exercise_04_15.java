import java.util.Scanner;

public class Exercise_04_15 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Prompt user input
	System.out.print("Enter a letter: ");
	char letter = input.next().trim().toUpperCase().charAt(0);

// Compute corresponding number

	if (letter == 'A' || letter == 'B' || letter == 'C')
		System.out.println("The corresponding number of " + letter + " is: 2");

	if (letter == 'D' || letter == 'E' || letter == 'F')
		System.out.println("The corresponding number of " + letter + " is: 3");

	if (letter == 'G' || letter == 'H' || letter == 'I')
		System.out.println("The corresponding number of " + letter + " is: 4");

	if (letter == 'J' || letter == 'K' || letter == 'L')
		System.out.println("The corresponding number of " + letter + " is: 5");

	if (letter == 'M' || letter == 'N' || letter == 'O')
		System.out.println("The corresponding number of " + letter + " is: 6");

	if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')
		System.out.println("The corresponding number of " + letter + " is: 7");

	if (letter == 'T' || letter == 'U' || letter == 'V')
		System.out.println("The corresponding number of " + letter + " is: 8");

	if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
		System.out.println("The corresponding number of " + letter + " is: 9");

	else if (letter > 'Z' || letter < 'A') {
		System.out.println(letter + " is an invalid input.");
		System.exit(1);
		}

	}
}
