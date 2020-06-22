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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Controller implements Initializable {
	private static Controller instance;
	

	@FXML
	public Button next;
    //private ArrayList<Shots> shot = new ArrayList<Shots>();
	private static int schluecke;
	private String[] users = {"", "", "", ""};
	@FXML 
	private Label name ;
	@FXML 
	private Label number ;
	
	@FXML
	public void displayRandomUser() {
        schluecke = (int) (Math.random() * ((users.length - 1) + 1)) + 1;

        String person = users[((int) (Math.random() * ((4 - 1) + 1)) + 1)-1];

        if(schluecke % 2 != 0) {
            System.out.println(person + " trinkt " + schluecke + " Schluck");
        }
        else {
            System.out.println(person + " trinkt " + schluecke + " Schlücke");
        }
        
        System.out.println(person);
        
        name.setText(person);
        number.setText(Integer.toString(schluecke));

	}
	
	@FXML
	public void nextGame(ActionEvent event) {
    	Stage stage;
		Parent root = null;

		stage = (Stage) next.getScene().getWindow();
		stage.setTitle("Dejableu");

		try {
			root = FXMLLoader.load(getClass().getResource("Colourgamepart1.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
    	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Controller.instance = this;
		System.out.println("Let's get wasted..");
		//System.out.println(users[0] + "ist registriert");
		
	}
	
	public void setUsers(String[] player) {
		this.users = player;
	}
	
	public static Controller getInstance() {
		return Controller.instance;
	}

}
