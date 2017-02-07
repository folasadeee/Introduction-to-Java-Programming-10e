import java.util.Scanner;

public class Exercise_04_13 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

//Prompt user input
	System.out.print("Enter a letter: ");
	char letter = input.next().trim().toUpperCase().charAt(0);

//Determine if letter is consonant or vowel
	if (letter > 'Z' || letter < 'A') {
		System.out.println(letter + " is not a valid input.");
		System.exit(1);
		}

	if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
		System.out.println(letter + " is a vowel.");

	else
		System.out.println(letter + " is a consonant.");


	}
}
