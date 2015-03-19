package ams.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import ams.controller.AboutActionListener;
import ams.controller.AddCourseActionListener;
import ams.controller.AddProgramActionListener;
import ams.controller.ExitActionListener;
import ams.controller.ShowAddCourseDialogListener;
import ams.controller.ShowProgramDialogListener;
import ams.controller.ShowRemoveCourseDialogListener;

public class TopPanel extends JPanel {
	
	private JMenuBar menuBar;
	private MainFrame frame;
	
	public TopPanel(MainFrame frame)
	{
		
		this.frame = frame;
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		JMenu file = new JMenu("File");
		JMenuItem addProgram = new JMenuItem("Add Program");
		file.add(addProgram);
		JMenuItem addCourse = new JMenuItem("Add Course");
		file.add(addCourse);
		JMenuItem removeCourse = new JMenuItem("Remove Course");
		file.add(removeCourse);
		JMenuItem exit = new JMenuItem("Exit Program");
		file.add(exit);
		menuBar.add(file);
		exit.addActionListener(new ExitActionListener(frame));
		addProgram.addActionListener(new ShowProgramDialogListener(frame));
		addCourse.addActionListener(new ShowAddCourseDialogListener(frame));
		removeCourse.addActionListener(new ShowRemoveCourseDialogListener(frame));
		
		JMenu help = new JMenu("Help");
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		menuBar.add(help);
		about.addActionListener(new AboutActionListener(frame));

		
	}
	

	
	
	


}
