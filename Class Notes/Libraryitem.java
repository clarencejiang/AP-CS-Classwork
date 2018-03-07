import java.util.Date;
/**
 * 
 * @author clarence
 *Instructor: Daniel Gunn 
 *Editor: Clarence Jiang 
 *Program description: this is the superclass, defining all the 
 *shared characteristics of both books and cds. 
 */
public class Libraryitem {

	private String title;
	private String creator;
	private int itemid;
	private boolean onloan;
	private Date duedate;

	// constructor
	public Libraryitem(String itemTitle, String itemCreator, int itemId, boolean itemOnloan, Date itemDueDate) {

		title = itemTitle;
		creator = itemCreator;
		itemid = itemId;
		onloan = itemOnloan;
		duedate = itemDueDate;
	}

	public String gettitle() {
		return title;
	}

	public String getCreator() {
		return creator;
	}

	public int getitemid() {
		return itemid;
	}

	public boolean getonloan() {
		return onloan;
	}

	public Date getDueDate() {
		return duedate;
	}

	public void printDetails() {
		System.out.println("Title: " + gettitle());
		System.out.println("Creator: " + getCreator());
		System.out.println("Itemid: " + getitemid());

		if (getonloan()) {
			System.out.println(gettitle() + " is on loan ");
		} else
			System.out.println(gettitle() + " is not on loan ");

		System.out.println(getDueDate());
	}

}
