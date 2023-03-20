//This program generates a random number and names which month the number, 
//represents.
//...........................................................................
/*(Random month) Write a program that randomly generates an integer between 1
* and 12 and displays the English month name January, February, …, December for
* the number 1, 2, …, 12, accordingly.
*/

//code
public class RandomMonth{
	public static void main(String[] agrs){
		//random generator
		int randomNumber = (int) (Math.random() * 15 + 1);
		//select based on number.
		switch(randomNumber){
			case 1 : System.out.println("Random number : " + randomNumber + "\n" + "Month : January."); break;
			case 2 : System.out.println("Random number : " + randomNumber + "\n" + "Month : February."); break;
			case 3 : System.out.println("Random number : " + randomNumber + "\n" + "Month : March."); break;
			case 4 : System.out.println("Random number : " + randomNumber + "\n" + "Month : April."); break;
			case 5 : System.out.println("Random number : " + randomNumber + "\n" + "Month : May."); break;
			case 6 : System.out.println("Random number : " + randomNumber + "\n" + "Month : June."); break;
			case 7 : System.out.println("Random number : " + randomNumber + "\n" + "Month : July."); break;
			case 8 : System.out.println("Random number : " + randomNumber + "\n" + "Month : August."); break;
			case 9 : System.out.println("Random number : " + randomNumber + "\n" + "Month : September."); break;
			case 10 : System.out.println("Random number : " + randomNumber + "\n" + "Month : October."); break;
			case 11 : System.out.println("Random number : " + randomNumber + "\n" + "Month : November."); break;
			case 12 : System.out.println("Random number : " + randomNumber + "\n" + "Month : December."); break;
			default : System.out.println("Random number Generated out of range, Check code, line number 13."); System.exit(1);			
		} 
	}
	//end of method
}
