import java.util.Scanner;

public class Exercise_04_16 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int generatedNumber = (int)(Math.random() * (90 - 65 + 1) + 65);
	char correspondingLetter = (char)generatedNumber;

	System.out.println(correspondingLetter + "=" + generatedNumber);

	}
}
