/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
import java.beans.Statement;
import java.util.Scanner;

import java.util.Random;

public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("NO")>=0) {
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		
		else if (statement.indexOf("university")>=0 ||(statement.indexOf("college")>=0)) {
			response = getCollege();
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{ 	Random rng = new Random();
		
		int r = rng.nextInt(4);
		
	
		String [] array = new String [5];
		array[0]="Interesting, tell me more ";
		array[1]="Hmmm. ";
		array[2]= "Do you really think so?";
		array[3]= "You don't say.";
		array[4]="sorry, I'm not paying attention ";
		
		return array[r];
	}



	private String getCollege() {
		System.out.println("What's your dream School?");
		Scanner in = new Scanner (System.in);
		String c= in.nextLine(); 
		if (c.indexOf("Oxford")>=0) {return "That's also my dream school";}
		else return "I don't like it"; 
	}
	
}


