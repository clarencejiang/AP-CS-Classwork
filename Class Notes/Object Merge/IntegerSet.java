/**
 * Instructor: Daniel Gunn 
 * Editor: Clarence Jiang 
 * Description: This is a program aiming to merge objects and make some 
 * methods with the IntegerSet class. 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class IntegerSet implements mergeable{
	
	public ArrayList <Integer> a;
	public IntegerSet(ArrayList<Integer> b) {
		a=b;
	}
	
	public Object merge(Object x) {
		ArrayList<Integer> d = new ArrayList();
		d.addAll(a);
		d.addAll((Collection<? extends Integer>)x);
		return d;
	}
	public void printElements() {
		for (int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}	
	}
	
	public int size() {
		return a.size();
	}
	
	public boolean elementOf(int x) {
		boolean c= false; 
		for(int i=0; i<a.size();i++) {
			if (x==a.get(i)) {
				c=true;
			}
		}
		return c; 
	}
	
	public static void main(String[] args) {
		List<Integer> z= new ArrayList();
		z.add(3);
		z.add(1);
		z.add(9);
		IntegerSet b= new IntegerSet((ArrayList<Integer>) z);
		ArrayList<Integer> x=(ArrayList<Integer>)b.merge(z);
		b.printElements();
		System.out.println();
		//for(int i=0; i<x.size(); i++) {
		//	System.out.println(x.get(i));
			
		//}
		System.out.println("Size: "+b.size());
		System.out.println(b.elementOf(5));
	}
}
