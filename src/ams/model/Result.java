package ams.model;

/**
 * @author James Snee s3369721
 * 
 */
public class Result {

	private Course course;
	private boolean results;
	private String grade;

	public Result(Course course, boolean results) {

		this.course = course;
		this.results = results;
		
		if (this.results == true) {
			grade = "PASS";
		} else {
			grade = "FAIL";
		}

	}

	public Course getCourse() {

		return this.course;
	}

	public boolean getResult()

	{
		return this.results;
	}

	public String toString() {
		return (this.course.getCode() + ":" + grade);
	}

}
