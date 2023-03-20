import java.util.Scanner;
	
public class Location{
	public static int row, column;
	public static double maxValue;
	//no-arg constructor
	Location(){
		row = 0;
		column = 0;
		maxValue = 0.0;
	}
	//the method
	public static Location locateLargest(double[][] a){
		Location obj =  new Location();
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				if (a[i][j] > maxValue){
					obj.row = i;
					obj.column = j;
					maxValue = a[i][j];
				}
			}
		}
		return obj;
	}
	public static void main(String[] args){
		int row, column;
		System.out.print("Enter number of rows and columns in array: " );
		row = new Scanner(System.in).nextInt();
		column = new Scanner(System.in).nextInt();
		double[][] array = new double [row][column];
		System.out.println("Enter array : " );
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				array[i][j] = new Scanner(System.in).nextDouble();
			}
		}
		System.out.println("The location of the largest element is " +
		 Location.locateLargest(array).maxValue + " at (" 
		 + Location.locateLargest(array).row + ", " +
		  Location.locateLargest(array).column + ")");
	}
}
