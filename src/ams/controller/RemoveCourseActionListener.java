package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ams.view.MainFrame;

public class RemoveCourseActionListener implements ActionListener 
{

	private MainFrame frame;



	public RemoveCourseActionListener()
	{
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (frame.getModel().getProgram() == null)
		{
			frame.getAddCourseDialog().displayError("Error: You must have a Program set up in order to remove a Course!");
		}
		else{

			String enteredCode = frame.getRemoveCourseDialog().getEnteredCode();
			String enteredName = frame.getRemoveCourseDialog().getEnteredName();


			//step 2: do validation
			if (enteredCode.isEmpty())
			{
				frame.getAddCourseDialog().displayError("Error: Course Code not entered!");
			}
			else if(enteredName.isEmpty())
			{
				frame.getAddCourseDialog().displayError("Error: Course Name not entered!");
			}

		}

	}
}

