
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

	 } 
	 
	 public void initController() {
	  view.getSettingOneSaveButton().addActionListener(e -> saveSettingOne());
	  
	  view.getSettingOnePrintButton().addActionListener(e -> printToConsole());
	  
      view.getSettingLeenaSaveButton().addActionListener(e -> saveSettingLeena());                   //Leena
	  
	  view.getSettingLeenaPrintButton().addActionListener(e -> printToConsole());                    //Leena
	  
	 } 
	 
	 private void saveSettingOne() {
	  model.setConfig1(Integer.parseInt(view.getSettingOneTextfield().getText()));
	  } 
	 
	 private void printToConsole() {
	  System.out.println(model.getConfig1());
	  System.out.println(model.getconfigLeena());                                  //Leena

	 } 
	 

	 private void saveSettingLeena() {
	  model.setconfigLeena(Integer.parseInt(view.getSettingLeenaTextfield().getText()));            //Leena
	  } 
	 
	
}