package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	@FXML
	public Button start;
	@FXML 
	private TextField user1;
	@FXML 
	private TextField user2;
	@FXML 
	private TextField user3;
	@FXML 
	private TextField user4;
	
	private String[] users = {"", "", "", ""};

	//Methode um View zu wächseln 
	public void start(ActionEvent event) {
		
		users[0] = user1.getText();
		users[1] = user2.getText();
		users[2] = user3.getText();
		users[3] = user4.getText();
			
    	Stage stage;
		Parent root = null;

		stage = (Stage) start.getScene().getWindow();
		stage.setTitle("Dejableu");

		try {
			root = FXMLLoader.load(getClass().getResource("randomnumbergame.fxml"));
			Controller.getInstance().setUsers(users);
			Controller.getInstance().displayRandomUser();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
