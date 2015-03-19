package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ams.view.MainFrame;

public class ShowProgramDialogListener implements ActionListener {
	
	private MainFrame frame;
	
	public ShowProgramDialogListener(MainFrame frame)
	{
		this.frame = frame;
	}

	
	public void actionPerformed(ActionEvent e)
	{
		frame.refreshProgramDialog();
		frame.getProgramDialog().setVisible(true);
		
	}

}
