package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller implements Initializable{
	
	public Button start;
	
	//Methode um View zu wächseln 
	public void start(ActionEvent event) {
		
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
    	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Let's get wasted..");
	}

}
