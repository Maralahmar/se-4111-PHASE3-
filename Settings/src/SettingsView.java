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
		  	  
		  // Add UI element to frame
		  GroupLayout layout = new GroupLayout(frame.getContentPane());
		  
		  layout.setAutoCreateGaps(true);
		  layout.setAutoCreateContainerGaps(true);
		
		  layout.setHorizontalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneLabel).addComponent(settingLeenaLabel))                                      //Leena
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneTextfield).addComponent(settingLeenaTextfield))                              //Leena
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOneSaveButton).addComponent(settingLeenaSaveButton))                            //Leena 
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(settingOnePrintButton).addComponent(settingLeenaPrintButton)));                        //Leena
		  
		  layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingOneLabel)
		    .addComponent(settingOneTextfield).addComponent(settingOneSaveButton).addComponent(settingOnePrintButton))  
		  
		   .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(settingLeenaLabel)                                    //Leena
		   .addComponent(settingLeenaTextfield).addComponent(settingLeenaSaveButton).addComponent(settingLeenaPrintButton)));                      //Leena                                                 
				  
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
		 
		 
		 
		 
		 
	 
}