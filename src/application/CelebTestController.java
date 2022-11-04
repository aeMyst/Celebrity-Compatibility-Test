package application;

import java.io.FileInputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CelebTestController {
	Stage applicationStage;
    
	@FXML
    private Button startButton;

    @FXML
    void changeToQuestions(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/QuestionView.fxml"));
			Scene secondaryScene = new Scene(root,1024,768);
			
			applicationStage.setScene(secondaryScene);
			applicationStage.setTitle("Quiz Questions");
			applicationStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
// HI it's Jaimie

	@FXML
	private Button DoneButton;
	
	//this method does not work for some reason, please check
	@FXML 
	void changeToFinal(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/FinalView.fxml"));
			Scene finalScene = new Scene(root,1024,768);
			
			applicationStage.setScene(finalScene);
			applicationStage.setTitle("Results");
			applicationStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


