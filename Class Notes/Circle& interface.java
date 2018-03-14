package ShapeCircle;

public class Circle extends Shape implements Comparable<Circle>{
	private double radius;

	public Circle(String Shapename, double myRadius) {
		super(Shapename);
		radius = myRadius;
	}

	public double getRadius() {
		return radius;
	}

	public double area() {
		return (radius * radius * Math.PI);
	}

	public double perimeter() {
		return (2 * Math.PI * radius);
	}

	public void Printdetails() {
		super.Printdetails();
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}

	public boolean equals(Circle obj) {
		return (this.radius == obj.getRadius());
	}
	
	public int compareTo(Circle a) {
		
		return (int) (this.radius-a.radius); 
		
	}
	public String toString() {
		return ""+getName();
	}
}
