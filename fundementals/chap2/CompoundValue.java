//This program addresses the problem of the following question
/* (Financial application: compound value) Suppose you save $100 each month
* into a savings account with the annual interest rate 5%. Thus, the monthly inter-
* est rate is 0.05/12 = 0.00417. After the first month, the value in the account
* becomes
* 100 * (1 + 0.00417) = 100.417
* After the second month, the value in the account becomes
* (100 + 100.417) * (1 + 0.00417) = 201.252
* After the third month, the value in the account becomes
* (100 + 201.252) * (1 + 0.00417) = 302.507
* and so on.
* Write a program that prompts the user to enter a monthly saving amount and
* displays the account value after the sixth month.
*/
import java.util.Scanner;
//program implementation
public class CompoundValue{
	public static void main(String[] args){
		double amount, rate = 0.00417, balance;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter monthly Saving amount : ");
		amount = input.nextDouble();
		//first month
		balance = amount * (1 + rate);
		//second month
		balance = (amount + balance) * (1 + rate);
		//third month
		balance = (amount + balance) * (1 + rate);
		//fourth month
		balance = (amount + balance) * (1 + rate);
		//fifth month
		balance = (amount + balance) * (1 + rate);
		//sixth month
		balance = (amount + balance) * (1 + rate);
		System.out.println("After the sixth month, the account balance is $" + (int)(balance * 100)/100.0);
	}
}
