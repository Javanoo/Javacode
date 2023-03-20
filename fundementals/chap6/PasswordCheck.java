//This program addresses the question that follows
/*(Check password ) Some websites impose certain rules for passwords. Write a
* method that checks whether a string is a valid password. Suppose the password
* rules are as follows:
* ■ A password must have at least eight characters.
* ■ A password consists of only letters and digits.
* ■ A password must contain at least two digits.
*/
 
import java.util.Scanner;

public class PasswordCheck{
	//check password length
	public static boolean length(String password){
		int length = password.length();
		if (length < 8) return false;
		else return true;
	}
	//Check if password only consists of letters and digits
	public static boolean composition(String password){
		boolean result = false;
		for (int i = 0; i < password.length() - 1 ; i++){
			if (Character.isDigit(password.charAt(i)) || 
			    Character.isLetter(password.charAt(i)))
				result = true;
			else result = false;
		}
		return result;
	}
	//check if password contains atleast two digits.
	public static boolean _2digits(String password){
		int count = 0;
		for (int i = 0; i < password.length() - 1; i++){
			if (Character.isDigit(password.charAt(i)))
				count++;
		}
		if (count >= 2) return true;
		else return false;
	}
	public static void main(String [] params){
		Scanner input = new Scanner(System.in);
		String password;
		//user password
		System.out.print("Enter a password: ");
		password = input.next();
		if(length(password) && _2digits(password) && 
		   composition(password)) System.out.println("The password is" +
		   " valid.");
		else System.out.println("Invalid password.");
		
	}
}