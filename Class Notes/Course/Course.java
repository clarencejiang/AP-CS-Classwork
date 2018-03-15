package Course;

public class Course {
	private String courseTitle;
	private int maxStudents;
	private int numberOfLessons;
	private Lesson[] courseLesson = new Lesson[50];
	private Assessment courseAssessment;
	
	
	public Course(String courseTitle, int maxStudents, int numberOfLessons) {
		this.courseTitle=courseTitle;
		this.maxStudents=maxStudents;
		this.numberOfLessons=numberOfLessons;
		
	}
	
	public void addLesson(String lessonTitle,int durationMinutes,boolean requireLab) {
		for (int i=0; i<courseLesson.length;i++) {
			if (courseLesson[i]==null) {
				courseLesson[i]= new Lesson(lessonTitle,durationMinutes,requireLab);
				break;
			}	
			
		}
		
	}
	
	public void addAssessment(String assessmentTitle,int maxMarks) {
	
		courseAssessment=new Assessment(assessmentTitle, maxMarks);
	}
	
	public void outputCourseDetails() {
		System.out.println("Course Title: "+ courseTitle);
		System.out.println("The max number of students: "+maxStudents);
		System.out.println("The number of lessons: "+  numberOfLessons);
		
		System.out.println();
		
		
		
		for(int i=0;i<courseLesson.length;i++) {
			if (courseLesson[i]!=null) {
			System.out.println("Lesson "+(i+1));
			courseLesson[i].outPutLessonDetails();
			System.out.println();
			
		}
			
			
		}
		this.courseAssessment.outPutAssessmentDetails(); 
		
		
		
	}
}
