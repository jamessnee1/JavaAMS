package ams.model;

import ams.model.exception.EnrollmentException;

/**
 * @author James Snee s3369721
 * 
 */
public interface Student {

	public String getFullName();

	public int getStudentId();

	public Result[] getResults();

	public boolean addResult(Result result);

	public Course[] getCurrentEnrollment();

	public int calculateCurrentLoad();

	public int calculateCareerPoints();

	public void enrollIntoCourse(Course course) throws EnrollmentException;

	public void withdrawFromCourse(Course course);

}
