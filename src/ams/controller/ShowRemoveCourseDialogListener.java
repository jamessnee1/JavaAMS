package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ams.view.MainFrame;

public class ShowRemoveCourseDialogListener implements ActionListener {
	
	private MainFrame frame;
	
	public ShowRemoveCourseDialogListener(MainFrame frame)
	{
		this.frame = frame;
	}

	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		frame.refreshRemoveCourseDialog();
		frame.getRemoveCourseDialog().setVisible(true);
		
		
	}


}
