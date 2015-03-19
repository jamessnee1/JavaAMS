package ams.model;

import ams.model.exception.EnrollmentException;

/**
 * @author James Snee s3369721
 * 
 */
public class UGStudent extends AbstractStudent {

	private static final int MAXIMUM_STUDY_LOAD = 60;

	public UGStudent(int studentId, String studentName) {
		super(studentId, studentName);

	}
	//checkEnrollment for UGStudent, condition is looser than PGStudent//
	public void checkEnrollment(String courseCode, Course course)
			throws EnrollmentException {

		if (course.getPreReqs() != null) {
			for (String s : course.getPreReqs()) {
				if (results.get(s) == null || !results.get(s).getResult())
					throw new EnrollmentException(
							"Error: Did not pass a prerequisite!");
			}
		}

		if (calculateCurrentLoad() + course.getCreditPoints() > MAXIMUM_STUDY_LOAD) {
			throw new EnrollmentException(
					"Error: Cannot enroll due to overloading!");
		}

	}

	public int getCredits() {

		return MAXIMUM_STUDY_LOAD;

	}

	public String toString() {
		return this.getStudentId() + ":" + this.getFullName() + ":"
				+ getCredits();

	}

}
