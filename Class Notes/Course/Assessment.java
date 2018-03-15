package Course;

public class Assessment {
	private String assessmentTitle;
	private int maxMarks;
	
	public Assessment (String assessmentTitle,int maxMarks ) {
		this.assessmentTitle=assessmentTitle;
		this.maxMarks=maxMarks;
	}
	public void outPutAssessmentDetails() {
		System.out.println("Assessment Title: "+assessmentTitle);
		System.out.println("MaxMarks: " +maxMarks);
	}
	

}
