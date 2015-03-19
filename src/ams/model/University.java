package ams.model;

import java.util.*;

import ams.model.exception.EnrollmentException;
import ams.model.exception.ProgramException;

/**
 * @author James Snee s3369721
 * 
 */
public class University {

	private University university;
	private Program program;
	private Student student;

	public int calculateCurrentLoad() {
		return student.calculateCurrentLoad();
	}

	public int calculateTotalCareerPoints() {
		return student.calculateCareerPoints();
	}

	public void addStudent(Student newStudent) {

		university.setStudent(newStudent);

	}

	public void setStudent(Student newStudent) {
		this.student = newStudent;

	}

	public void setProgram(Program program) {
		this.program = program;

	}

	public Program getProgram() {
		return program;
	}

	public Student getStudent() {

		return student;
	}

	// addCourse method checks to see if the prereqs exist for course then throw
	// Exception, otherwise add to courses map//
	public void addCourse(Course course) throws ProgramException {

		if (course.getPreReqs() != null) {
			for (int i = 0; i < course.getPreReqs().length; i++) {
				if (this.getCourse(course.getPreReqs()[i]) == null) {
					throw new ProgramException("Error: Course cannot be added!");
				}

			}
		}

		program.courses.put(course.getCode(), course);

	}

	public void removeCourse(String courseCode) throws ProgramException {

		program.removeCourse(courseCode);

	}

	public Course getCourse(String courseCode) {

		return program.getCourse(courseCode);
	}

	public Course[] getProgramCourses() {
		return program.getAllCourses();
	}

	public boolean addResult(Result result) {
		return student.addResult(result);
	}

	public Result[] getResults() {
		return student.getResults();
	}

	public Course[] getCurrentEnrollment() {
		return student.getCurrentEnrollment();
	}

	public void enrollIntoCourse(String courseID) throws EnrollmentException {

		Course course = program.getCourse(courseID);

		student.enrollIntoCourse(course);

	}

	public void withdrawStudentFromCourse(String courseID)
			throws EnrollmentException {

		Course course = program.getCourse(courseID);

		student.withdrawFromCourse(course);

	}

}
