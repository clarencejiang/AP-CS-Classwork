package ShapeCircle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Circle a = new Circle("circleA", 8);
		a.Printdetails();
		
		System.out.println();
		
		Circle b = new Circle("circleB",10);
		b.Printdetails();
		
		System.out.println();
		
		Circle c= new Circle ("circleC", 9);
		c.Printdetails();
		
		System.out.println();
		
		System.out.println("Are circleA and circleB equal? ");
		System.out.println(b.equals(a));
		
		
		System.out.println();
		
		System.out.println("Below is the sorting of objects based on radius");
		
		//Shape b = new Square("Square", 7.4);
		//b.Printdetails();
		
		//System.out.println();
		
		//Shape c = new Triangle("Triangle", 8.9,3.4,7.6);
		//c.Printdetails();
		
		List d = new ArrayList();
		d.add(a);
		d.add(b);
		d.add(c);
		Collections.sort(d);
		System.out.println(d);
		
	}
}
