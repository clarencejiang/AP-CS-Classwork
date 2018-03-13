import java.util.Date;
import java.util.Scanner;
/**
 * 
 * @author clarence
 *
 *Instructor: Daniel Gunn 
 *Editor: Clarence Jiang 
 *Progarm description: this is the main method of the entire "library" program 
 *aiming to print out the final results with inputs. 
 *
 */

public class Library {

	public static void main(String[] args) {
		
		System.out.println("Book Information before borrowing:");
		
		
		Libraryitem b = new Book("Rush B", "Jeff Zhang", 400820, false, new Date(), false,17);
		b.printDetails();
		System.out.println();

		//Libraryitem c = new CD("Snow halation", "muse", 99999, true, new Date(), "Pop music",12);
		//c.printDetails();
		
		borrower c = new borrower("Peter","peter@rusha.com",17);
		b.borrowing(c);
		
		System.out.println("Borrower Information: ");
		c.PrintDetails();
		System.out.println();
		
		System.out.println("Book Information after borrowing: ");
		Libraryitem d = new Book("Rush B", "Jeff Zhang", 400820, true, new Date(), false,17);
		b.printDetails();
	}
}
