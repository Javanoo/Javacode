/**
This program tries to discover banks that are not safe based 
on the bank's total assets against its threshhold.
Write a program to find all the unsafe banks. Your program reads
the input as follows. It first reads two integers n and limit, where n indicates the
number of banks and limit is the minimum total assets for keeping a bank safe. It
then reads n lines that describe the information for n banks with IDs from 0 to n-1.
The first number in the line is the bank’s balance, the second number indicates
the number of banks that borrowed money from the bank, and the rest are pairs
of two numbers. Each pair describes a borrower. The first number in the pair
is the borrower’s ID and the second is the amount borrowed.
*/

import java.util.Scanner;

public class Financial_Tsunami{
	//number of banks & minimum total assets
	public static void main(String[] args){
		int n, limit; 
		System.out.println("Enter the number of banks and limit of safety.");
		n = new Scanner(System.in).nextInt();
		limit = new Scanner(System.in).nextInt();
		int[] numberOfBanks = new int[n];
		String[] unSafeBanks = new String[n];
		for (int i = 0; i < numberOfBanks.length; i++){
			int balance, numberOfBorrowers;
			System.out.println("Enter banks balance and number of banks that owes: ");
			balance = new Scanner(System.in).nextInt();
			numberOfBorrowers = new Scanner(System.in).nextInt();
			double[][] borrowers = new double[numberOfBorrowers][2];
			double sumOfLoans = 0.0;
			for (int j = 0; j < numberOfBorrowers; j++){
				for (int k = 0; k < 2; k++){
					borrowers[j][k] = new Scanner(System.in).nextDouble();
				}
				sumOfLoans += borrowers[j][1];
			}
			if ((balance + sumOfLoans) < limit) unSafeBanks[i] = "unsafe"; 
		}
		System.out.print("Unsafe banks are");
		for (int i = 0; i < unSafeBanks.length; i++){
			if (unSafeBanks[i] == "unsafe") System.out.print(" " + i++); 
		}
		System.out.println("");
	}
}
