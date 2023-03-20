import java.util.Scanner;

public class Triangle2D{
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	//constructors
	Triangle2D(){
		this.p1 = new MyPoint();
		this.p2 = new MyPoint(1,1);
		this.p3 = new MyPoint(2,5);
	}
	
	Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3){
		this.p1 = new MyPoint(x1, y1);
		this.p2 = new MyPoint(x2, y2);
		this.p3 = new MyPoint(x3, y3);
	}
	//mutator and accessor methods.
	//getter
	public MyPoint getP1(){
		return p1;
	}
	public MyPoint getP2(){
		return p2;
	}
	public MyPoint getP3(){
		return p3;
	}
	//setter
	public void setP1(double x, double y){
		p1 = new MyPoint(x, y);
	}
	public void setP2(double x, double y){
		p2 = new MyPoint(x, y);
	}
	public void setP3(double x, double y){
		p3 = new MyPoint(x, y);
	}
	//general object methods
	public double getArea(Triangle2D x){
		return double;
	}
	public double getPerimeter(Triangle2D x){
		return double;
	}
	public boolean contains(MyPoint p){
		return (...? true : false);
	}
	public boolean contains(Triangle2D t){
		return (...? true : false);
	}
	public boolean overlaps(Triangle2D t){
		return (...? true : false);
	}
	//Main
	public static void main(String[] args){
		System.out.print("This is a template, modify as necessary");
	}
}
