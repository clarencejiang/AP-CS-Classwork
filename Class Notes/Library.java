import java.util.Date;
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
		Libraryitem b = new Book("Rush B", "Jeff Zhang", 400820, true, new Date(), false);
		b.printDetails();
		System.out.println();

		Libraryitem c = new CD("Snow halation", "muse", 99999, true, new Date(), "Pop music");
		c.printDetails();
	}
}
