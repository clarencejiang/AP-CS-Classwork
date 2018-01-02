import java.util.Scanner;
/**This is a project aiming to use the knowledge of class and object. 
 * It demonstrates the real process to buy food in McDonald with different considerations. 
 *
 * @author clarence
 *
 */
public class McDonaldRunner {
	public static void main(String[] args)
	{
		McDonald Haidianhuangzhuang = new McDonald ();
		//define a new object, a new McDonald which is near to RDFZ: the McDonald in Haidianhuangzhuang
		System.out.println(Haidianhuangzhuang.Eatinginstore());
		
		System.out.println(Haidianhuangzhuang.Getmoney());
		
		System.out.println(Haidianhuangzhuang.FoodSelection());
		
		System.out.println(Haidianhuangzhuang.Paymoney());
		
		System.out.println(Haidianhuangzhuang.Specialbonus());
	}
}
