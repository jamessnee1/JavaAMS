package ams.model;

/**
 * @author James Snee s3369721
 * 
 */
public abstract class AbstractCourse implements Course {

	private String courseCode;
	private String courseName;
	private String[] prerequisiteCodes;

	public AbstractCourse(String courseCode, String courseName,
			String[] prerequisiteCodes) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.prerequisiteCodes = prerequisiteCodes;

	}

	@Override
	public String getCode() {

		return courseCode;
	}

	@Override
	public String getTitle() {

		return courseName;
	}

	@Override
	public String[] getPreReqs() {
		return prerequisiteCodes;
	}

	public String toString() {
		if (getPreReqs() == null) {
			return (getCode() + " : " + getTitle() + " : " + getCreditPoints() + " : ");
		} else {
			String toReturn = (getCode() + " : " + getTitle() + " : "
					+ getCreditPoints() + " : ");

			for (int i = 0; i < getPreReqs().length; i++) {
				if (i == getPreReqs().length - 1) {
					toReturn = toReturn.concat(getPreReqs()[i] + " : ");
				} else
					toReturn = toReturn.concat(getPreReqs()[i] + " ,  ");
			}
			return toReturn;
		}

	}

	public abstract int getCreditPoints();
}
