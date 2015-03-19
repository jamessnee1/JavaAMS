package ams.controller;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import ams.model.CoreCourse;
import ams.model.ElectiveCourse;
import ams.model.Program;
import ams.model.exception.ProgramException;
import ams.view.MainFrame;

public class AddCourseActionListener implements ActionListener {
	
	private MainFrame frame;
	
	public AddCourseActionListener(MainFrame frame)
	{
		this.frame = frame;
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		
		if (frame.getModel().getProgram() == null)
		{
			frame.getAddCourseDialog().displayError("Error: You must have a Program set up in order to enter a Course!");
		}
		else{
		
				String enteredCode = frame.getAddCourseDialog().getEnteredCode();
				String enteredName = frame.getAddCourseDialog().getEnteredName();
				
				
				//step 2: do validation
				if (enteredCode.isEmpty())
				{
					frame.getAddCourseDialog().displayError("Error: Course Code not entered!");
				}
				else if(enteredName.isEmpty())
				{
					frame.getAddCourseDialog().displayError("Error: Course Name not entered!");
				}
				else
				{
					if (frame.getAddCourseDialog().getCourseType())
					{
						try {
							frame.getModel().addCourse(new CoreCourse(enteredCode, enteredName, null));
						} catch (ProgramException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} //null is prerequisiteCodes
					}
					else
					{
						if (frame.getAddCourseDialog().getCreditPointsType()){
						try {
							frame.getModel().addCourse(new ElectiveCourse(enteredCode, enteredName, 12, null));
						} catch (ProgramException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						}
			
					}
					
					//step 3: call model function with user info
					//frame.getModel().addCourse(new Course(enteredCode, enteredName));
					frame.getStatusBar().setText("Course Added: " + frame.getModel().getCourse(enteredCode).toString());
					frame.getMiddlePanel().add(new JButton(frame.getAddCourseDialog().getEnteredName().toString() +" : "+ frame.getAddCourseDialog().getEnteredCode().toString()));
					frame.getAddCourseDialog().setVisible(false);
		

				}

		}
	}
}
