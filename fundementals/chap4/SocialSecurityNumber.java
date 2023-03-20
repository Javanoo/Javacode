//This program attempts to validate social security number as per the question 
//below.
/*(Check SSN) Write a program that prompts the user to enter a Social Security
* number in the format DDD-DD-DDDD, where D is a digit. Your program should
* check whether the input is valid.
*/
//code
import java.util.Scanner;

public class SocialSecurityNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter social security number in the " + 
		"form (DDD-DD-DDDD): ");
		String socialSecurityNumber = input.nextLine();
		
		if (socialSecurityNumber.length() != 11){ System.out.println( "" +
			socialSecurityNumber + " is not a valid  security number.");
			System.exit(1);
		}
		else if (socialSecurityNumber.charAt(3) != '-' || 
		socialSecurityNumber.charAt(6) != '-'){ System.out.println( "" +
			socialSecurityNumber + " is not a valid  security number.");
			System.exit(2);
		}
		//Check if the values entered are numbers, apart from the '-' value.
		else if (!(Character.isDigit(socialSecurityNumber.charAt(0))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(1))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(2))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(4))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(5))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(7))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(8))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(9))) ||
				 !(Character.isDigit(socialSecurityNumber.charAt(10)))
				 ){
			System.out.println( "" + socialSecurityNumber + 
			" is not a valid  security number.");
			System.exit(3);
		}
		else {
			System.out.println( "" + socialSecurityNumber + 
			" is a valid  security number.");
			System.exit(1);
		}	
	}
}
