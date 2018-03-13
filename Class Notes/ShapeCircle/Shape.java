package ShapeCircle;

public abstract class Shape {
	private String name;

	public Shape(String Shapename) {
		name = Shapename;
	}

	public String getName() {
		return name;
	}

	public abstract double area();

	public abstract double perimeter();

	public void Printdetails() {
		System.out.println("Shapename: " + getName());
	}
}
