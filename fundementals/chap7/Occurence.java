//program that counts the repitition of numbers in a given
//entry or input period
import java.util.Scanner;
import java.util.Arrays;

public class Occurence{
	public static void main(String[] args){
		int[] enteredNumbers = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  integers between 1 and 100 : ");
		for(int i = 0; i < enteredNumbers.length; i++){
			int num = input.nextInt();
			//stop if number is a 0 or above 100 or below 1
			if(num == 0 || num > 100 || num < 1) break;
			//else capture the number
			else enteredNumbers[i] = num;
		}
		java.util.Arrays.sort(enteredNumbers);
		//filter actual numbers, avoid duplicates
		int[] filtered = actualNumbers(enteredNumbers);
		//track occurence
		int[] counts = countOccurences(filtered, enteredNumbers);
		//display results.
		for(int i = 0; i < filtered.length; i++){
			System.out.println(filtered[i] + " occurs " + ((counts[i] < 2) ? 
			counts[i] + " time" : counts[i] + " times" )	  );
		}
		
	}
	public static int[] actualNumbers(int... num){
		int indexOfNonZero = 0;
		//identify first non zero 
		for(int i = 0; i < num.length; i++){
			if(num[i] != 0){
				indexOfNonZero = i;
				break;
			}
		}
		//copy non-zeros and duplicates
		int[] nonZeros = new int[num.length - indexOfNonZero];
		System.arraycopy(num, indexOfNonZero, nonZeros, 0, nonZeros.length);
		//extract unique numbers
		int[] noDups = new int[nonZeros.length];
		for(int i = 0; i < noDups.length; i++){
			int uniqueNum = nonZeros[i];
			boolean levelOfUniqueness = true;
			for(int j = 0; j < noDups.length; j++){
				if(noDups[j] == uniqueNum) levelOfUniqueness = false;
			}
			if(levelOfUniqueness) noDups[i] = uniqueNum;  
		}
		java.util.Arrays.sort(noDups);
		for(int i = 0; i < noDups.length; i++){
			if(noDups[i] != 0){
				indexOfNonZero = i;
				break;
			}
		}
		//copy non-zeros 
		int[] noDups2 = new int[noDups.length - indexOfNonZero];
		System.arraycopy(noDups, indexOfNonZero, noDups2, 0, noDups2.length);
		return noDups2;
	}
	public static int[] countOccurences(int[] number, int... numbers){
		int[] counts = new int[number.length];
		java.util.Arrays.fill(counts,0);
		for(int i = 0; i < counts.length; i++){
			for(int j = 0; j < numbers.length; j++)
				if(number[i] == numbers[j]) counts[i]++;
		}
		return counts;
	}
}
