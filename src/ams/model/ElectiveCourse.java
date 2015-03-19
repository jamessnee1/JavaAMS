package ams.model;

/**
 * @author James Snee s3369721
 * 
 */
public class ElectiveCourse extends AbstractCourse {

	private int creditPoints;

	public ElectiveCourse(String courseCode, String courseTitle,
			int creditPoints, String[] prerequisiteCodes) {
		super(courseCode, courseTitle, prerequisiteCodes);
		this.creditPoints = creditPoints;
	}

	@Override
	public int getCreditPoints() {

		return creditPoints;
	}

	public int setCreditPoints() {

		return creditPoints;
	}

	public String toString() {

		return super.toString() + "ELECTIVE";
	}

}
