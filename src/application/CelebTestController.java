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
import javafx.scene.text.Font;
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


	@FXML
	private TextField nameTextField;
	
	@FXML
	private Label nameErrorLabel;
	
	@FXML
	private TextField ageTextField;
	
	@FXML
	private Label ageErrorLabel;

	@FXML
	
	private Label mainErrorLabel;


	@FXML
    	private Button startButton;
   
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
		PizzaFoodButton.setDisable((buttonQuestion1.isWidgetUsed()));
		SushiFoodButton.setDisable(buttonQuestion2.isWidgetUsed());
		IceCreamFoodButton.setDisable((buttonQuestion4.isWidgetUsed()));
		PastaFoodButton.setDisable((buttonQuestion3.isWidgetUsed()));
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
		FallSeasonButton.setDisable((buttonQuestion1.isWidgetUsed()));
		WinterSeasonButton.setDisable((buttonQuestion2.isWidgetUsed()));
		SpringSeasonButton.setDisable(buttonQuestion3.isWidgetUsed());
		SummerSeasonButton.setDisable((buttonQuestion4.isWidgetUsed()));
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
		RedColourButton.setDisable((buttonQuestion1.isWidgetUsed()));
		GreenColourButton.setDisable((buttonQuestion2.isWidgetUsed()));
		YellowColourButton.setDisable((buttonQuestion3.isWidgetUsed()));
		BlueColourButton.setDisable(buttonQuestion4.isWidgetUsed());
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
		RapMusicButton.setDisable((buttonQuestion1.isWidgetUsed()));
		PopMusicButton.setDisable(buttonQuestion2.isWidgetUsed());
		ClassicalMusicButton.setDisable((buttonQuestion3.isWidgetUsed()));
		IndieMusicButton.setDisable((buttonQuestion4.isWidgetUsed()));

		}

	
	//animal buttons
	@FXML 
	private Button CatAnimalButton;
	
	@FXML 
	private Button DogAnimalButton;
	
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
		DogAnimalButton.setDisable((buttonQuestion1.isWidgetUsed()));
		CatAnimalButton.setDisable(buttonQuestion2.isWidgetUsed());
	}
	
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
 

	
	double calculateCompatibility(ArrayList<Double> celebList) {
		double totalPercent = 0.0;
		
		for (int i = 0; i < celebList.size(); i++) {
			double percent = celebList.get(i);
			totalPercent += percent;
		}
		return totalPercent;
	}
	
	@FXML 
	void changeToFinal(ActionEvent event) throws IOException {
		nameErrorLabel.setText("");
		ageErrorLabel.setText("");
		mainErrorLabel.setText("");
		
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

		
        if( ZodiacSignChoiceBox.getValue() == null) {
			answerZodaic = false;
		}else {
			answerZodaic = true;
		}
    	
		// Calling Spontaneous Slider Methods 
	
        answerAllQuestions = true;
		
        //Checking Spontaneous slider to see who matches with who
        


		// testing person name
		try {
			if (nameTextField.getText().equals("")) { //to test whether user entered anything at all first
				nameErrorLabel.setText("Please enter your full name.");
				answerName = false;
			} else {
				TextFieldQuestion nameQuestion = new TextFieldQuestion(nameTextField.getText());
				nameQuestion.verifyNames(); //this is where it will throw an error if detected
				nameQuestion.calculateNames();
				jbList.add((double) nameQuestion.getJustinBieberCount());
				pitList.add((double) nameQuestion.getPitBullCount());
				jloList.add((double) nameQuestion.getJenniferLopezCount());
				tsList.add((double) nameQuestion.getTaylorSwiftCount());
				answerName = true;
			}
		} catch (InvalidNameException ine) {
			answerName = false;
			nameErrorLabel.setText(ine.getMessage());
		}
		
		// testing person age
		try {
			if (ageTextField.getText().equals("")) {
				ageErrorLabel.setText("Please enter your age.");
				answerAge = false;	
			} else {
				double age = Double.parseDouble(ageTextField.getText());
				TextFieldQuestion ageQuestion = new TextFieldQuestion(ageTextField.getText());
				ageQuestion.verifyAge(); //this is where it will throw an error if detected
				RangeQuestion rangeAgeQuestion1 = new RangeQuestion ((age<=50 && age>40), 10.0);
				rangeAgeQuestion1.match();
				pitList.add(rangeAgeQuestion1.getSliderPercentage());
				
				RangeQuestion rangeAgeQuestion2 = new RangeQuestion ((age<=30 && age >= 16), 10.0);
				rangeAgeQuestion2.match();
				jbList.add(rangeAgeQuestion2.getSliderPercentage());
				
			
				RangeQuestion rangeAgeQuestion3 = new RangeQuestion ((age>30 && age<=40), 10.0);
				rangeAgeQuestion3.match();
				tsList.add(rangeAgeQuestion3.getSliderPercentage());
			
				
				RangeQuestion rangeAgeQuestion4 = new RangeQuestion ((age<=60 && age>50), 10.0);
				rangeAgeQuestion4.match();
				jloList.add(rangeAgeQuestion4.getSliderPercentage());
				answerAge = true;
			}
		} catch (InvalidAgeException iae) {
			answerAge = false;
			ageErrorLabel.setText(iae.getMessage());
		}

	    if (buttonsPressed == true &&  answerZodaic == true && answerName == true && answerAge == true) {
			
	    	//testing slider methods to see what value to add to who's list
	
			
			//testing choicebox to see what value to add to who's list
	    	String zodiacSign = ZodiacSignChoiceBox.getValue();
	    	
	    	Question zodiac1 = new Question (zodiacSign, "Sagittarius");
	    	zodiac1.match();
	    	jloList.add(zodiac1.getPercentage());
	    	
	    	Question zodiac2 = new Question (zodiacSign, "Aquarius");
	    	zodiac2.match();
	    	pitList.add(zodiac2.getPercentage());
	    	
	    	Question zodiac3 = new Question (zodiacSign, "Libra");
	    	zodiac3.match();
	    	pitList.add(zodiac3.getPercentage());
	    	
	    	Question zodiac4 = new Question (zodiacSign, "Aries");
	    	zodiac4.match();
	    	tsList.add(zodiac4.getPercentage());
	    	
	    	Question zodiac5 = new Question (zodiacSign, "Scorpio");
	    	zodiac5.match();
	    	jbList.add(zodiac5.getPercentage());
	    	
	    	Question zodiac6 = new Question (zodiacSign, "Gemini");
	    	zodiac6.match();
	    	tsList.add(zodiac6.getPercentage());
	    	
	    	Question zodiac7 = new Question (zodiacSign, "Leo");
	    	zodiac7.match();
	    	tsList.add(zodiac7.getPercentage());
	    	
	    	Question zodiac8 = new Question (zodiacSign, "Cancer");
	    	zodiac3.match();
	    	jbList.add(zodiac8.getPercentage());
	    	
	    	
	    	//Calculating Spontaneous Slider Match

			double value = SpontaneousSlider.getValue();
			
			RangeQuestion sliderQuestion1 = new RangeQuestion ((value>= 0 && value <= 2.5), 10.0);
			sliderQuestion1.match();
			jloList.add(sliderQuestion1.getSliderPercentage());
		
			RangeQuestion sliderQuestion2 = new RangeQuestion ((value>= 2.5 && value <= 5), 10.0);
			sliderQuestion2.match();
			jbList.add(sliderQuestion2.getSliderPercentage());
		
			
			RangeQuestion sliderQuestion3 = new RangeQuestion ((value>= 5 && value <= 7.5), 10.0);
			sliderQuestion3.match();
			tsList.add(sliderQuestion3.getSliderPercentage());
			
			
			RangeQuestion sliderQuestion4 = new RangeQuestion ((value>= 7.5 && value <= 10), 10.0);
			sliderQuestion4.match();
			pitList.add(sliderQuestion4.getSliderPercentage());
			
			
		    //Calculating Intro/Extro compatibility. 
	        
				double introExtroValue = IntroExtroSlider.getValue();
				
				RangeQuestion sliderQuestion5 = new RangeQuestion ((introExtroValue>= 0 && introExtroValue <= 2.5), 10.0);
				sliderQuestion5.match();
				tsList.add(sliderQuestion5.getSliderPercentage());
			
				RangeQuestion sliderQuestion6 = new RangeQuestion ((introExtroValue>= 2.5 && introExtroValue <= 5), 10.0);
				sliderQuestion6.match();
				jloList.add(sliderQuestion6.getSliderPercentage());
				
				
				RangeQuestion sliderQuestion7 = new RangeQuestion ((introExtroValue>= 5 && introExtroValue <= 7.5), 10.0);
				sliderQuestion7.match();
				jbList.add(sliderQuestion7.getSliderPercentage());
				
				RangeQuestion sliderQuestion8 = new RangeQuestion ((value>= 5 && value <= 7.5), 10.0);
				sliderQuestion8.match();
				tsList.add(sliderQuestion8.getSliderPercentage());
	    	
			//String sign = ZodiacSignChoiceBox.getValue();
			//getZodiacSignAnswer(sign);
			
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
		 System.out.println("failed");
		 mainErrorLabel.setTextFill(Color.DARKRED);
		 mainErrorLabel.setText("Please Answer All Questions");

		}
			    
		
				
	}
		

}

