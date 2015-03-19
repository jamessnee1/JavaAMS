package ams.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ams.controller.AddProgramActionListener;
import ams.controller.CancelButtonActionListener;

public class ProgramDialog extends JDialog {
	
	private JLabel errorLabel;
	private JLabel enterCode;
	private JTextField code;
	private JLabel enterName;
	private JTextField name;
	private JButton confirmButton;
	private MainFrame frame;
	private JLabel programDialogTitle;
	
	public ProgramDialog(MainFrame frame)
	{
		
		this.frame = frame;
		programDialogTitle = new JLabel("Add Program");
		errorLabel = new JLabel("Default Error Text");
		errorLabel.setVisible(false);
		enterCode = new JLabel("Enter Program Code:");
		code = new JTextField();
		enterName = new JLabel("Enter Program Name:");
		name = new JTextField();
		confirmButton = new JButton("OK");
		this.setLayout(new GridLayout(7,1));
		this.add(errorLabel);
		this.add(programDialogTitle);
		this.add(enterCode);
		this.add(code);
		this.add(enterName);
		this.add(name);
		this.add(confirmButton);
		this.setSize(300,400);
		this.setLocation(500,200);
		this.setVisible(false);
		confirmButton.addActionListener(new AddProgramActionListener(frame));
		
		
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
