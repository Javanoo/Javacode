import java.util.Scanner;

class Triangle2D{
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	//constructors
	Triangle2D(){
		this.p1 = new MyPoint();
		this.p2 = new MyPoint(1,1);
		this.p3 = new MyPoint(2,5);
	}
	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
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
		p1.setX(x);
		p1.setY(y);
	}
	public void setP2(double x, double y){
		p2.setX(x);
		p2.setY(y);
	}
	public void setP3(double x, double y){
		p3.setX(x);
		p3.setY(y);
	}
	//general object methods
	public double getArea(){
		double side1, side2, side3;
		side1 = MyPoint.distance(this.p1, this.p2);
		side2 = MyPoint.distance(this.p2, this.p3);
		side3 = MyPoint.distance(this.p3, this.p1);
		double sum = (side1 + side2 + side3)/2, area = Math.sqrt(sum * ((sum-side1) * (sum-side2) * (sum-side3)));
		return area;
	}
	public double getPerimeter(){
		double side1, side2, side3;
		side1 = MyPoint.distance(this.p1, this.p2);
		side2 = MyPoint.distance(this.p2, this.p3);
		side3 = MyPoint.distance(this.p3, this.p1);
		double sum = (side1 + side2 + side3);
		return sum;
	}
	public boolean contains(MyPoint p){
		return true;
	}
	public boolean contains(Triangle2D t){
		return true;
	}
	public boolean overlaps(Triangle2D t){
		return true;
	}
}

public class Triangle{
	public static void main(String[] args){
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),new MyPoint(5, 3.5));
		System.out.println("The area of t1 = " + ((int)(t1.getArea() * 100)/100.0) + ".\nThe perimeter of t1 = " + ((int)(t1.getPerimeter() * 100)/100.0));
		//is the Point within ?
		(t1.contains(new MyPoint(3, 3)) ? System.out.println("Point(3, 3) is within the triangle.") : System.out.println("Point(3, 3) is not within the triangle.");
		//is the Triangle within?
		(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4)))) ? System.out.println("Triangle with points((2.9,2), (4,1), (1,3.4))" + 
			"is within the triangle.") : System.out.println("Triangle with points((2.9,2), (4,1), (1,3.4)) is not within the triangle.");
		//does the Triangle overlap t1?
		(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5)))) ? System.out.println("Triangle with points((2, 5.5), (4, -3), (2,6.5))" +
			"overlaps with the triangle.") : System.out.println("Triangle with points((2, 5.5), (4, -3), (2,6.5)) does not overlap with the triangle."); 
	}
}
