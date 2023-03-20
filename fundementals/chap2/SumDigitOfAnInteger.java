//This program addresses the folloqing question.
/*(Sum the digits in an integer) Write a program that reads an integer between 0 and
* 1000 and adds all the digits in the integer. For example, if an integer is 932, the
* sum of all its digits is 14.
*/
import java.util.Scanner;
//using modulo to extract the numbers within the intiger
public class SumDigitOfAnInteger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		short num, firstNum, secondNum , thirdNum, remainder;
		//prompt user
		System.out.print("Please enter a number between 0 and 999 : " );
		num = input.nextShort();
		//extract the numbers
		firstNum = (short)(num % 10);
		num /= 10;
		secondNum = (short)(num % 10);
		num /= 10;
		thirdNum = num;
		
		System.out.println("The sum of the digits found within the number is : " + (firstNum + secondNum + thirdNum));
	}
} 
