import java.util.Scanner;
/**
 * This is a program aiming to use with the McDonaldRunner. 
 * Author: Clarence Jiang 
 * Instructor: Daniel Gunn
 */
import java.util.Random;
public class McDonald {

	//This is the first thing while eating in McDonlad, and this is the program for me to decide 
	//whether I will eat in store or take the food away, which depends on the empty space left. 
	public String Eatinginstore() {
		System.out.print("How many spaces are left? ");
		Scanner input = new Scanner(System.in);
		int emptyspace = input.nextInt();
		if (emptyspace<1) {return "I'll not eat in this place";}
		else return "I'll eat in there";
	}
	
	//The second thing to consider is the money with you, and here is a project to come up with 
	//the money in your pocket. Since we always dream to have more money than we have, I design an
	//input before the function of Math random. 
	public String Getmoney() {
		System.out.print("How much money do I have?");
		Scanner input = new Scanner(System.in);
		int emptyspace = input.nextInt();
		int num = (int)( Math.random()*50); 
		return "sorry but I actually have " + num + " rmb"; 
	}
	
	
	//The third thing to consider is the food and taste. Generally, as a quite "poor" student 
	//I always prefer the cheapest one, but I do not quite favor spicy food. Thus, when the cheapest
	//burger is not a spicy one, I will definitely buy the cheapest one regardless whether it's a salty
	//or sweet one, because it's readily to accept either of them. However, when the cheapest burger
	//is exactly a spicy burger, I cannot base my selection on the price. Consequently, only in this way 
	//will I eventually base my selection on true favor. Moreover, the price of the three categories of burgers 
	//will be randomly generated through the "Random" function.  
	
	public String FoodSelection() {
		System.out.println("What is the cost of the three choices? spciy, sweet, and salty");
		String response ="";
		Random rng = new Random();
		int spicycost = rng.nextInt(30);
		int sweetcost = rng. nextInt(30);
		int saltycost = rng. nextInt(30); 
		
		System.out.println("spicycost: "+spicycost);
		System.out.println("sweetcost: "+sweetcost);
		System.out.println("saltycost: "+saltycost);
		
		int min = spicycost; 
		if (sweetcost<min) {min=sweetcost;}
		if (min>saltycost) {min=saltycost;}
		
		if (min!=spicycost) 
		{ if (min==sweetcost) {return "I'll choose the sweet burger with "+min + " rmb since it's the CHEAPEST";}
		else return "I'll choose the salty burger with "+min + " rmb since it's the CHEAPEST!!!";
		}
		
		else if (min == spicycost) {
		System.out.println("Fine, the cheapest is the spicyburger which i do not favor.");
		System.out.print("Thus I will not choose burgers based on money, which favor do I prefer? ");
		Scanner input = new Scanner(System.in);
		String statement = input.nextLine();
		
	
		if (statement.indexOf("sweet") >= 0) 
		{ response = "I may eat the sweet burger with "+sweetcost+" rmb";}
		else if (statement.indexOf("salty") >= 0) {response = "I may eat a salty burger";}
		
		}
		return response; 
	}
	
	//The fourth thing, after making final decision, is to decide the payment method. We can pay through both 
	//our cellphones and cash. We can also utilize those two ways through self-pay machine or shop-assistants 
	//If you use the self-pay machine, you can only use phones to pay. On the other hand, if you pay at the 
	//assistant table, you can pay through both phones and cashes. A special case is relevant to a "coupon" issue.
	// If you have a coupon, you have to pay through shop-assistants. If you do not, then the choice depends on the 
	// money stored in wallets and Alipay (an app on phones to pay money), If i have spent a lot of money in my 
	// Alipay, I'll pay through cahs and go to the assistants. If i do not spend so much, I'll simply use the 
	// self-pay machine and my phone to pay. 
	public String Paymoney() {
		
		
		System.out.print("Do I have a coupon? Yes or No");
		int ConsupmptionAlipay=RecentConsumptioninAlipay(); 
		Scanner input = new Scanner(System.in);
		String answer = input. nextLine();
		
		if (answer.equals("Yes") && ConsupmptionAlipay>300 ) 
			{return "I'll go throgh the shop assistant to use my coupon and I'll use cash";}
		else if (answer.equals("Yes") && ConsupmptionAlipay<300 )
			{return "I'll go throgh the shop assistant to use my coupon and I'll pay through mmy phone";}
		else { 
			if (ConsupmptionAlipay>300) {return "I'll go throgh the shop assistant to use cash";}
			else  return "I'll use my phone to pay at the machine";
			
		}
	}
	
	//I'll use this part of program in the previous program to come up with random money in Alipay. 
	public int RecentConsumptioninAlipay() {
		Random rng= new Random();
		return rng.nextInt(1000); 
	}
	
	//This is a final program about a bonus activity in this Haidianhuangzhuang McDonald 
	public String Specialbonus () {
		System.out.print("Here is a special bonus for you. Please input numbers from 0 to 4");
		Scanner  input = new Scanner(System.in);
		int r = input.nextInt();
		
	
		String [] array = new String [5];
		array[0]="You get an offer from OXFORD!! ";
		array[1]="You get an offer from Princeton ";
		array[2]= "You get an offer from Havard ";
		array[3]= "You get an offer from Stanford ";
		array[4]="You get an offer from Yale ";
		
		return array[r];
	}
}
