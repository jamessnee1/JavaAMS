package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;

import ams.view.MainFrame;

public class CancelButtonActionListener implements ActionListener {

	private MainFrame frame;
	
	public CancelButtonActionListener(MainFrame frame)
	{
		this.frame = frame;
	}

	
	public void actionPerformed(ActionEvent e)
	{
		
		frame.getAboutDialog().setVisible(false);
		
		
	}
	

}
