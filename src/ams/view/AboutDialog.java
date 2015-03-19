package ams.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ams.controller.AboutActionListener;
import ams.controller.AddProgramActionListener;
import ams.controller.CancelButtonActionListener;

public class AboutDialog extends JDialog {
	
	private JTextArea about = new JTextArea(5 ,20);
	private JButton confirmButton;
	private MainFrame frame;
	
	
	public AboutDialog(MainFrame frame)
	{
		
		this.frame = frame;
		about = new JTextArea(" James Snee s3369721 Programming 2 Assignment 2 (GUI)." + "Coded in Eclipse Java EE IDE for Web Developers.");
		about.setLineWrap(true);
		about.setEditable(false);
		confirmButton = new JButton("OK");
		this.setLayout(new GridLayout(2,1));
		this.add(about);
		this.add(confirmButton);
		this.setSize(380,150);
		this.setLocation(500,200);
		this.setVisible(false);
		confirmButton.addActionListener(new CancelButtonActionListener(frame));
		
		
	}
	

}



