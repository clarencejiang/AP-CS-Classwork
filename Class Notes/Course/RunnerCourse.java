package Course;

public class RunnerCourse {
	public static void main (String[] args) {
		Course a = new Course("Rush B", 10, 12);
		a.addLesson("Throwing Smoke",20, true);
		a.addLesson("Flash", 30, false);
		a.addAssessment("Bot Aiming ", 100);
		a.outputCourseDetails();
	}
}
