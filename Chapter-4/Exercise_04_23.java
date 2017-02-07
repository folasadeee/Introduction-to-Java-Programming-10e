/** 
*
* Write a program that reads the following information
* and prints a payroll statement:
* Employee’s name (e.g., Smith)
* Number of hours worked in a week (e.g., 10)
* Hourly pay rate (e.g., 9.75)
* Federal tax withholding rate (e.g., 20%)
* State tax withholding rate (e.g., 9%)
*
*/

import java.util.Scanner;

public class Exercise_04_23 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

// Prompt user input

	System.out.print("Enter employee's name: ");
	String name = input.nextLine();

	System.out.print("Enter number of hours worked in a week: ");
	double hoursWorked = input.nextDouble();

	System.out.print("Enter hourly pay rate: ");
	double payRate = input.nextDouble();

	System.out.print("Enter federal tax withholding rate: ");
	double federalTaxWithholdingRate = input.nextDouble();

	System.out.print("Enter state tax withholding rate: ");
	double stateTaxWithholdingRate = input.nextDouble();

// Compute values

	if (name.contains(" ")==true) {
		int space = name.indexOf(' ');
		String surname = name.substring(space + 1);
		name = surname; }

	double grossPay = payRate * hoursWorked;

	double federalWithholding = federalTaxWithholdingRate * grossPay;
	double stateWithholding = stateTaxWithholdingRate * grossPay;

	double federalWithholdingPercent = (federalTaxWithholdingRate * 100);
	double stateWithholdingPercent = (stateTaxWithholdingRate * 100);

	double totalDeduction = federalWithholding + stateWithholding;
	double netPay = grossPay - totalDeduction;

// Display values

	System.out.println("Employee Name: " + name);
	System.out.printf("Hours Worked: %.1f", hoursWorked);
	System.out.printf("\nPay Rate: $%.2f", payRate);
	System.out.printf("\nGross Pay: $%.2f", grossPay);
		System.out.printf("\nDeductions: \n");
		System.out.printf("\tFederal Withholding (%.2f%%): $%.2f", federalWithholdingPercent, federalWithholding);
		System.out.printf("\n\tState Withholding (%.2f%%): $%.2f", stateWithholdingPercent, stateWithholding);
		System.out.printf("\n\tTotal Deduction: $%.2f", totalDeduction);
		System.out.printf("\n\tNet Pay: $%.2f", netPay);

	}
}
