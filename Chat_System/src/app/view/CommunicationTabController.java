package app.view;

import app.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user.User;

public class CommunicationTabController {
	@FXML
	private TextField nickName;
	@FXML
	private Button connectionButton;

	// Reference to the main application.
	private MainApp mainApp;

	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public CommunicationTabController() {

    }

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		
	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

		// Add observable list data to the table
		//personTable.setItems(mainApp.getPersonData());
	}
	
	/**
	 * Called when the user clicks on the send button.
	 */
	@FXML
	private void handleConnection() {
		String pseudo = this.nickName.getText();
		if (pseudo != null && !pseudo.equals("")) {
			User user = new User(pseudo);
			this.mainApp.setUser(user);
			//Un fois que l'utilisateur a été créé dans la main ap, on peut appeler la méthode de connection
			this.mainApp.connect();
		}
		else {
			
		}
	}
}