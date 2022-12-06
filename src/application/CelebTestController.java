package application;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CelebTestController {
	// instance variables
	Stage applicationStage;
	
	// instance variables of stage
	private Parent root;
	private Stage stage;
	private Scene scene; 
	
	// boolean variables to for button press testing
	boolean answerZodaic = false;
	boolean answerName = false;
	boolean answerAge = false;
	
	boolean foodButton = false;
	boolean seasonButton = false;
	boolean colourButton = false;
	boolean musicButton = false;
	boolean animalButton = false;
	
	double allButtonsPressed = 0;

	// arrayList's for each celebrity
	ArrayList<Double> justinBieberList = new ArrayList<Double>();
	ArrayList<Double> jenniferLopezList = new ArrayList<Double>();
	ArrayList<Double> taylorSwiftList = new ArrayList<Double>();
	ArrayList<Double> pitbullList = new ArrayList<Double>();	

	// start button
	@FXML
	private Button startButton;
	
	// error labels
	@FXML
	private Label ageErrorLabel;
	@FXML
	private Label mainErrorLabel;
	@FXML
	private Label nameErrorLabel;
	
	// textfield questions
	@FXML
	private TextField nameTextField;
	@FXML
	private TextField ageTextField;

	// food buttons
	@FXML 
	private Button PizzaFoodButton;
	@FXML 
	private Button PastaFoodButton;
	@FXML 
	private Button SushiFoodButton;
	@FXML 
	private Button IceCreamFoodButton;

	// season buttons
	@FXML 
	private Button FallSeasonButton;
	@FXML 
	private Button WinterSeasonButton;
	@FXML 
	private Button SpringSeasonButton;
	@FXML 
	private Button SummerSeasonButton;

	// colour buttons
	@FXML 
	private Button RedColourButton;
	@FXML 
	private Button GreenColourButton;
	@FXML 
	private Button BlueColourButton;
	@FXML 
	private Button YellowColourButton;
	
	// music buttons
	@FXML 
	private Button RapMusicButton;
	@FXML 
	private Button PopMusicButton;
	@FXML 
	private Button IndieMusicButton;
	@FXML 
	private Button ClassicalMusicButton;
	
	// animal buttons
	@FXML 
	private Button CatAnimalButton;
	@FXML 
	private Button DogAnimalButton;
	
	// slider questions
	@FXML
	private Slider SpontaneousSlider;
	@FXML
	private Slider IntroExtroSlider;
	
	// choicebox question
	@FXML
	private ChoiceBox<String> ZodiacSignChoiceBox;
	
	// done button
	@FXML
	private Button DoneButton;
	
	// method to change to questions scene after clicking start button
	@FXML
    void changeToQuestions(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/QuestionView.fxml"));

			Scene secondaryScene1 = new Scene(root,650,700);
			secondaryScene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			
			applicationStage.setScene(secondaryScene1);
			applicationStage.setTitle("Quiz Questions");
			applicationStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
	
	// method to call Question class for food buttons
	@FXML
	void setFoodAnswer (ActionEvent event) {
		
	    allButtonsPressed += 1;
		
	    if (foodButton == false) {
	    	 //this is able to tell me what button was pressed by returning the fx id
			Button btn = (Button) event.getSource();
			String id = btn.getId();
			
			//calling objects for question class for each button
			Question buttonQuestionPizza = new Question(id, "PizzaFoodButton");
			buttonQuestionPizza.match();
			jenniferLopezList.add(buttonQuestionPizza.getPercentage());
			
			Question buttonQuestionSushi = new Question(id, "SushiFoodButton");
			buttonQuestionSushi.match();
			justinBieberList.add(buttonQuestionSushi.getPercentage());
			
			Question buttonQuestionPasta = new Question(id, "PastaFoodButton");
			buttonQuestionPasta.match();
			pitbullList.add(buttonQuestionPasta.getPercentage());
			
			Question buttonQuestionIceCream = new Question(id,"IceCreamFoodButton");
			buttonQuestionIceCream.match();
			taylorSwiftList.add(buttonQuestionIceCream.getPercentage());
			
			//using class method isWidgetUsed, it will determine which button we need to disable
			PizzaFoodButton.setDisable((buttonQuestionPizza.isWidgetUsed()));
			SushiFoodButton.setDisable(buttonQuestionSushi.isWidgetUsed());
			IceCreamFoodButton.setDisable((buttonQuestionIceCream.isWidgetUsed()));
			PastaFoodButton.setDisable((buttonQuestionPasta.isWidgetUsed()));
			
			foodButton = true;
	    }
	}
	
	// method to call Question class for season buttons
	@FXML
	void setSeasonAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		if (seasonButton == false) {
			//this is able to tell me what button was pressed by returning the fx id
			Button btn = (Button) event.getSource();
			String id = btn.getId();
			
			//calling objects for question class for each button
			Question buttonQuestionFall = new Question(id, "FallSeasonButton");
			buttonQuestionFall.match();
			justinBieberList.add(buttonQuestionFall.getPercentage());
			
			Question buttonQuestionWinter = new Question(id, "WinterSeasonButton");
			buttonQuestionWinter.match();
			pitbullList.add(buttonQuestionWinter.getPercentage());
			
			
			Question buttonQuestionSpring = new Question(id,"SpringSeasonButton");
			buttonQuestionSpring.match();
			taylorSwiftList.add(buttonQuestionSpring.getPercentage());
			
			
			Question buttonQuestionSummer = new Question(id,"SummerSeasonButton");
			buttonQuestionSummer.match();
			jenniferLopezList.add(buttonQuestionSummer.getPercentage());
			
			//using class method isWidgetUsed, it will determine which button we need to disable

			FallSeasonButton.setDisable((buttonQuestionFall.isWidgetUsed()));
			WinterSeasonButton.setDisable((buttonQuestionWinter.isWidgetUsed()));
			SpringSeasonButton.setDisable(buttonQuestionSpring.isWidgetUsed());
			SummerSeasonButton.setDisable((buttonQuestionSummer.isWidgetUsed()));

			seasonButton = true;
		}
	}
	
	// method to call Question class for color buttons
	@FXML
	void setColourAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		if (colourButton == false) {
			//this is able to tell me what button was pressed by returning the fx id
			Button btn = (Button) event.getSource();
			String id = btn.getId();
		
			//calling objects for question class for each button
			Question buttonQuestionRed = new Question(id, "RedColourButton");
			buttonQuestionRed.match();
			pitbullList.add(buttonQuestionRed.getPercentage());
			
			Question buttonQuestionGreen = new Question(id, "GreenColourButton");
			buttonQuestionGreen.match();
			justinBieberList.add(buttonQuestionGreen.getPercentage());
			
			
			Question buttonQuestionYellow = new Question(id,"YellowColourButton");
			buttonQuestionYellow.match();
			taylorSwiftList.add(buttonQuestionYellow.getPercentage());
			
			Question buttonQuestionBlue = new Question(id,"BlueColourButton");
			buttonQuestionBlue.match();
			jenniferLopezList.add(buttonQuestionBlue.getPercentage());
			
			//using class method isWidgetUsed, it will determine which button we need to disable

			RedColourButton.setDisable((buttonQuestionRed.isWidgetUsed()));
			GreenColourButton.setDisable((buttonQuestionGreen.isWidgetUsed()));
			YellowColourButton.setDisable((buttonQuestionYellow.isWidgetUsed()));
			BlueColourButton.setDisable(buttonQuestionBlue.isWidgetUsed());

			colourButton = true;
		}
	}
	
	// method to call Question class for music buttons
	@FXML
	void setMusicAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		if (musicButton == false) {
			//this is able to tell me what button was pressed by returning the fx id
			Button btn = (Button) event.getSource();
			String id = btn.getId();

			//calling objects for question class for each button
			Question buttonQuestionRap = new Question(id, "RapMusicButton");
			buttonQuestionRap.match();
			pitbullList.add(buttonQuestionRap.getPercentage());
			
			Question buttonQuestionPop = new Question(id, "PopMusicButton");
			buttonQuestionPop.match();
			justinBieberList.add(buttonQuestionPop.getPercentage());
			
			Question buttonQuestionClassical = new Question(id,"ClassicalMusicButton");
			buttonQuestionClassical.match();
			jenniferLopezList.add(buttonQuestionClassical.getPercentage());
			
			Question buttonQuestionIndie = new Question(id,"IndieMusicButton");
			buttonQuestionIndie.match();
			taylorSwiftList.add(buttonQuestionIndie.getPercentage());
			
			//using class method isWidgetUsed, it will determine which button we need to disable

			RapMusicButton.setDisable((buttonQuestionRap.isWidgetUsed()));
			PopMusicButton.setDisable(buttonQuestionPop.isWidgetUsed());
			ClassicalMusicButton.setDisable((buttonQuestionClassical.isWidgetUsed()));
			IndieMusicButton.setDisable((buttonQuestionIndie.isWidgetUsed()));

			musicButton = true;
		}
	}

	// method to call Question class for animal buttons
	@FXML
	void setAnimalAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		if (animalButton == false) {
			//this is able to tell me what button was pressed by returning the fx id
			Button btn = (Button) event.getSource();
			String id = btn.getId();

			//calling objects for question class for each button
			Question buttonQuestionDog = new Question(id, "DogAnimalButton", 5.0);
			buttonQuestionDog.match();
			pitbullList.add(buttonQuestionDog.getPercentage());
			taylorSwiftList.add(buttonQuestionDog.getPercentage());
			
			Question buttonQuestionCat = new Question(id, "CatAnimalButton", 5.0);
			buttonQuestionCat.match();
			jenniferLopezList.add(buttonQuestionCat.getPercentage());
			justinBieberList.add(buttonQuestionCat.getPercentage());
			
			//using class method isWidgetUsed, it will determine which button we need to disable

			DogAnimalButton.setDisable((buttonQuestionDog.isWidgetUsed()));
			CatAnimalButton.setDisable(buttonQuestionCat.isWidgetUsed());
			
			animalButton = true;
		}
	}
 

	/**
	 * Method that calculates the total compatibility score from passed celebrity list
	 * 
	 */
	double calculateCompatibility(ArrayList<Double> celebList) {
		double totalPercent = 0.0;
		
		for (int i = 0; i < celebList.size(); i++) {
			double percent = celebList.get(i);
			totalPercent += percent;
		}
		return totalPercent;
	}
	
	
	
	/**
	 * Method that changes to final scene and displays final scores in data on graphs.
	 * Also makes objects for textfield questions, choicebox question, and slider questions. 
	 * 
	 */
	@FXML 
	void changeToFinal(ActionEvent event) throws IOException {
		//initialization of error labels to nothing
		nameErrorLabel.setText("");
		ageErrorLabel.setText("");
		mainErrorLabel.setText("");
		
		//setting error labels to color red
		mainErrorLabel.setTextFill(Color.DARKRED);  
		nameErrorLabel.setTextFill(Color.DARKRED);
		ageErrorLabel.setTextFill(Color.DARKRED);

		// testing if user has inputed an answer for choicebox
        if( ZodiacSignChoiceBox.getValue() == null) {
			answerZodaic = false;
		}else {
			answerZodaic = true;
		}

		// testing person name using try, catch java methods
		try {
			if (nameTextField.getText().equals("")) { //to test whether user entered anything at all first
				nameErrorLabel.setText("Please enter your full name.");
				
				answerName = false;
			} else {
				TextFieldQuestion nameQuestion = new TextFieldQuestion(nameTextField.getText());
				
				nameQuestion.verifyNames(); //this is where it will throw an error if detected
				nameQuestion.calculateNames();

				if (answerName == false) {
					justinBieberList.add((double) nameQuestion.getJustinBieberCount());
					pitbullList.add((double) nameQuestion.getPitBullCount());
					jenniferLopezList.add((double) nameQuestion.getJenniferLopezCount());
					taylorSwiftList.add((double) nameQuestion.getTaylorSwiftCount());
					
				}
				answerName = true;
			}
		} catch (InvalidNameException ine) { //catches an invalidNameException if thrown
			answerName = false;
			nameErrorLabel.setText(ine.getMessage());
		}
		
		// testing person age using try, catch java methods
		try {
			if (ageTextField.getText().equals("")) { //to test whether user entered anything at all first
				ageErrorLabel.setText("Please enter your age.");
				
				answerAge = false;	
			} else {
				TextFieldQuestion ageQuestion = new TextFieldQuestion(ageTextField.getText());
				ageQuestion.verifyAge(); //this is where it will throw an error if detected
				double age = Double.parseDouble(ageTextField.getText());

				RangeQuestion rangeAgePitBull = new RangeQuestion ((age<=50 && age>40), 10.0);
				rangeAgePitBull.match();
				
				RangeQuestion rangeAgeJustinBieber = new RangeQuestion ((age<=30 && age >= 16), 10.0);
				rangeAgeJustinBieber.match();
			
				RangeQuestion rangeAgeTaylorSwift = new RangeQuestion ((age>30 && age<=40), 10.0);
				rangeAgeTaylorSwift.match();

				RangeQuestion rangeAgeJenniferLopez = new RangeQuestion ((age<=60 && age>50), 10.0);
				rangeAgeJenniferLopez.match();
				
				if (answerAge == false) {
					pitbullList.add(rangeAgePitBull.getRangePercentage());
					justinBieberList.add(rangeAgeJustinBieber.getRangePercentage());
					taylorSwiftList.add(rangeAgeTaylorSwift.getRangePercentage());
					jenniferLopezList.add(rangeAgeJenniferLopez.getRangePercentage());
				}
				answerAge = true;
			}
		} catch (InvalidAgeException iae) { //catches an invalidAgeException if thrown
			answerAge = false;
			ageErrorLabel.setText(iae.getMessage());
		}
		
		// condition that checks to see if all questions have been answered
	    if (allButtonsPressed >= 5 == true &&  answerZodaic == true && answerName == true && answerAge == true) {
			
			//testing choicebox to see what value to add to who's list
	    	String zodiacSign = ZodiacSignChoiceBox.getValue();
	    	
	    	Question zodiacSagittarius = new Question (zodiacSign, "Sagittarius");
	    	zodiacSagittarius.match();
	    	jenniferLopezList.add(zodiacSagittarius.getPercentage());
	    	
	    	Question zodiacAquarius = new Question (zodiacSign, "Aquarius");
	    	zodiacAquarius.match();
	    	pitbullList.add(zodiacAquarius.getPercentage());
	    	
	    	Question zodiacLibra = new Question (zodiacSign, "Libra");
	    	zodiacLibra.match();
	    	pitbullList.add(zodiacLibra.getPercentage());
	    	
	    	Question zodiacAries = new Question (zodiacSign, "Aries");
	    	zodiacAries.match();
	    	taylorSwiftList.add(zodiacAries.getPercentage());
	    	
	    	Question zodiacScorpio = new Question (zodiacSign, "Scorpio");
	    	zodiacScorpio.match();
	    	justinBieberList.add(zodiacScorpio.getPercentage());
	    	
	    	Question zodiacGemini = new Question (zodiacSign, "Gemini");
	    	zodiacGemini.match();
	    	taylorSwiftList.add(zodiacGemini.getPercentage());
	    	
	    	Question zodiacLeo = new Question (zodiacSign, "Leo");
	    	zodiacLeo.match();
	    	taylorSwiftList.add(zodiacLeo.getPercentage());
	    	
	    	Question zodiacCancer = new Question (zodiacSign, "Cancer");
	    	zodiacCancer.match();
	    	justinBieberList.add(zodiacCancer.getPercentage());
	    	
	    	
	    	// Calculating Spontaneous Slider Match
			double spontaneousValue = SpontaneousSlider.getValue();
			
			RangeQuestion spontaneousSliderJenniferLopez = new RangeQuestion ((spontaneousValue>= 0 && spontaneousValue <= 2.5), 10.0);
			spontaneousSliderJenniferLopez.match();
			jenniferLopezList.add(spontaneousSliderJenniferLopez.getRangePercentage());
		
			RangeQuestion spontaneousSliderJustinBieber = new RangeQuestion ((spontaneousValue>= 2.5 && spontaneousValue <= 5), 10.0);
			spontaneousSliderJustinBieber.match();
			justinBieberList.add(spontaneousSliderJustinBieber.getRangePercentage());
		
			
			RangeQuestion spontaneousSliderTaylorSwift = new RangeQuestion ((spontaneousValue>= 5 && spontaneousValue <= 7.5), 10.0);
			spontaneousSliderTaylorSwift.match();
			taylorSwiftList.add(spontaneousSliderTaylorSwift.getRangePercentage());
			
			
			RangeQuestion spontaneousSliderPitbull = new RangeQuestion ((spontaneousValue>= 7.5 && spontaneousValue <= 10), 10.0);
			spontaneousSliderPitbull.match();
			pitbullList.add(spontaneousSliderPitbull.getRangePercentage());
			
			
		    //Calculating Introvert and Extrovert compatibility
			double introExtroValue = IntroExtroSlider.getValue();
				
			RangeQuestion introExtroSliderTaylorSwift = new RangeQuestion ((introExtroValue>= 0 && introExtroValue <= 2.5), 15.0);
			introExtroSliderTaylorSwift.match();
			taylorSwiftList.add(introExtroSliderTaylorSwift.getRangePercentage());
			
			RangeQuestion introExtroSliderJenniferLopez = new RangeQuestion ((introExtroValue>= 2.5 && introExtroValue <= 5), 15.0);
			introExtroSliderJenniferLopez.match();
			jenniferLopezList.add(introExtroSliderJenniferLopez.getRangePercentage());
				
				
			RangeQuestion introExtroSliderJustinBieber = new RangeQuestion ((introExtroValue>= 5 && introExtroValue <= 7.5), 15.0);
			introExtroSliderJustinBieber.match();
			justinBieberList.add(introExtroSliderJustinBieber.getRangePercentage());
				
			RangeQuestion introExtrosliderPitbull = new RangeQuestion ((introExtroValue>= 7.5 && introExtroValue <= 10), 15.0);
			introExtrosliderPitbull.match();
			pitbullList.add(introExtrosliderPitbull.getRangePercentage());

	    	
			// prints all final data collected from all questions in a list  
			System.out.println("---Our Final list Results---");
			System.out.println("Justin Bieber List: " + justinBieberList);
			System.out.println("Jennifer Lopez List: " + jenniferLopezList);
			System.out.println("Taylor Swift list: " + taylorSwiftList);
			System.out.println("PitBull Perez list: " + pitbullList);
	    	
			// calculating final compatibility
	    	double finalScoreJustinBieber = calculateCompatibility(justinBieberList);
			double finalScoreJenniferLopez = calculateCompatibility(jenniferLopezList);
			double finalScoreTaylorSwift = calculateCompatibility(taylorSwiftList);
			double finalScorePitbull = calculateCompatibility(pitbullList);
		   
			//Changes screen to final view scene
		    FXMLLoader loaderFinal = new FXMLLoader(getClass().getResource("FinalView.fxml"));
		    root = loaderFinal.load();
				
		    FinalViewController finalViewController = loaderFinal.getController();

		    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		    scene = new Scene(root);
		    scene.getStylesheets().add(getClass().getResource("laststyle.css").toExternalForm());
		    stage.setScene(scene);
		    stage.show();

		    // final compatibility scores
		    System.out.println("Justin Bieber Compatibility: " + finalScoreJustinBieber);
		    System.out.println("Jennifer Lopez Compatibility: " + finalScoreJenniferLopez);
		    System.out.println("Taylor Swift Compatibility: " + finalScoreTaylorSwift);
		    System.out.println("Pitbull Perez Compatibility: " + finalScorePitbull);
		    
		    System.out.println("---test split---");

		    //creating the bar graph & pieChart by passing data to finalViewController
		    finalViewController.createBarGraph(finalScoreJustinBieber, finalScoreJenniferLopez, finalScorePitbull, finalScoreTaylorSwift);
		    finalViewController.createPieChart(finalScoreJustinBieber, finalScoreJenniferLopez, finalScorePitbull, finalScoreTaylorSwift);
		    finalViewController.setLabel(finalScoreJustinBieber, finalScoreJenniferLopez, finalScorePitbull, finalScoreTaylorSwift, 
		    		nameTextField.getText());

	} else { // if some questions were not answered, set the mainErrorLabel to remind user to answer all questions
		 mainErrorLabel.setText("Please Answer All Questions");
		}		
	}	
}

