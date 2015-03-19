package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import ams.view.MainFrame;

public class ExitActionListener implements ActionListener {
	
	private MainFrame frame;
	
	public ExitActionListener(MainFrame frame)
	{
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(frame,
				"Are you sure you want to exit?", "Exiting", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION)
				{
				System.exit(0);
				}

				}

	}


