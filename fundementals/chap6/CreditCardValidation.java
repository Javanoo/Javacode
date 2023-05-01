//The program validates a credit card number based on the algorithm 
//developed by Hans Luhn of IBM.
import java.util.Scanner;

public class CreditCardValidation{
	//The main method 
	public static void main(String [] args){
		long creditNumber = 0L;
		System.out.print("Enter credit card number: ");
		creditNumber = new Scanner(System.in).nextLong(); 
		
		//check the validity
		if (isValid(creditNumber)) System.out.println(creditNumber + 
			" is Valid.");
		else System.out.println(creditNumber + " is inValid.");
	}
	//auxilliary methods
	//return True if the number is a valid card number
	public static boolean isValid(long Number){
		String stringNumber = "" + Number;
		if (stringNumber.length() >= 13 && stringNumber.length() <= 16){
			if ((sumOfDoubleEvenPlace(stringNumber) +
			 sumOfOddPlace(stringNumber)) % 10 == 0)
				return true;
			else
				return false;
		}
		else 
			return false;
	}
	
	//return the sum of all single digit number
	public static int sumOfDoubleEvenPlace(String Number){
		int num, sum = 0;
		for (int i = 0; i < Number.length() - 1; i += 2){
			//double every second digit
			num = Integer.parseInt("" + Number.charAt(i)) * 2;
			sum += getDigit(num);
		}
		return sum;
	}
	
	//return this number if its a single digit number
	//otherwise return the sum of the two digits
	public static int getDigit(int number){
		if (number < 10) return number;
		else {
			String doubleDigit = "" + number;
			return Integer.parseInt("" + doubleDigit.charAt(0)) + 
				Integer.parseInt("" + doubleDigit.charAt(1));
		}
	}
	
	//return sum of odd-place digits in number 
	public static int sumOfOddPlace(String number){
		int sum = 0;
		for (int i = number.length() - 1; i >= 1; i -= 2){
			//Some digits at odd places
			sum += Integer.parseInt("" + number.charAt(i));
		}
		return sum; 
	}
}
