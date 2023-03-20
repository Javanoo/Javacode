//attempting to answer question that follows
/*(Financial application: compare loans with various interest rates) Write a 
* program that lets the user enter the loan amount and loan period in number 
* of years and displays the monthly and total payments for each interest 
* rate starting from 5% to 8%, with an increment of 1/8.
*/
//code 
import java.util.Scanner;

public class LoansWithInterest {
	public static void main (String[] args){
		final double rate = 0.125;
		float firstRate =  5.0f;
		float lastRate  = 8.0f;
		Scanner input = new Scanner (System.in);
		System.out.print("Please Enter loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Loan period: ");
		double loanPeriod = input.nextDouble();
		double monthlyPayment = 0, totalPayment, monthlyRate = rate / 1200;
		System.out.println("......................................................");
		//logic
		System.out.printf("\n%-19s %-19s %-10s", "Interest Rate", "Monthly Payment",
			"Total Payment\n");
		while (firstRate <= lastRate){
			monthlyPayment +=  loanAmount * monthlyRate / (1 - 1 / Math.pow(
				1 + monthlyRate, loanPeriod * 12));
			totalPayment = monthlyPayment * loanPeriod * 12;
			System.out.printf("%.3f%-14c %-19.2f %-10.2f\n", firstRate, '%', 
				monthlyPayment, totalPayment);
			firstRate += rate;
		}
	}
}
