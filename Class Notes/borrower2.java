import java.util.Date;
import java.util.GregorianCalendar;

public class borrower {
	
	private String BorrowerName;
	private String EmailAddress; 
	private int BorrowerID;
	private int ItemsOnLoan;
	
	public borrower(String BName, String EAddress, int BID) {
		BorrowerName=BName;
		EmailAddress=EAddress; 
		BorrowerID=BID;
		ItemsOnLoan=0;
	}
	
	public String GetBorrowerName() {
		return BorrowerName;
	}
	public String GetEmailAddress() {
		return EmailAddress;
	}
	public int GetBorrowerID() {
		return BorrowerID;
	}
	public int GetItemsOnLoan() {
		return ItemsOnLoan;
	}
	
	public void UpdateItemsOnLoan(int c ) {
		ItemsOnLoan=c;
	}
	public void PrintDetails() {
		System.out.println("Borrower Name: "+GetBorrowerName());
		System.out.println("Email Address: "+ GetEmailAddress());
		System.out.println("Borrower Id: "+GetBorrowerID()  );
		
	}

}
