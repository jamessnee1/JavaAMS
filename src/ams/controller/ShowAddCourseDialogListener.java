package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ams.view.MainFrame;


public class ShowAddCourseDialogListener implements ActionListener {
	
private MainFrame frame;
	
	public ShowAddCourseDialogListener(MainFrame frame)
	{
		this.frame = frame;
	}

	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.refreshAddCourseDialog();
		frame.getAddCourseDialog().setVisible(true);
		
		
	}

}
