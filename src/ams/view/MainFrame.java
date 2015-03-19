package ams.view;

import java.awt.BorderLayout;
import java.awt.Dialog;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ams.controller.ExitActionListener;
import ams.model.facade.AMSModel;

public class MainFrame extends JFrame {
	
	private TopPanel top;
	private MiddlePanel middlePanel;
	private ButtonPanel buttonPanel;
	private ProgramDialog programDialog;
	private AddCourseDialog addCourseDialog;
	private RemoveCourseDialog removeCourseDialog;
	private AMSModel model;
	private StatusBar statusBar;
	private AboutDialog about;
	private JOptionPane confirmQuit;
	private CoursePanel course;
	
	public MainFrame(AMSModel model)
	{
		super("James Snee s3369721 Programming 2 Assignment 2");
		this.model=model;
		top = new TopPanel(this);
		statusBar = new StatusBar();
		buttonPanel = new ButtonPanel(this);
		programDialog = new ProgramDialog(this);
		middlePanel = new MiddlePanel(this);
		about = new AboutDialog(this);
		this.setLayout(new BorderLayout());
		this.add(top, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.WEST);
		this.add(statusBar, BorderLayout.SOUTH);
		this.add(middlePanel, BorderLayout.EAST);
		this.setLocation(200,100); 
		this.setSize(1000,600);
		this.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public TopPanel getTopPanel()
	{
		return top;
	}
	
	public MiddlePanel getMiddlePanel()
	{
		return middlePanel;
		
	}
	
	public ButtonPanel getButtonPanel()
	{
		return buttonPanel;
	}
	
	public StatusBar getStatusBar()
	{
		return statusBar;
	}
	
	public ProgramDialog getProgramDialog()
	{
		return programDialog;
	}
	
	
	public void refreshProgramDialog()
	{
		programDialog = new ProgramDialog(this);
	}
	
	public AddCourseDialog getAddCourseDialog()
	{
		
		return addCourseDialog;
	}
	
	public RemoveCourseDialog getRemoveCourseDialog()
	{
		return removeCourseDialog;
	}
	public void refreshRemoveCourseDialog()
	{
		
		removeCourseDialog = new RemoveCourseDialog(this);
	}
	
	
	public void refreshAddCourseDialog()
	
	{
		addCourseDialog = new AddCourseDialog(this);	
	}
	
	
	
	public AMSModel getModel()
	{
		return model;
	}

	public Dialog getAboutDialog() {
		
		return about;
	}

}
