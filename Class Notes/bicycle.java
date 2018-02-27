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
	private Random random; 
	
	public bicycle (double n) {
		mass=n;
		random = new Random();
	}
	
	public boolean runningonRoad(double n) {
	//In a special road, only bicycle with mass less than 15kg can go through. This behavior
	//aims to check whether a bicycle can run through this road. 
		boolean c=true; 
		
		if (n>15) { c= false;}
		
		return c; 
	}
	
	public double getMass() {return mass;}
	public void setMass(double n ) { mass=n;}

	

}
