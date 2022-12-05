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
	Stage applicationStage;
	
	private Parent root;
	private Stage stage;
	private Scene scene; 
	
	boolean answerAllQuestions = false;
	boolean answerZodaic = false;
	boolean answerName = false;
	boolean answerAge = false;
	double allButtonsPressed = 0;
	boolean buttonsPressed = false;

	ArrayList<Double> jbList = new ArrayList<Double>();
	ArrayList<Double> jloList = new ArrayList<Double>();
	ArrayList<Double> tsList = new ArrayList<Double>();
	ArrayList<Double> pitList = new ArrayList<Double>();	

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
		//this is able to tell me what button was pressed by returning the fx id
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		
		//calling objects for question class for each button
		Question buttonQuestion1 = new Question(id, "PizzaFoodButton");
		buttonQuestion1.match();
		pitList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "SushiFoodButton");
		buttonQuestion2.match();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id, "PastaFoodButton");
		buttonQuestion3.match();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"IceCreamFoodButton");
		buttonQuestion4.match();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		PizzaFoodButton.setDisable((buttonQuestion1.isButtonPressed()));
		SushiFoodButton.setDisable(buttonQuestion2.isButtonPressed());
		IceCreamFoodButton.setDisable((buttonQuestion4.isButtonPressed()));
		PastaFoodButton.setDisable((buttonQuestion3.isButtonPressed()));
	}
	
	// method to call Question class for season buttons
	@FXML
	void setSeasonAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		//this is able to tell me what button was pressed by returning the fx id
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		
		//calling objects for question class for each button
		Question buttonQuestion1 = new Question(id, "FallSeasonButton");
		buttonQuestion1.match();
		pitList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "WinterSeasonButton");
		buttonQuestion2.match();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id,"SpringSeasonButton");
		buttonQuestion3.match();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"SummerSeasonButton");
		buttonQuestion4.match();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		FallSeasonButton.setDisable((buttonQuestion1.isButtonPressed()));
		WinterSeasonButton.setDisable((buttonQuestion2.isButtonPressed()));
		SpringSeasonButton.setDisable(buttonQuestion3.isButtonPressed());
		SummerSeasonButton.setDisable((buttonQuestion4.isButtonPressed()));
	}
	
	// method to call Question class for color buttons
	@FXML
	void setColourAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		//this is able to tell me what button was pressed by returning the fx id
		Button btn = (Button) event.getSource();
		String id = btn.getId();
	
		//calling objects for question class for each button
		Question buttonQuestion1 = new Question(id, "RedColourButton");
		buttonQuestion1.match();
		pitList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "GreenColourButton");
		buttonQuestion2.match();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id,"YellowColourButton");
		buttonQuestion3.match();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"BlueColourButton");
		buttonQuestion4.match();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		RedColourButton.setDisable((buttonQuestion1.isButtonPressed()));
		GreenColourButton.setDisable((buttonQuestion2.isButtonPressed()));
		YellowColourButton.setDisable((buttonQuestion3.isButtonPressed()));
		BlueColourButton.setDisable(buttonQuestion4.isButtonPressed());
	}
	
	// method to call Question class for music buttons
	@FXML
	void setMusicAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		//this is able to tell me what button was pressed by returning the fx id
		Button btn = (Button) event.getSource();
		String id = btn.getId();

		//calling objects for question class for each button
		Question buttonQuestion1 = new Question(id, "RapMusicButton");
		buttonQuestion1.match();
		pitList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "PopMusicButton");
		buttonQuestion2.match();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id,"ClassicalMusicButton");
		buttonQuestion3.match();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"IndieMusicButton");
		buttonQuestion4.match();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		RapMusicButton.setDisable((buttonQuestion1.isButtonPressed()));
		PopMusicButton.setDisable(buttonQuestion2.isButtonPressed());
		ClassicalMusicButton.setDisable((buttonQuestion3.isButtonPressed()));
		IndieMusicButton.setDisable((buttonQuestion4.isButtonPressed()));

		}

	// method to call Question class for animal buttons
	@FXML
	void setAnimalAnswer (ActionEvent event) {
		
		allButtonsPressed += 1;
		
		//this is able to tell me what button was pressed by returning the fx id
		Button btn = (Button) event.getSource();
		String id = btn.getId();

		//calling objects for question class for each button
		Question buttonQuestion1 = new Question(id, "DogAnimalButton", 5.0);
		buttonQuestion1.match();
		pitList.add(buttonQuestion1.getPercentage());
		tsList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "CatAnimalButton", 5.0);
		buttonQuestion2.match();
		jloList.add(buttonQuestion2.getPercentage());
		jbList.add(buttonQuestion2.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		DogAnimalButton.setDisable((buttonQuestion1.isButtonPressed()));
		CatAnimalButton.setDisable(buttonQuestion2.isButtonPressed());
	}
 
	// method that calculates the total compatibility score from passed celebrity list
	double calculateCompatibility(ArrayList<Double> celebList) {
		double totalPercent = 0.0;
		
		for (int i = 0; i < celebList.size(); i++) {
			double percent = celebList.get(i);
			totalPercent += percent;
		}
		return totalPercent;
	}
	
	/* method that changes to final scene and displays final scores in data on graphs.
	 * Also makes objects for textfield questions, choicebox question, and slider questions.
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
		
		// testing if all buttons were pressed
		System.out.println("Total Value of allButtonsPressed: " + allButtonsPressed);
        if(allButtonsPressed < 5) {
        	buttonsPressed = false;
        } else {
        	buttonsPressed = true;
        }

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
				
				jbList.add((double) nameQuestion.getJustinBieberCount());
				pitList.add((double) nameQuestion.getKanyeWestCount());
				jloList.add((double) nameQuestion.getJenniferLopezCount());
				tsList.add((double) nameQuestion.getTaylorSwiftCount());
				
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
				double age = Double.parseDouble(ageTextField.getText());
				TextFieldQuestion ageQuestion = new TextFieldQuestion(ageTextField.getText());
				ageQuestion.verifyAge(); //this is where it will throw an error if detected
				
				RangeQuestion rangeAgePitBull = new RangeQuestion ((age<=50 && age>40), 10.0);
				rangeAgePitBull.match();
				pitList.add(rangeAgePitBull.getSliderPercentage());
				
				RangeQuestion rangeAgeJustinBieber = new RangeQuestion ((age<=30 && age >= 16), 10.0);
				rangeAgeJustinBieber.match();
				jbList.add(rangeAgeJustinBieber.getSliderPercentage());
				
			
				RangeQuestion rangeAgeTaylorSwift = new RangeQuestion ((age>30 && age<=40), 10.0);
				rangeAgeTaylorSwift.match();
				tsList.add(rangeAgeTaylorSwift.getSliderPercentage());
			
				
				RangeQuestion rangeAgeJenniferLopez = new RangeQuestion ((age<=60 && age>50), 10.0);
				rangeAgeJenniferLopez.match();
				jloList.add(rangeAgeJenniferLopez.getSliderPercentage());
				
				answerAge = true;
			}
		} catch (InvalidAgeException iae) { //catches an invalidAgeException if thrown
			answerAge = false;
			ageErrorLabel.setText(iae.getMessage());
		}
		
		// condition that checks to see if all questions have been answered
	    if (buttonsPressed == true &&  answerZodaic == true && answerName == true && answerAge == true) {
			
			//testing choicebox to see what value to add to who's list
	    	String zodiacSign = ZodiacSignChoiceBox.getValue();
	    	
	    	Question zodiacSagittarius = new Question (zodiacSign, "Sagittarius");
	    	zodiacSagittarius.match();
	    	jloList.add(zodiacSagittarius.getPercentage());
	    	
	    	Question zodiacAquarius = new Question (zodiacSign, "Aquarius");
	    	zodiacAquarius.match();
	    	pitList.add(zodiacAquarius.getPercentage());
	    	
	    	Question zodiacLibra = new Question (zodiacSign, "Libra");
	    	zodiacLibra.match();
	    	pitList.add(zodiacLibra.getPercentage());
	    	
	    	Question zodiacAries = new Question (zodiacSign, "Aries");
	    	zodiacAries.match();
	    	tsList.add(zodiacAries.getPercentage());
	    	
	    	Question zodiacScorpio = new Question (zodiacSign, "Scorpio");
	    	zodiacScorpio.match();
	    	jbList.add(zodiacScorpio.getPercentage());
	    	
	    	Question zodiacGemini = new Question (zodiacSign, "Gemini");
	    	zodiacGemini.match();
	    	tsList.add(zodiacGemini.getPercentage());
	    	
	    	Question zodiacLeo = new Question (zodiacSign, "Leo");
	    	zodiacLeo.match();
	    	tsList.add(zodiacLeo.getPercentage());
	    	
	    	Question zodiacCancer = new Question (zodiacSign, "Cancer");
	    	zodiacCancer.match();
	    	jbList.add(zodiacCancer.getPercentage());
	    	
	    	
	    	// Calculating Spontaneous Slider Match
			double spontaneousValue = SpontaneousSlider.getValue();
			
			RangeQuestion spontaneousSliderJenniferLopez = new RangeQuestion ((spontaneousValue>= 0 && spontaneousValue <= 2.5), 10.0);
			spontaneousSliderJenniferLopez.match();
			jloList.add(spontaneousSliderJenniferLopez.getSliderPercentage());
		
			RangeQuestion spontaneousSliderJustinBieber = new RangeQuestion ((spontaneousValue>= 2.5 && spontaneousValue <= 5), 10.0);
			spontaneousSliderJustinBieber.match();
			jbList.add(spontaneousSliderJustinBieber.getSliderPercentage());
		
			
			RangeQuestion spontaneousSliderTaylorSwift = new RangeQuestion ((spontaneousValue>= 5 && spontaneousValue <= 7.5), 10.0);
			spontaneousSliderTaylorSwift.match();
			tsList.add(spontaneousSliderTaylorSwift.getSliderPercentage());
			
			
			RangeQuestion spontaneousSliderPitbull = new RangeQuestion ((spontaneousValue>= 7.5 && spontaneousValue <= 10), 10.0);
			spontaneousSliderPitbull.match();
			pitList.add(spontaneousSliderPitbull.getSliderPercentage());
			
			
		    //Calculating Introvert and Extrovert compatibility
			double introExtroValue = IntroExtroSlider.getValue();
				
			RangeQuestion introExtroSliderTaylorSwift = new RangeQuestion ((introExtroValue>= 0 && introExtroValue <= 2.5), 10.0);
			introExtroSliderTaylorSwift.match();
			tsList.add(introExtroSliderTaylorSwift.getSliderPercentage());
			
			RangeQuestion introExtroSliderJenniferLopez = new RangeQuestion ((introExtroValue>= 2.5 && introExtroValue <= 5), 10.0);
			introExtroSliderJenniferLopez.match();
			jloList.add(introExtroSliderJenniferLopez.getSliderPercentage());
				
				
			RangeQuestion introExtroSliderJustinBieber = new RangeQuestion ((introExtroValue>= 5 && introExtroValue <= 7.5), 10.0);
			introExtroSliderJustinBieber.match();
			jbList.add(introExtroSliderJustinBieber.getSliderPercentage());
				
			RangeQuestion introExtrosliderPitbull = new RangeQuestion ((introExtroValue>= 5 && introExtroValue <= 7.5), 10.0);
			introExtrosliderPitbull.match();
			pitList.add(introExtrosliderPitbull.getSliderPercentage());
	    	
			// prints all final data collected from all questions in a list  
			System.out.println("---Our Final list Results---");
			System.out.println("Justin Bieber List: " + jbList);
			System.out.println("Jennifer Lopez List: " + jloList);
			System.out.println("Taylor Swift list: " + tsList);
			System.out.println("Kanye West list: " + pitList);
	    	
			// calculating final compatibility
	    	double jb = calculateCompatibility(jbList);
			double jlo = calculateCompatibility(jloList);
			double ts = calculateCompatibility(tsList);
			double pit = calculateCompatibility(pitList);
		   
			//Changes screen to final view scene
		    FXMLLoader loader1 = new FXMLLoader(getClass().getResource("FinalView.fxml"));
		    root = loader1.load();
				
		    FinalViewController finalViewController = loader1.getController();

		    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		    scene = new Scene(root);
		    scene.getStylesheets().add(getClass().getResource("laststyle.css").toExternalForm());
		    stage.setScene(scene);
		    stage.show();

		    // final compatibility scores
		    System.out.println("Justin Bieber Compatibility: " + jb);
		    System.out.println("Jennifer Lopez Compatibility: " + jlo);
		    System.out.println("Taylor Swift Compatibility: " + ts);
		    System.out.println("Pitbull Compatibility: " + pit);

		
		    //creating the bar graph & pieChart
		    finalViewController.createBarGraph(jb, jlo, pit, ts);
		    finalViewController.createPieChart(jb, jlo, pit, ts);
		    finalViewController.setLabel(jb, jlo, pit, ts, nameTextField.getText());


	} else {
		 mainErrorLabel.setText("Please Answer All Questions");
		}		
	}	
}

