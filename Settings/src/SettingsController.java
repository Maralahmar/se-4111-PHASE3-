
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
	  
	 } 
	 
	 public void initController() {
	  view.getSettingOneSaveButton().addActionListener(e -> saveSettingOne());
	  
	  view.getSettingOnePrintButton().addActionListener(e -> printToConsole());
	  
	 } 
	 
	 private void saveSettingOne() {
	  model.setConfig1(Integer.parseInt(view.getSettingOneTextfield().getText()));
	  } 
	 
	 private void printToConsole() {
	  System.out.println(model.getConfig1());
	 } 
	 
	
}