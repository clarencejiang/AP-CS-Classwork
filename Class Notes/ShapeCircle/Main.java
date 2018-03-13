package ShapeCircle;

public class Main {
	public static void main(String[] args) {
		Circle a = new Circle("circle", 8);
		a.Printdetails();
		
		System.out.println();
		
		Circle b = new Circle("circle",8);
		b.Printdetails();
		
		System.out.println();
		
		System.out.println("Are they equal? ");
		System.out.println(b.equals(a));
		
		
		//System.out.println();
		
		//Shape b = new Square("Square", 7.4);
		//b.Printdetails();
		
		//System.out.println();
		
		//Shape c = new Triangle("Triangle", 8.9,3.4,7.6);
		//c.Printdetails();
	}
}
