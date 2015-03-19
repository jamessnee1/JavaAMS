package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ams.view.AboutDialog;
import ams.view.MainFrame;

public class AboutActionListener implements ActionListener {
	
	private MainFrame frame;

	public AboutActionListener(MainFrame frame)
	{
		this.frame = frame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getAboutDialog().setVisible(true);
		
		
	}
	
	

}
