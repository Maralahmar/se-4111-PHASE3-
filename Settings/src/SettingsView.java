import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


	 public class SettingsView { 
		
	 private JFrame frame;
	 
	 //Setting One needed View elements
	 private JLabel settingOneLabel;
	 
	 private JTextField settingOneTextfield;
	 
	 private JButton settingOneSaveButton;
	 
	 private JButton settingOnePrintButton;
	 
	 
	 
	 //Setting Leena needed View elements
	 
     private JLabel settingLeenaLabel;
	 
	 private JTextField settingLeenaTextfield;
	 
	 private JButton settingLeenaSaveButton;
	 
	 private JButton settingLeenaPrintButton;
	 
	 
 //Setting Mariam needed View elements
	 
     private JLabel settingMariamLabel;
	 
	 private JTextField settingMariamTextfield;
	 
	 private JButton settingMariamSaveButton;
	 
	 private JButton settingMariamPrintButton;
	 
	 
	 
	 
	 
	 public SettingsView() {
	 
		  frame = new JFrame("Settings");
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500, 120);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);  
		  
		  // Create UI elements
		  settingOneLabel = new JLabel("Setting One:");
		  settingOneTextfield = new JTextField();
		  settingOneSaveButton = new JButton("Save setting one");
		  settingOnePrintButton = new JButton("Print to Console!");
		  
		  
		  // Create UI elements Leena
		  settingLeenaLabel = new JLabel("Setting Leena:");
		  settingLeenaTextfield = new JTextField();
		  settingLeenaSaveButton = new JButton("Save setting Leena");
		  settingLeenaPrintButton = new JButton("Print to Leena Console!");
		  
		  // Create UI elements Mariam
		  settingMariamLabel = new JLabel("Setting Mariam:");
		  settingMariamTextfield = new JTextField();
		  settingMariamSaveButton = new JButton("Save setting Mariam");
		  settingMariamPrintButton = new JButton("Print to Mariam Console!");
		  	  
		  // Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneLabel).addComponent(settingLeenaLabel).addComponent(settingMariamLabel))                                        //Leena Mariam
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneTextfield).addComponent(settingLeenaTextfield).addComponent(settingMariamTextfield))                              //Leena Mariam
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneSaveButton).addComponent(settingLeenaSaveButton).addComponent(settingMariamSaveButton))                            //Leena Mariam
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOnePrintButton).addComponent(settingLeenaPrintButton).addComponent(settingMariamPrintButton)));                        //Leena Mariam
		  
		  layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingOneLabel)
		    .addComponent(settingOneTextfield).addComponent(settingOneSaveButton).addComponent(settingOnePrintButton))  
		  
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingLeenaLabel)                                  //Leena
		    .addComponent(settingLeenaTextfield).addComponent(settingLeenaSaveButton).addComponent(settingLeenaPrintButton))                     //Leena                                                 
		
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingMariamLabel)									//mariam
		    .addComponent(settingMariamTextfield).addComponent(settingMariamSaveButton).addComponent(settingMariamPrintButton)));					//mariam
		  frame.getContentPane().setLayout(layout);
		  
		 }
	  

	 
	 public JFrame getFrame() {
	  return frame;
	 }
	 
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
	 } 
	 
	 public JLabel getSettingOneLabel() {
	  return settingOneLabel;
	 } 
	 
	 public void setSettingOneLabel(JLabel settingOneLabel) {
	  this.settingOneLabel = settingOneLabel;
	 } 
	 
	 	 
	 public JTextField getSettingOneTextfield() {
	  return settingOneTextfield;
	 } 
	 
	 public void setSettingOneTextfield(JTextField settingOneTextfield) {
	  this.settingOneTextfield = settingOneTextfield;
	 } 
	 
	 
	 
	 public JButton getSettingOneSaveButton() {
	  return settingOneSaveButton;
	 } 
	 
	 public void setSettingOneSaveButton(JButton settingOneSaveButton) {
	  this.settingOneSaveButton = settingOneSaveButton;
	 } 
	 
	 	 
	 public JButton getSettingOnePrintButton() {
	  return settingOnePrintButton;
	 } 
	 
	 public void setPrintButton(JButton print) {
	  this.settingOnePrintButton = print;
	  this.settingLeenaPrintButton = print;                                                 //Leena
	  this.settingMariamPrintButton = print;                                                 //Mariam


	 } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
     //Leena 
	 
	 public JLabel getSettingLeenaLabel() {
		  return settingLeenaLabel;
		 } 
		 
		 public void setSettingLeenaLabel(JLabel settingLeenaLabel) {
		  this.settingLeenaLabel = settingLeenaLabel;
		 } 
		 
		 	 
		 public JTextField getSettingLeenaTextfield() {
		  return settingLeenaTextfield;
		 } 
		 
		 public void setSettingLeenaTextfield(JTextField settingLeenaTextfield) {
		  this.settingLeenaTextfield = settingLeenaTextfield;
		 } 
		 
		 
		 
		 public JButton getSettingLeenaSaveButton() {
		  return settingLeenaSaveButton;
		 } 
		 
		 public void setSettingLeenaSaveButton(JButton settingLeenaSaveButton) {
		  this.settingLeenaSaveButton = settingLeenaSaveButton;
		 } 
		 
		 	 
		 public JButton getSettingLeenaPrintButton() {
		  return settingLeenaPrintButton;
		 } 
		 
		 
		 
	//mariam
		 		 
		 public JLabel getSettingMariamLabel() {
			  return settingMariamLabel;
			 } 
			 
			 public void setSettingMariamLabel(JLabel settingMariamLabel) {
			  this.settingMariamLabel = settingMariamLabel;
			 } 
			 
			 	 
			 public JTextField getSettingMariamTextfield() {
			  return settingMariamTextfield;
			 } 
			 
			 public void setSettingMariamTextfield(JTextField settingMariamTextfield) {
			  this.settingMariamTextfield = settingMariamTextfield;
			 } 
			 
			 
			 
			 public JButton getSettingMariamSaveButton() {
			  return settingMariamSaveButton;
			 } 
			 
			 public void setSettingMariamSaveButton(JButton settingMariamSaveButton) {
			  this.settingMariamSaveButton = settingMariamSaveButton;
			 } 
			 
			 	 
			 public JButton getSettingMariamPrintButton() {
			  return settingMariamPrintButton;
			 } 
		 
	 
}