package Course;

public class Lesson {
	private String lessonTitle;
	private int durationMinutes;
	private boolean requireLab;
	
	public Lesson(String lessonTitle,int durationMinutes,boolean requireLab) {
		
		this.lessonTitle=lessonTitle;
		this.durationMinutes=durationMinutes;
		this.requireLab=requireLab;
	}
	
	public void outPutLessonDetails() {
		System.out.println("Lesson Title: "+lessonTitle);
		System.out.println("Duration Minutes: "+durationMinutes);
		System.out.println("Does it require lab: "+requireLab);
	}
}
