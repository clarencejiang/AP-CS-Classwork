import java.util.Date;
/**
 *Instructor: Daniel Gunn 
 *Editor: Clarence Jiang 
 *Program description: this is the subclass of "Book". It has a 
 *special characteristic of "boolean isrequested". It aims to check
 *whether the book is requested by others.
 *
 */

public class Book extends Libraryitem {

	private boolean isrequested;

	public Book(String itemTitle, String itemCreator, int itemId, boolean itemOnloan, Date itemDueDate,
			boolean isrequestedd) {
		super(itemTitle, itemCreator, itemId, itemOnloan, itemDueDate);

		isrequested = isrequestedd;

	}

	public void printDetails() {
		super.printDetails();
		if (isrequested) {
			System.out.println("The book is requested, you have to wait for a while");

		} else
			System.out.println("The book is not requested, you can just take it");
	}

	}

