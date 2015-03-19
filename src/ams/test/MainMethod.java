package ams.test;

import ams.model.facade.AMSFacade;
import ams.model.facade.AMSModel;
import ams.view.MainFrame;

public class MainMethod {
	
	public static void main(String[] args){
	
	AMSModel model = new AMSFacade();
	MainFrame frame = new MainFrame(model);
	}

}
