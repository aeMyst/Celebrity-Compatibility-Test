package application;
	
import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
 

public class main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/WelcomeView.fxml"));
			CelebTestController controller = (CelebTestController)loader.getController();
			controller.applicationStage = primaryStage;
			
			Scene primaryScene = new Scene(root,1024,768);
			primaryScene.getStylesheets().add(getClass().getResource("laststyle.css").toExternalForm());
			
		
		
			primaryStage.setScene(primaryScene);
			primaryStage.setTitle("Celebrity Compatibility Test");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}		
}