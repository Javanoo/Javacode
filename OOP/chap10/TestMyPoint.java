import java.util.Scanner;

public class TestMyPoint{
	//test program
	public static void main(String[] args){
		System.out.println("Creating two points a(0,0) and b(10,30.5) ...........");
		MyPoint a = new MyPoint(0,0);
		MyPoint b = new MyPoint(10,30.5);
		System.out.println("Distance between a and b is " + (((int) (MyPoint.distance(a,b) * 100))/100.0) + ".");
		System.out.println(((int)(MyPoint.distance(a) * 100))/ 100.0);
	}
}
