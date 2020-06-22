package application;

	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {


	@Override
	public void start(Stage stage) throws Exception {
		
		
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		
		// Create Scene
		Scene login = new Scene(root);
		
		// Set scene
		stage.setTitle("Dejableu");
		stage.setScene(login);
		stage.show();
		
		}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}