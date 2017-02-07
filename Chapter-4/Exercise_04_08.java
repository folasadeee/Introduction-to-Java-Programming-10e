/**
*
*  (Find the character of an ASCII code) Write a program that receives an ASCII code
*  (an integer between 0 and 127) and displays its character.
*
*/

import java.util.Scanner;

public class Exercise_04_08 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

//Prompt user to enter value for ASCII code

	System.out.print("Enter value for ASCII code: ");
	int value = input.nextInt();

	if (value > 127) {
		System.out.println("Invalid input. Please enter an integer between 0 and 127.");
		System.exit(0);
		}

	else {
		char ascii = (char)value;
		System.out.println("Value " + value + " equates to " + ascii + " in ASCII.");
		}
	}
}