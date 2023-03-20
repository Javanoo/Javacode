import java.util.Scanner;

public class MyPoint{
	private  double x;
	private double y;
	
	//constructors
	MyPoint(){
		this.x = 0.0d;
		this.y = 0.0d;
	}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//methods
	public  double getX(){
		return this.x;
	}
	
	public  double getY(){
		return this.y;
	}
	
	public static double distance(MyPoint a, MyPoint b){
		double distance = Math.pow((b.getX() - a.getX()), 0.5) + Math.pow((b.getY() - a.getY()), 0.5);
		return distance;
	}
	
	public static double distance(MyPoint a){
		System.out.print("Calculate from this point (" + a.getX() + ", " + a.getY() + ") to : (");
		double bX = new Scanner(System.in).nextDouble();
		System.out.print(", ");
		double bY = new Scanner(System.in).nextDouble();
		System.out.println(")");
		double distance = Math.pow((bX - a.getX()), 0.5) + Math.pow((bY - a.getY()), 0.5);
		return distance;
	}
	//EOF
}
