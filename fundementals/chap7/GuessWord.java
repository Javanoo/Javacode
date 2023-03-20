//This program imitates a guessing game. The user has to guess the letters 
//found in a randomly selected word, by entering letters that compose it. 
//it then displays the number of misses after the word has been fully guessed.
//#single_dimension arrays
import java.util.Scanner;

public class GuessWord{
	public static void main(String[] args){
		String[] words = {"Home", "Dog", "Fusion", "Intergalactic",
		"Solar", "Outlier", "Manifest", "Abrupt", "Transformer", 
		"Elusive"};
		//play? default : on
		//loop until chosen to be 'off'.
		char choice = '\u0000';
		do {
			String chosenWord = randomWord(words);
			char[] arrayOfChosenWord = stringToArray(chosenWord);
			char[] mask = arrayMask(arrayOfChosenWord.length);
			String stringMask = "";
			int missed = 0, repeats = 0, notFound = 0;
			while(!(java.util.Arrays.equals(mask, arrayOfChosenWord))){
				for (char e : mask) stringMask += (e + "");
				System.out.print("Guess a letter in " + stringMask + " : ");
				stringMask = "";
				char guessedLetter = new Scanner(System.in).next().charAt(0);
				for (int i = 0; i < chosenWord.length(); i++){
					if (guessedLetter == arrayOfChosenWord[i]){
						//if letter has been repeated
						if (guessedLetter == arrayOfChosenWord[i] &&
								guessedLetter == mask[i]){
							repeats++;
						}
						else{ 
							mask[i] = guessedLetter;
						}
						
					}
					//then letter is not part of the word
					if (guessedLetter != arrayOfChosenWord[i]) {
						notFound++;
					}
				}
				if (repeats > 0){
					System.out.println("You already guessed " + 
					guessedLetter + "!");
				}
				if (notFound == mask.length){
					System.out.println("Letter is not in the word!");
					missed++;
				}
				notFound = 0;
				repeats = 0;
			}
			System.out.println("The random Word was " + chosenWord + ". " +
			 "You've missed " + missed + ((missed > 1) ? (" times.") : (" time.")));
			choice = prompt();	
		}while (choice == 'y' || choice == 'Y');
	}
	//methods
	//choose random word.
	public static String randomWord(String[] list){
		String word = "";
		word = list[(int)(Math.random() * 10)];
		return word;
	}
	//convert string to an array.
	public static char[] stringToArray(String word){
		char[] array = new char[word.length()];
		for (int i = 0; i < word.length(); i++) array[i] = word.charAt(i);
		return array;
	}
	//create an asterisk array
	public static char[] arrayMask(int one){
		char[] array = new char[one];
		for(int i = 0; i < one; i++) array[i] = '*';
		return array;
	}
	public static char prompt(){
		System.out.print("Would you like to play again? (y/n) : ");
		char letter = new Scanner(System.in).next().charAt(0);
		return letter;
	}
 }
