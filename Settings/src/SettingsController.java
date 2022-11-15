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
 view.getSettingMariamTextfield().setText(Integer.toString(model.Mariamgetconfig()));          //Mariam
 view.getSettingHadeelTextfield().setText(Integer.toString(model.Hadeelgetconfig()));          //Hadeel
}

public void initController() {
 view.getSettingOneSaveButton().addActionListener(e -> saveSettingOne());
 
 view.getSettingOnePrintButton().addActionListener(e -> printToConsole());
 
      view.getSettingLeenaSaveButton().addActionListener(e -> saveSettingLeena());                   //Leena
 
 view.getSettingLeenaPrintButton().addActionListener(e -> printToConsoleLeena());                    //Leena

 view.getSettingMariamSaveButton().addActionListener(e -> saveSettingMariam());                  //Mariam
 
 view.getSettingMariamPrintButton().addActionListener(e -> printToConsoleMariam());           //Mariam
 
      view.getSettingHadeelSaveButton().addActionListener(e -> saveSettingHadeel());                  //Hadeel
 
 view.getSettingHadeelPrintButton().addActionListener(e -> printToConsoleHadeel());             //Hadeel
 
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


//Hadeel
private void printToConsoleHadeel() {
 System.out.println(model.Hadeelgetconfig());  

}

// leena
private void saveSettingLeena() {
 model.setconfigLeena(Integer.parseInt(view.getSettingLeenaTextfield().getText()));   //Leena
 
}
//Mariam
private void saveSettingMariam() {
 model.Mariamsetconfig(Integer.parseInt(view.getSettingMariamTextfield().getText()));            
}
 

// Hadeel
private void saveSettingHadeel() {
model.Hadeelsetconfig(Integer.parseInt(view.getSettingHadeelTextfield().getText()));



}
}