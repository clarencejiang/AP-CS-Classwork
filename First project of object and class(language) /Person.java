
public class Person {
	private String c;
	private int age; 
	private double gpa; 
	
	public Person() {
		//this.c =language;
		this.age=0;
		this.gpa=0;
	}
	
	
	public void grow(int c) {
		this.age+=c; 
		
	}
	
	public void givemescore (double e) {
		this.gpa+=e; 
	}
	public String getMessage () {
		if (this.age<3) {return ( "AAAbBbBfjaoifjeo");}
		else  {return( "Bonjour j'ai" +" " + age + " ans with gpa " + gpa);}
	}
	
	
	public void sayGoodbye() {
		//System.out.println("Goodbye Gagi" );
	}
	public void sayHello() {
		//if (this.c.equals("English"))
		//System.out.println("Hello, I am an English ");
		//else if (this.c.equals("French"))
			//System.out.println("Bonjour, I am a French");
		//else if (this.c.equals("Japan"))
			//System.out.println("Conijiwa, I am a Japanese");
		//else System.out.println("NIHAO, I am a Chinese");
		
		//if (this.age<3) {System.out.println( "AAAbBbBfjaoifjeo");}
		//else  {System.out.println( "Bonjour I am" +" " + age + " years old ");}
		}
	}

