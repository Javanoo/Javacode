//This program generates a three digit lottery number, and allows a user to guess the number,
//the user wins based on the following conditions.
/*1. If the user input matches the lottery number in the exact order, the award is
* $10,000.
* 2. If all digits in the user input match all digits in the lottery number, the award is
* $3,000.
* 3. If one digit in the user input matches a digit in the lottery number, the award is
* $1,000.
*/
//code
import java.util.Scanner;

public class LotteryThree{
	public static void main(String[] args){
		int LotteryNumber = (int)(Math.random() * 1000);
		int Lottery = LotteryNumber;
		
		//extract the digits
		int LotteryDigit1 = LotteryNumber % 10;
		LotteryNumber /= 10;
		int LotteryDigit2 = LotteryNumber % 10;
		int LotteryDigit3 = LotteryNumber / 10;
		
		//get user guess.
		Scanner input = new Scanner(System.in);
		int guessNumber = input.nextInt();
		int guess = guessNumber;
		
		//extract the digits
		int guessDigit1 = guessNumber % 10;
		guessNumber /= 10;
		int guessDigit2 = guessNumber % 10;
		int guessDigit3 = guessNumber / 10;
		
		System.out.println("The lottery number is : " + Lottery);
		//logic----starting matching exactly, then ignoring order just matching digit and 
		//lastly matching any one digit. 
		if (Lottery == guess)
			System.out.println("Exact match, you've won $10,000.");
		else if ((LotteryDigit1 == guessDigit1 || LotteryDigit1 == guessDigit2 || LotteryDigit1 == guessDigit3)
			&& (LotteryDigit2 == guessDigit1 || LotteryDigit2 == guessDigit2 || LotteryDigit2 == guessDigit3)
			&& (LotteryDigit3 == guessDigit1 || LotteryDigit3 == guessDigit2 || LotteryDigit3 == guessDigit3))
			System.out.println("Matches all numbers, you've won $3,000.");
		else if ((LotteryDigit1 == guessDigit1 || LotteryDigit1 == guessDigit2 || LotteryDigit1 == guessDigit3)
			|| (LotteryDigit2 == guessDigit1 || LotteryDigit2 == guessDigit2 || LotteryDigit2 == guessDigit3)
			|| (LotteryDigit3 == guessDigit1 || LotteryDigit3 == guessDigit2 || LotteryDigit3 == guessDigit3))
			System.out.println("Matches one number, you've won $1,000.");
		else 
			System.out.println("Sorry, does not match.");
	}
	//end of method
}
