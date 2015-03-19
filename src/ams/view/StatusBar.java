package ams.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JLabel {
	
	public StatusBar()
	{
		super("AMS System v1.0");
	}

	public void setStatusText(String text)
	{
		setText(text);
	}
}
