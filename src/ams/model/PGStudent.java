package ams.model;

import ams.model.exception.EnrollmentException;

/**
 * @author James Snee s3369721
 * 
 */
public class PGStudent extends AbstractStudent {

	private static final int MAXIMUM_STUDY_LOAD = 48;

	public PGStudent(int studentId, String studentName) {
		super(studentId, studentName);
	}

	public int getCredits() {

		return MAXIMUM_STUDY_LOAD;
	}

	public String toString() {
		return this.getStudentId() + ":" + this.getFullName() + ":"
				+ getCredits();

	}

	public boolean checkForFailure() {
		for (Result r : results.values()) {
			if (!r.getResult()) {
				return true;
			}
		}

		return false;
	}
	//checkEnrollment for PGStudent, condition is stricter than UGStudent//
	public void checkEnrollment(String courseCode, Course course)
			throws EnrollmentException {

		if (course.getPreReqs() != null) {
			int count = 0;
			for (String s : course.getPreReqs()) {
				if (results.get(s) != null && results.get(s).getResult()) {
					count++;
				}

			}

			if (count == 0) {
				throw new EnrollmentException(
						"Error: Did not pass a prerequisite!");
			}
		}

		int maxStudyLoad = MAXIMUM_STUDY_LOAD + (checkForFailure() ? 0 : 6);
		if (calculateCurrentLoad() + course.getCreditPoints() > maxStudyLoad) {
			throw new EnrollmentException(
					"Error: Cannot enroll due to overloading!");
		}
	}

}
