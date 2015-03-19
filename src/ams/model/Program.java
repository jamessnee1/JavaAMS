package ams.model;

import java.util.*;

import ams.model.exception.ProgramException;

/**
 * @author James Snee s3369721
 * 
 */
public class Program {

	private String programCode;
	private String programName;

	HashMap<String, Course> courses = new HashMap<String, Course>();

	public Program(String programCode, String programName) {

		this.programCode = programCode;
		this.programName = programName;

	}

	public String getProgramCode() {
		return programCode;
	}

	public String getProgramName() {
		return programName;
	}

	public String toString() {
		return (this.getProgramCode() + " : " + this.getProgramName());

	}

	public Course getCourse(String courseCode) {
		return courses.get(courseCode);
	}
	//getAllCourses, if there are no courses return null, otherwise convert courses to array and return//
	public Course[] getAllCourses() {
		if (courses.size() == 0) {
			return null;
		} else {
			Collection<Course> courselist = courses.values();
			Course[] c = courselist.toArray(new Course[0]);
			return c;

		}
	}
	//removeCourse checks to see for every value in courselist if prereqs dont exist, continue, else
	//throw exception, cannot remove//
	public void removeCourse(String courseCode) throws ProgramException {
		Collection<Course> courseList = courses.values();
		for (Course c : courseList) {
			String[] checkPreReqs = c.getPreReqs();
			if (checkPreReqs == null) {
				continue;
			}

			else {
				for (int i = 0; i < checkPreReqs.length; i++) {
					if (checkPreReqs[i].equals(courseCode)) {
						throw new ProgramException(
								"Error: Cannot remove course!");
					}
				}

			}

		}
		courses.remove(courseCode);
	}
}
