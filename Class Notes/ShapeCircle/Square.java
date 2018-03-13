package ShapeCircle;

public class Square extends Shape {
	private double side;
	
	public Square(String Shapename, double mySide) {
		super(Shapename);
		side=mySide;
	}
	
	public double area() {
		return (side*side);
	}
	public double perimeter() {
		return (4*side);
	}
	public void Printdetails() {
		super.Printdetails();
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}

}
