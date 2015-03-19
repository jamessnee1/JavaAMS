package ams.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import ams.controller.ShowAddCourseDialogListener;
import ams.controller.ShowProgramDialogListener;
import ams.controller.ShowRemoveCourseDialogListener;

public class ButtonPanel extends JPanel {
	
	private JButton addProgram;
	private JButton addCourse;
	private JButton removeCourse;
	private JButton resetSoftware;
	private JButton enrollCourse;
	private JButton withdrawCourse;
	private MainFrame frame;

	public ButtonPanel(MainFrame frame)
	{
		this.frame = frame;
		addProgram = new JButton("Add Program");
		addCourse = new JButton("Add Course");
		removeCourse = new JButton("Remove Course");
		enrollCourse = new JButton("Enroll into Course");
		withdrawCourse = new JButton("Withdraw from Course");
		this.setLayout(new GridLayout(5,1));
		this.add(addProgram);
		this.add(addCourse);
		this.add(removeCourse);
		this.add(enrollCourse);
		this.add(withdrawCourse);
		
		
		addProgram.addActionListener(new ShowProgramDialogListener(frame));
		addCourse.addActionListener(new ShowAddCourseDialogListener(frame));
		removeCourse.addActionListener(new ShowRemoveCourseDialogListener(frame));
		
		
	}
}
