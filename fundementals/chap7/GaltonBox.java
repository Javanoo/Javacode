import java.util.Scanner;
import java.util.Arrays;

public class GaltonBox{
	public static void main(String[] args){
		int numberOfSlots  = 0;
		int numberOfBalls = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of slots: ");
		numberOfSlots = input.nextInt();
		System.out.print("Enter number of balls: ");
		numberOfBalls = input.nextInt();
		
		//slots
		int[] slots = new int[numberOfSlots];
		char[] path = new char[numberOfSlots - 1];
		
		for(int i = 1; i <= numberOfBalls; i++){
			dropBalls(path);
			displayPath(path);
			int index = countNumberOfRs(path);
			if(index != 0) index--;
			slots[index]++;
		}
		displayBallsInSlots(numberOfBalls, slots);
	}
	//record the path of a dropped ball.
	public static void dropBalls(char... path){
		for(int i = 0; i < path.length; i++){
			int side = (int)(Math.random() * 10);
			if(side < 5) path[i] = 'L';
			else path[i] = 'R';
		}
	}
	//display path of the ball
	public static void displayPath(char... path){
		for(char elem : path){
			System.out.print(elem);
		}
		System.out.println("");
	}
	//determin which slot has the ball occupied 
	public static int countNumberOfRs(char... path){
		int numberOfRs = 0;
		for(int i = 0; i < path.length; i++){
			if(path[i] == 'R') numberOfRs++;
		}
		return numberOfRs;
	}
	//draw a histogram of the number of balls in the slots.
	public static void displayBallsInSlots(int balls, int... slots){
		System.out.println("");
		for(int i = balls; i > 0; i--){
			for(int j = 0; j < slots.length; j++){
				if(slots[j] >= i && slots[j] != 0) System.out.print("o ");
				else System.out.print("  ");
			}
			System.out.println("");
		}
		for(int i = 1; i <= slots.length; i++) System.out.print(i + " ");
		System.out.println("");
	}
}
