package application;

import java.io.FileInputStream;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CelebTestController {
	Stage applicationStage;
	HashMap<String, Double> celebList = new HashMap<String, Double>();
	

    
	@FXML
    private Button startButton;
	//sup guys its julii
    @FXML
    void changeToQuestions(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/QuestionView.fxml"));
			Scene secondaryScene = new Scene(root,300,675);
			
			applicationStage.setScene(secondaryScene);
			applicationStage.setTitle("Quiz Questions");
			applicationStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }

	
	//food buttons
	@FXML 
	private Button PizzaFoodButton;
	
	@FXML 
	private Button PastaFoodButton;
	
	@FXML 
	private Button SushiFoodButton;
	
	@FXML 
	private Button IceCreamFoodButton;
	
	@FXML
	void setFoodAnswer (ActionEvent event) {
		//enter code that will match users answer with canidate's answer and increase compatibility %
	}
	
	//season buttons
	@FXML 
	private Button FallSeasonButton;
	
	@FXML 
	private Button WinterSeasonButton;
	
	@FXML 
	private Button SpringSeasonButton;
	
	@FXML 
	private Button SummerSeasonButton;
	
	@FXML
	void setSeasonAnswer (ActionEvent event) {
		//enter code that will match users answer with canidate's answer and increase compatibility %
		//change text colour or something of whatever button is pressed to show what answer 
		//has been selected
	}
	
	//colour buttons
	@FXML 
	private Button RedColourButton;
	
	@FXML 
	private Button GreenColourButton;
	
	@FXML 
	private Button BlueColourButton;
	
	@FXML 
	private Button YellowColourButton;
	
	@FXML
	void setColourAnswer (ActionEvent event) {
		//enter code that will match users answer with canidate's answer and increase compatibility %
	}
	
	//music buttons
	@FXML 
	private Button RapMusicButton;
	 
	@FXML 
	private Button PopMusicButton;
	
	@FXML 
	private Button IndieMusicButton;
	
	@FXML 
	private Button ClassicalMusicButton;
	
	@FXML
	void setMusicAnswer (ActionEvent event) {
		//enter code that will match users answer with canidate's answer and increase compatibility %
	}
	
	//animal buttons
	@FXML 
	private Button CatAnimalButton;
	
	@FXML 
	private Button DogAnimalButton;
	
	@FXML
	void setAnimalAnswer (ActionEvent event) {
		//enter code that will match users answer with canidate's answer and increase compatibility %
	}
	
	//other components of questions
	@FXML
	private Slider SpontaneousSlider;
	
	@FXML
	private ChoiceBox<String> ZodiacSignChoiceBox;
	
	@FXML
	private Slider IntroExtroSlider;
	
	@FXML
	private Label DisplayCompatibilityScoreLabel;
	
	


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


