package ams.model;

/**
 * @author James Snee s3369721
 * 
 */
public interface Course {

	public String getCode();

	public String getTitle();

	public int getCreditPoints();

	public String[] getPreReqs();

}
