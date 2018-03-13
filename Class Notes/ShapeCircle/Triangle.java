package ShapeCircle;

public class Triangle extends Shape{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(String Shapename, double myside1, double myside2, double myside3) {
		super(Shapename);
		side1=myside1;
		side2=myside2;
		side3=myside3;
		
	}
	public double area() {
		double a= 0.5*(side1+side2+side3);
		double d= Math.sqrt(a*(a-side1)*(a-side2)*(a-side3));
		return d;
	}
	public double perimeter() {
		return (side1+side2+side3);
	}
	public void Printdetails() {
		super.Printdetails();
		System.out.println("Area: "+area());
		System.out.println("Perimeter: "+perimeter());
	}
}
