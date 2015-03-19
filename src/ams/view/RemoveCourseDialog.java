package ams.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ams.controller.AddProgramActionListener;

public class RemoveCourseDialog extends JDialog {
	
	private JLabel errorLabel;
	private JLabel enterCode;
	private JTextField code;
	private JLabel enterName;
	private JTextField name;
	private JButton confirmButton;
	private MainFrame frame;
	private JLabel removeDialogTitle;
	
	public RemoveCourseDialog(MainFrame frame)
	{
		
		this.frame = frame;
		removeDialogTitle = new JLabel("Remove Course from Program");
		errorLabel = new JLabel("Default Error Text");
		errorLabel.setVisible(false);
		enterCode = new JLabel("Enter Course Code:");
		code = new JTextField();
		enterName = new JLabel("Enter Course Name:");
		name = new JTextField();
		confirmButton = new JButton("OK");
		this.setLayout(new GridLayout(7,1));
		this.add(errorLabel);
		this.add(removeDialogTitle);
		this.add(enterCode);
		this.add(code);
		this.add(enterName);
		this.add(name);
		this.add(confirmButton);
		this.setSize(300,400);
		this.setLocation(500,200);
		this.setVisible(false);
		
		
		
	}
	
	public String getEnteredCode()
	{
		return code.getText();
	}
	
	public String getEnteredName()
	{
		return name.getText();
	}
	
	public void displayError(String errorMessage)
	{
		errorLabel.setText(errorMessage);
		errorLabel.setForeground(Color.red);
		errorLabel.setVisible(true);
	}

}



