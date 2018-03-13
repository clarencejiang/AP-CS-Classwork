import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 
 * @author clarence
 *Instructor: Daniel Gunn 
 *Editor: Clarence Jiang 
 *Program description: this is the superclass, defining all the 
 *shared characteristics of both books and cds. 
 */
public abstract class Libraryitem {

	private String title;
	private String creator;
	private int itemid;
	private boolean onloan;
	private Date duedate;
	private int BorrowerID;
	

	

	// constructor
	public Libraryitem(String itemTitle, String itemCreator, int itemId, boolean itemOnloan, Date itemDueDate, int BID) {

		title = itemTitle;
		creator = itemCreator;
		itemid = itemId;
		onloan = itemOnloan;
		duedate = itemDueDate;
		BorrowerID=BID;
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
	public int getBorrowerID() {
		return BorrowerID;
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
	
	public static Date addDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		
		return cal.getTime();
	}
	public void borrowing(borrower c){
		onloan=true;
		Date today = new Date();
		duedate = addDays (today, 14);
	}
	//public void borrowing(borrower b) {
		//this.BorrowerID=b.GetBorrowerID();
		//onloan=true;
		//Date today = new Date();
		//duedate = addDays (today, 14);
	//}
	
	
	public void returning() {
		this.onloan=false; 
	}

}
