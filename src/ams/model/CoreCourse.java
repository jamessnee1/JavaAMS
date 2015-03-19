package ams.model;

/**
 * @author James Snee s3369721
 * 
 */
public class CoreCourse extends AbstractCourse {

	private final int CREDIT_POINTS = 12;

	public CoreCourse(String courseCode, String courseName,
			String[] prerequisiteCodes) {
		super(courseCode, courseName, prerequisiteCodes);

	}

	public int getCreditPoints() {

		return CREDIT_POINTS;
	}

	public String toString() {

		return super.toString() + "CORE";
	}

}
