import java.util.Date;
/**
 *Instructor: Daniel Gunn 
 *Editor: Clarence Jiang 
 *Program description: this is the subclass of CD. It has a sepcial 
 *characterstic of "String genre". It shows the type of CD that is borrowed. 
 *
 */
public class CD extends Libraryitem {

	private String genre;

	public CD(String itemTitle, String itemCreator, int itemId, boolean itemOnloan, Date itemDueDate,
			String itemGenre) {
		super(itemTitle, itemCreator, itemId, itemOnloan, itemDueDate);

		genre = itemGenre;
	}

	public void printDetails() {
		super.printDetails();

		System.out.println("The music type is " + genre);

	}
}
