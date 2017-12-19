/**
 * 
 * @author clarence
 *This is the Saygoodbye (main class) program which has the main method working with 
 *my "Person" program. I think i ignore the nationality in this case, regarding all 
 *of them as French. The concern of nationality is reflected by "language" 
 */
public class Saygoodbye {
	public static void main (String[] args) {
		Person Clarence = new Person();
		Person Gagi = new Person();
		Person Persephone = new Person(); 
		Person Jeff = new Person();
		
		//Gagi. language = "English"; 
		Gagi.grow(3);
		Gagi.givemescore(1.0);
		System.out.println(Gagi.getMessage());
	
		//Clarence. language = "China"; 
		Clarence.grow(1);
		Clarence.givemescore(4.5);
		System.out.println(Clarence.getMessage());
	
		//Persephone. language = "French"; 
		Persephone.grow(5);
		Persephone.givemescore(5.0);
		System.out.println(Persephone.getMessage());
	    //Jeff. language = "Japan"; 
		Jeff.grow(0);
		Jeff.givemescore(0.0);
		System.out.println(Jeff.getMessage());
		
		
	}
}
