package application;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CelebTestController {
	Stage applicationStage;
	HashMap<String, Double> celebDictionary = new  HashMap<String, Double>();
	
	@FXML
	private TextField nameTextField;
	
	@FXML
	private Label nameErrorLabel;
	
	@FXML
	private TextField ageTextField;
	
	@FXML
	private Label ageErrorLabel;
    
	@FXML
    private Button startButton;
	
    @FXML
    void changeToQuestions(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/QuestionView.fxml"));
			Scene secondaryScene = new Scene(root,600,675);
			
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
	
	@FXML
	String verifyNames(String personName) {
		// initialization of variables
		boolean validName = true;
		char invalidChar = Character.MIN_VALUE;
		
		for (char c : personName.toCharArray()) {
   	  		if  ((c >= '!' && c <= '@') || (c >= '[' && c <= '`') || (c >= '{' && c <= '~') ) {
   	  			validName = false;
   	  			invalidChar = c;
   	  		} 
   	  		if (!(validName)) {
   	  			nameErrorLabel.setText("Do not use " + invalidChar + " in your name. Please enter a valid name.");
   	  		} 
	    }
		if (validName) {
			return personName;
		} else {
			return "";
		}
	}
	
	void calculateNames(String personName) {
		ArrayList<Integer> countList = new ArrayList<Integer>();
		int charCountJB = 0;
		int charCountKW = 0;
		int charCountJL = 0;
		int charCountTS = 0;
		
		String jb = "Jennifer Lopez";
		String kw = "Kanye West";		
		String jl = "Jennifer Lopez";
		String ts = "Taylor Swift";
		
		personName = personName.toLowerCase();
		
		// loop for jb
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < jb.length(); p++) {
				if (personName.charAt(i) == jb.charAt(p)) {
					charCountJB += 1; 
				}	
			}	
		}
		System.out.print("Justin Bieber " + charCountJB + '\n');
		
		// loop for kw
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < kw.length(); p++) {
				if (personName.charAt(i) == kw.charAt(p)) {
					charCountKW += 1; 
				}	
			}	
		}
		System.out.print("Kanye West " + charCountKW + '\n');
		
		// loop for jl
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < jl.length(); p++) {
				if (personName.charAt(i) == jl.charAt(p)) {
					charCountJL += 1; 
				}	
			}	
		}
		System.out.print("Jennifer Lopez " + charCountJL + '\n');
		
		// loop for ts
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < ts.length(); p++) {
				if (personName.charAt(i) == ts.charAt(p)) {
					charCountTS += 1; 
				}	
			}	
		}
		System.out.print("Taylor Swift " + charCountTS + '\n');
		
		countList.add(charCountJB);
		countList.add(charCountKW);
		countList.add(charCountJL);
		countList.add(charCountTS);
		
		countList.sort(Collections.reverseOrder());
		System.out.print("My counts from Highest to Lowest " + countList);
		
	}
	
	//this method does not work for some reason, please check
	@FXML 
	void changeToFinal(ActionEvent event) {
		
		String personName = nameTextField.getText();
		String verifiedPersonName = verifyNames(personName);
		if (verifiedPersonName.equals("")) {
			System.out.print('\n' + verifiedPersonName + '\n');
		} else {
			System.out.print('\n' + verifiedPersonName + '\n');
			calculateNames(verifiedPersonName);
		}		
	}
}