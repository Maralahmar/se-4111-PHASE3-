
public class SettingsComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
			  // Assemble all the pieces of the MVC
			  SettingsModel m =  SettingsModel.getInstance();
			  SettingsView v = new SettingsView();
			  SettingsController c = new SettingsController(m, v);
			  
			  c.initController();
		 
			}

	}
