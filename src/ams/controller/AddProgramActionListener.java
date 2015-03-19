package ams.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ams.model.Program;
import ams.view.MainFrame;

public class AddProgramActionListener implements ActionListener {
	
	private MainFrame frame;
	
	
	public AddProgramActionListener(MainFrame frame)
	{
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//step 1: get user entered info
		String enteredCode = frame.getProgramDialog().getEnteredCode();
		String enteredName = frame.getProgramDialog().getEnteredName();
		//step 2: do validation
		if (enteredCode.isEmpty())
		{
			frame.getProgramDialog().displayError("Error: Program Code not entered!");
		}
		else if(enteredName.isEmpty())
		{
			frame.getProgramDialog().displayError("Error: Program Name not entered!");
		}
		else
		{
			//step 3: call model function with user info
			frame.getModel().addProgram(new Program(enteredCode, enteredName));
			frame.getMiddlePanel().add(new JButton(frame.getProgramDialog().getEnteredName().toString() +" : "+ frame.getProgramDialog().getEnteredCode().toString()));
			frame.getStatusBar().setText("Program Added: " + frame.getModel().getProgram().toString());
			frame.getProgramDialog().setVisible(false);
			
		}
	}

}
