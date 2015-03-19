package ams.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import ams.controller.AddCourseActionListener;
import ams.controller.AddProgramActionListener;
import ams.controller.CancelButtonActionListener;

public class AddCourseDialog extends JDialog {
	
	private JLabel errorLabel;
	private JLabel enterCode;
	private JTextField code;
	private JLabel enterName;
	private JTextField name;
	private JRadioButton core;
	private JRadioButton elective;
	private ButtonGroup bg;
	private JButton confirmButton;
	private MainFrame frame;
	private JLabel programDialogTitle;
	private JLabel creditpoints;
	private JRadioButton six;
	private JRadioButton twelve;
	private ButtonGroup credpoints;
	
	
	
	public AddCourseDialog(MainFrame frame)
	{
		
		this.frame = frame;
		programDialogTitle = new JLabel("Add Course to Program");
		errorLabel = new JLabel("Default Error Text");
		errorLabel.setVisible(false);
		enterCode = new JLabel("Enter Course Code:");
		code = new JTextField();
		enterName = new JLabel("Enter Course Name:");
		name = new JTextField();
		core = new JRadioButton("Core Course", true);
		elective = new JRadioButton("Elective Course", false);
		creditpoints = new JLabel("Credit Points");
		six = new JRadioButton("6", true);
		twelve = new JRadioButton("12", false);
		confirmButton = new JButton("OK");
		this.setLayout(new GridLayout(13,1));
		this.add(errorLabel);
		this.add(programDialogTitle);
		this.add(enterCode);
		this.add(code);
		this.add(enterName);
		this.add(name);
		this.add(core);
		this.add(elective);
		bg = new ButtonGroup();
		bg.add(core);
		bg.add(elective);
		this.add(creditpoints);
		this.add(six);
		this.add(twelve);
		credpoints = new ButtonGroup();
		credpoints.add(six);
		credpoints.add(twelve);
		this.add(confirmButton);
		this.setSize(450,400);
		this.setLocation(500,200);
		this.setVisible(false);
		confirmButton.addActionListener(new AddCourseActionListener(frame));
		
		
		
	}
	
	public String getEnteredCode()
	{
		return code.getText();
	}
	
	public String getEnteredName()
	{
		return name.getText();
	}
	
	public boolean getCourseType()
	{
		return core.isSelected();
	}
	
	public boolean getCreditPointsType()
	{
		return six.isSelected();
	}
	

	
	
	public void displayError(String errorMessage)
	{
		errorLabel.setText(errorMessage);
		errorLabel.setForeground(Color.red);
		errorLabel.setVisible(true);
	}

}

