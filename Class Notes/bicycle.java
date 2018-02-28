/**
 * Editor: Clarence Jiang
 * Instructor: Daniel Gunn
 * Program description: this program aims to show the attribute of mass in 
 * the class of bicycle and the behavior, which relates to the corresponded 
 * attribute (mass), of crossing a "dangerous" road.   
 */
import java.util.*;

public class bicycle {
	
	private double mass; 
	private int maximumSpeed; 
	private Random random; 
	
	public bicycle (double n, int c) {
		mass=n;
		maximumSpeed = c; 
		random = new Random();
	}
	
	public boolean runningonRoad() {
	//In a special road, only bicycle with both mass less than 15kg and maximumSpeed less than 12km/h	
	//can go through. This behavior aims to check whether a bicycle can run through this road. 
		boolean c=true; 
		
		if (mass>15) { c= false;}
		
		if (maximumSpeed>12) {c=false;}
		
		return c; 
	}
	
	public double getMass() {return mass;}
	public int getMaximumSpeed() {return maximumSpeed;}
	
	public void setMass(double n ) { mass=n;}
	public void setMaximumspeed(int a) {maximumSpeed=a;}
	
	public static void main (String[] args) {
		bicycle c = new bicycle (17,20); 
		
		System.out.println("what is the mass and the speed of this bicycle");
		System.out.println("the mass is " + c.getMass());
		System.out.println("the speed is " + c.getMaximumSpeed());
		
		System.out.println("can it pass through?");
		System.out.println(c.runningonRoad());
		
	//now we find that this bicycle cannot go through the road, so we need to drop some 
	//equipments to reduce the weight and lower the speed as well. 
		
		c.setMass(13);
		c.setMaximumspeed(8);
		System.out.println("now we change into mass of "+ c.getMass() +" and the speed of "+ c.getMaximumSpeed());
		System.out.println("now can it pass through?");
		System.out.println(c.runningonRoad());
		
	
	}

	

}
