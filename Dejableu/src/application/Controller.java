package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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

public class Controller implements Initializable{
	
	public Button start;
    private ArrayList<Shots> shot = new ArrayList<Shots>();
	@FXML private TextField user1;
	@FXML private TextField user2;
	@FXML private TextField user3;
	@FXML private TextField user4;
  
//	private String[] users;
	
	//Methode um View zu w�chseln 
	public void start(ActionEvent event) {
		
		//newuser.setVisible(false);
//		String a = user1.getText();
//		String b = user2.getText();
//		String c = user3.getText();
//		String d = user4.getText();
//		
//		users[0] = a;
//		users[1] = b;
//		users[2] = c;
//		users[3] = d;
		
    	Stage stage;
		Parent root = null;

		stage = (Stage) start.getScene().getWindow();
		stage.setTitle("Dejableu");

		try {
			root = FXMLLoader.load(getClass().getResource("Randomnumbergame.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void displayRandomUser(String[] usr) {
		
	}
	
    	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Let's get wasted..");
		//System.out.println(users[0] + "ist registriert");
	}

}