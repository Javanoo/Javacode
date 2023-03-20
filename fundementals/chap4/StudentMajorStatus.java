//This program attempts to address the following question.
/** (Student major and status) Write a program that prompts the user to enter two
* characters and displays the major and status represented in the characters. The first
* character indicates the major and the second is number character 1, 2, 3, 4, which
* indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
* the following chracters are used to denote the majors:
* M: Mathematics
* C: Computer Science
* I: Information Technology
*/
//code
import java.util.Scanner;

public class StudentMajorStatus{
	public static void main(String[] args){
		char character1, character2;
		//get characters
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Two characters: ");
		String word = input.next();
		character1 = (char)(word.charAt(0));
		character2 = (char)(word.charAt(1));
		
		//logic
		if (Character.isLetter(character1) && Character.isDigit(character2)){
			character1 = Character.toUpperCase(character1);
			character2 = Character.toUpperCase(character2);
			if (character1 == 'M' && character2 < '5'){
				System.out.print("Matthematics ");
				if (character2 == '1') 
					System.out.println("freshman.");
				else if (character2 == '2') 
					System.out.println("sophomore.");
				else if (character2 == '3') 
					System.out.println("junior.");
				else 
					System.out.println("senior.");
			}
			else if (character1 == 'C' && character2 < '5'){
				System.out.print("Computer Science ");
				if (character2 == '1') 
					System.out.println("freshman.");
				else if (character2 == '2') 
					System.out.println("sophomore.");
				else if (character2 == '3') 
					System.out.println("junior.");
				else 
					System.out.println("senior.");
			}
			else if (character1 == 'I' && character2 < '5'){
				System.out.print("Information Technology ");
				if (character2 == '1') 
					System.out.println("freshman.");
				else if (character2 == '2') 
					System.out.println("sophomore.");
				else if (character2 == '3') 
					System.out.println("junior.");
				else 
					System.out.println("senior.");
			}
			else 
				System.out.println("Unrecognized characters.");		
		}
		else 
				System.out.println("Invalid input.");
		
	}
}
