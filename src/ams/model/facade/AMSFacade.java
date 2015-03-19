package ams.model.facade;

import java.util.ArrayList;

import ams.model.Course;
import ams.model.Program;
import ams.model.Result;
import ams.model.Student;
import ams.model.University;
import ams.model.exception.EnrollmentException;
import ams.model.exception.ProgramException;

/**
 * @author James Snee s3369721
 * 
 */
public class AMSFacade implements AMSModel {

	private University university;

	public AMSFacade() {
		university = new University();

	}

	public int calculateCurrentLoad() {
		return university.calculateCurrentLoad();
	}

	@Override
	public int calculateCareerPoints() {
		return university.calculateTotalCareerPoints();
	}

	@Override
	public void addStudent(Student newStudent) {
		university.setStudent(newStudent);

	}

	@Override
	public Student getStudent() {
		return university.getStudent();
	}

	@Override
	public void addProgram(Program program) {
		university.setProgram(program);

	}

	@Override
	public Program getProgram() {

		return university.getProgram();
	}

	@Override
	public void addCourse(Course course) throws ProgramException {

		university.addCourse(course);

	}

	@Override
	public void removeCourse(String courseCode) throws ProgramException {
		university.removeCourse(courseCode);

	}

	@Override
	public Course getCourse(String courseCode) {
		return university.getCourse(courseCode);
	}

	@Override
	public Course[] getAllCourses() {
		return university.getProgramCourses();
	}

	@Override
	public boolean addResult(Result result) {
		return university.addResult(result);
	}

	@Override
	public Result[] getResults() {
		return university.getResults();
	}

	@Override
	public Course[] getCurrentEnrollment() {
		return university.getCurrentEnrollment();
	}

	@Override
	public void enrollIntoCourse(String courseID) throws EnrollmentException {
		university.enrollIntoCourse(courseID);

	}

	@Override
	public void withdrawFromCourse(String courseID) throws EnrollmentException {
		university.withdrawStudentFromCourse(courseID);

	}

}
