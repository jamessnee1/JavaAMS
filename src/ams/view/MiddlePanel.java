package ams.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MiddlePanel extends JPanel {
	
	private MainFrame frame;
	private JPanel coursePanel;
	
	public MiddlePanel(MainFrame frame)
	{
		this.frame=frame;
		setLayout(new GridLayout(0,4));
	
		frame.repaint();
	}
	
	public JPanel getCoursePanel()
	{
		return coursePanel;
	}

}
