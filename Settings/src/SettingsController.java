
public class SettingsController { 
	
	private SettingsModel model;
	private SettingsView view; 
 
	 public SettingsController(SettingsModel m, SettingsView v) {
	  model = m;
	  view = v;
	  initView();
	 } 
	 
	 public void initView() {
	  view.getSettingOneTextfield().setText(Integer.toString(model.getConfig1()));
	  view.getSettingLeenaTextfield().setText(Integer.toString(model.getconfigLeena()));             //Leena
	  view.getSettingMariamTextfield().setText(Integer.toString(model.Mariamgetconfig()));             //Mariam

	 } 
	 
	 public void initController() {
	  view.getSettingOneSaveButton().addActionListener(e -> saveSettingOne());
	  
	  view.getSettingOnePrintButton().addActionListener(e -> printToConsole());
	  
      view.getSettingLeenaSaveButton().addActionListener(e -> saveSettingLeena());                   //Leena
	  
	  view.getSettingLeenaPrintButton().addActionListener(e -> printToConsoleLeena());                    //Leena

	  view.getSettingMariamSaveButton().addActionListener(e -> saveSettingMariam());                  //Mariam
	  
	  view.getSettingMariamPrintButton().addActionListener(e -> printToConsoleMariam());    				//Mariam
	 } 
	 
	 private void saveSettingOne() {
	  model.setConfig1(Integer.parseInt(view.getSettingOneTextfield().getText()));
	  } 
	 
	 private void printToConsole() {
	  System.out.println(model.getConfig1());
	 }
	 
	 //Leena
	 private void printToConsoleLeena() {
		  System.out.println(model.getconfigLeena());                                	  

		 }
	//Mariam

	 private void printToConsoleMariam() {
	  System.out.println(model.Mariamgetconfig());                                  
	 }
	 // leena
	 private void saveSettingLeena() {
	  model.setconfigLeena(Integer.parseInt(view.getSettingLeenaTextfield().getText()));  				//Leena
	  
	 } 
	//Mariam
	 private void saveSettingMariam() {
		  model.Mariamsetconfig(Integer.parseInt(view.getSettingMariamTextfield().getText()));            
		 } 
}