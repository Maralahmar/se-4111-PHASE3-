public class SettingsModel {
	
private static SettingsModel uniqueInstance;

// other useful instance variables here

	private SettingsModel() {
	}
	
	private int config1;
	
	public static SettingsModel getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SettingsModel();
		}
	
		return uniqueInstance;
	}
	// other useful methods here
	
	/* 
	 * this function to set port number
	 * @param port number
	 *
	 * 
	 */
	public void setConfig1(int con) {
		assert con>0;
		config1=con;
	}
	
	public int getConfig1() {
		
		return config1;
	}

}