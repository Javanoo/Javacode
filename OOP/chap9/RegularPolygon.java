public class RegularPolygon{
	//stores number of sides
	//length , the x-coordinate &
	//y-coordinate.
	private int n;
	private double side;
	private double x;
	private double y;
	//no-arg constructor
	RegularPolygon(){
		this.n = 3;
		this.side = 1; 
		this.x = 0;
		this.y = 0;
	}
	//arg constructor
	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side; 
		this.x = 0;
		this.y = 0;
	}
	//fully arg constructor
	RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side; 
		this.x = x;
		this.y = y;
	}
	//mutator methods
	public void setN(int n){ this.n = n;}
	public void setSide(double side){ this.side = side;}
	public void setX(double x){ this.x = x;}
	public void setY(double y){ this.y = y;}
	//accessor methods
	public int getN(){ return n;}
	public double getSide(){ return side;}
	public double getX(){ return x;}
	public double getY(){ return y;}
	//find perimeter
	public double getPerimeter(){
		return n * side;
	}
	//find area
	public double getArea(){
		return ((n * Math.pow(side,2)) / (4 * Math.tan(Math.PI/n)));
	}
	public static void main(String[] args){
		System.out.println("This is a test program for the class");
		RegularPolygon polygon =  new RegularPolygon();
		RegularPolygon polygon1 =  new RegularPolygon(6, 4.0);
		RegularPolygon polygon2 =  new RegularPolygon(10, 4.0, 5.6, 7.8);
		System.out.println("Polygon has the perimeter : " + polygon.getPerimeter() + " and an area of : " + polygon.getArea());
		System.out.println("Polygon1 has the perimeter : " + polygon1.getPerimeter() + " and an area of : " + polygon1.getArea());
		System.out.println("Polygon2 has the perimeter : " + polygon2.getPerimeter() + " and an area of : " + polygon2.getArea());
	}
}
