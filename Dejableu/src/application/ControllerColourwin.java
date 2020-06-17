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

public class ControllerColourwin implements Initializable {
	
	public Button next; //Not next Button!
	
	//Methode um View zu wächseln 
			public void start(ActionEvent event) {
				
		    	Stage stage;
				Parent root = null;

				stage = (Stage) next.getScene().getWindow();
				stage.setTitle("Dejableu");

				try {
					root = FXMLLoader.load(getClass().getResource("Colourgamewin.fxml"));
				} catch (IOException e) {
					e.printStackTrace();
				}

				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

}
