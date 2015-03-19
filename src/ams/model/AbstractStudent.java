package ams.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import ams.model.exception.EnrollmentException;

/**
 * @author James Snee s3369721
 * 
 */
public abstract class AbstractStudent implements Student {

	private int studentId;
	private String studentName;

	protected Map<String, Course> courses = new HashMap<String, Course>();
	protected Collection<Course> courseList = courses.values();

	protected Map<String, Result> results = new HashMap<String, Result>();

	public AbstractStudent(int studentId, String studentName) {

		this.studentId = studentId;
		this.studentName = studentName;

	}

	@Override
	public String getFullName() {

		return studentName;
	}

	@Override
	public int getStudentId() {

		return studentId;
	}

	// getResults method checks to see if results map is empty, and else return
	// result//
	public Result[] getResults() {
		if (results.isEmpty()) {
			return null;
		} else {
			Collection<Result> resultList = results.values();
			Result[] r = resultList.toArray(new Result[0]);
			return r;
		}

	}

	// addResult method checks to see if current courses are in courses hashmap
	// and then add results to result map//
	// else false//
	public boolean addResult(Result result) {
		if (courses.containsKey(result.getCourse().getCode())) {
			results.put(result.getCourse().getCode(), result);
			courses.remove(result.getCourse().getCode());
			return true;
		} else {
			return false;
		}

	}

	public Course[] getCurrentEnrollment() {
		return (courses.values().size() == 0 ? null : courses.values().toArray(
				new Course[0]));

	}

	// calculateCurrentLoad adds maximum study load to creditPoints//
	public int calculateCurrentLoad() {
		Collection<Course> enrolledCourseList = courses.values();
		int maxLoad = 0;
		for (Course c : enrolledCourseList) {
			maxLoad += c.getCreditPoints();
		}
		return maxLoad;

	}
	// calculateCareerPoints adds current credit points//
	public int calculateCareerPoints() {
		Collection<Result> resultList = results.values();
		int points = 0;
		for (Result r : resultList) {
			if (r.getResult() == true) {
				points += r.getCourse().getCreditPoints();
			} else {
				continue;
			}
		}
		return points;
	}

	public void enrollIntoCourse(Course course) throws EnrollmentException {
		if (courses.containsKey(course.getCode())) {
			throw new EnrollmentException(
					"Error: Cannot enroll into duplicate courses!");

		} else {
			checkEnrollment(course.getCode(), course);
			courses.put(course.getCode(), course);
		}

	}

	// removes course from courses map//
	public void withdrawFromCourse(Course course) {
		courses.remove(course.getCode());
	}

	// abstract method for checkEnrollment//
	public abstract void checkEnrollment(String courseCode, Course course)
			throws EnrollmentException;

}
