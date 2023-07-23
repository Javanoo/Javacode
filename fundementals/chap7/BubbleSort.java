import java.util.Scanner;

public class BubbleSort{
	public static void main(String[] args){
		double[] numbers =  new double[10];
		fill(numbers);
		System.out.println("After sorting using the bubble sort algorithm :");
		bubbleSort(numbers);
		display(numbers);
	}
	public static void fill(double... num){
		System.out.println("Enter ten numbers :");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < num.length; i++){
			num[i] = input.nextDouble();
		}
	}
	public static void bubbleSort(double... num){
		for(int i = 0; i < num.length; i++){
			for(int j = 0, k = j + 1; j < num.length; j++, k++){
				if(k < num.length && num[j] > num[k]){
					double temp = num[j];
					num[j] = num[k];
					num[k] = temp;
				}
			}
		}
	}
	public static void display(double... num){
		for(int i = 0; i < num.length; i++){
			System.out.print(num[i] + " ");
		}
		System.out.println("");
	}
}
