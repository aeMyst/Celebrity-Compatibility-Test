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
	ArrayList<Double> kwList = new ArrayList<Double>();	

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

			Scene secondaryScene1 = new Scene(root,400,700);
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
		buttonQuestion1.matchButtons();
		kwList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "SushiFoodButton");
		buttonQuestion2.matchButtons();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id, "PastaFoodButton");
		buttonQuestion3.matchButtons();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"IceCreamFoodButton");
		buttonQuestion4.matchButtons();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		PizzaFoodButton.setDisable((buttonQuestion1.isButtonPressed()));
		SushiFoodButton.setDisable(buttonQuestion2.isButtonPressed());
		IceCreamFoodButton.setDisable((buttonQuestion4.isButtonPressed()));
		PastaFoodButton.setDisable((buttonQuestion3.isButtonPressed()));
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
		buttonQuestion1.matchButtons();
		kwList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "WinterSeasonButton");
		buttonQuestion2.matchButtons();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id,"SpringSeasonButton");
		buttonQuestion3.matchButtons();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"SummerSeasonButton");
		buttonQuestion4.matchButtons();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		FallSeasonButton.setDisable((buttonQuestion1.isButtonPressed()));
		WinterSeasonButton.setDisable((buttonQuestion2.isButtonPressed()));
		SpringSeasonButton.setDisable(buttonQuestion3.isButtonPressed());
		SummerSeasonButton.setDisable((buttonQuestion4.isButtonPressed()));
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
		buttonQuestion1.matchButtons();
		kwList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "GreenColourButton");
		buttonQuestion2.matchButtons();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id,"YellowColourButton");
		buttonQuestion3.matchButtons();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"BlueColourButton");
		buttonQuestion4.matchButtons();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		RedColourButton.setDisable((buttonQuestion1.isButtonPressed()));
		GreenColourButton.setDisable((buttonQuestion2.isButtonPressed()));
		YellowColourButton.setDisable((buttonQuestion3.isButtonPressed()));
		BlueColourButton.setDisable(buttonQuestion4.isButtonPressed());
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
		buttonQuestion1.matchButtons();
		kwList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "PopMusicButton");
		buttonQuestion2.matchButtons();
		jloList.add(buttonQuestion2.getPercentage());
		Question buttonQuestion3 = new Question(id,"ClassicalMusicButton");
		buttonQuestion3.matchButtons();
		jbList.add(buttonQuestion3.getPercentage());
		Question buttonQuestion4 = new Question(id,"IndieMusicButton");
		buttonQuestion4.matchButtons();
		tsList.add(buttonQuestion4.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		RapMusicButton.setDisable((buttonQuestion1.isButtonPressed()));
		PopMusicButton.setDisable(buttonQuestion2.isButtonPressed());
		ClassicalMusicButton.setDisable((buttonQuestion3.isButtonPressed()));
		IndieMusicButton.setDisable((buttonQuestion4.isButtonPressed()));

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
		buttonQuestion1.matchButtons();
		kwList.add(buttonQuestion1.getPercentage());
		tsList.add(buttonQuestion1.getPercentage());
		Question buttonQuestion2 = new Question(id, "CatAnimalButton", 5.0);
		buttonQuestion2.matchButtons();
		jloList.add(buttonQuestion2.getPercentage());
		jbList.add(buttonQuestion2.getPercentage());
		
		//using class method isButtonPressed, it will determine which button we need to disable
		DogAnimalButton.setDisable((buttonQuestion1.isButtonPressed()));
		CatAnimalButton.setDisable(buttonQuestion2.isButtonPressed());
	}
	
	@FXML
	private Slider SpontaneousSlider;
	
	@FXML
	private ChoiceBox<String> ZodiacSignChoiceBox;
	
	
	void getZodiacSignAnswer (String signSelected) {
		if(signSelected.equals("Sagittarius")) {
			jloList.add(10.0);
			//match with Jennifer Lopez who is Leo
		}

		if(signSelected.equals("Aquarius")) {
			kwList.add(10.0);
			//you match with Kanye cause he is Gemini
		}
	
		if(signSelected.equals("Libra")) {
			kwList.add(10.0);
			//match with Kanye who is Gemini
		}
		if(signSelected.equals("Aries")) {
			tsList.add(10.0);
			//match with taylor swift who is sagittarus
		}
		if(signSelected.equals("Scorpio")) {
			jbList.add(10.0);
			//match with Justin who is Pisces 
		}
	
		if(signSelected.equals("Gemini")) {
			tsList.add(10.0);
			//match with Taylor swift who is sagittarus
		}
		if(signSelected.equals("Leo")) {
			tsList.add(10.0);
			//you match with Taylor Swift who is a Sagittarus 
		}
		if(signSelected.equals("Cancer")) {
			jbList.add(10.0);
			//you match with Justin bieber who is Pisces
		}	
		if (signSelected.equals(null) || signSelected.equals("")) {
			//there is an error, display such error.
		}
	}
	
	@FXML
	private Slider IntroExtroSlider;
	
	@FXML
	private Label DisplayCompatibilityScoreLabel;
	

	@FXML
	private Button DoneButton;
 
 
	//Spontaneous Slider Method
	void findSpontaneousMatch (double sliderPercentage) {
		answerAllQuestions = true;
		
		if (sliderPercentage >= 0 && sliderPercentage <= 2.5) jloList.add(sliderPercentage);			
		else if (sliderPercentage > 2.5 && sliderPercentage < 5) jbList.add(sliderPercentage);			
		else if (sliderPercentage > 5 && sliderPercentage < 7.5) tsList.add(sliderPercentage);			
		else if (sliderPercentage >= 7.5 && sliderPercentage <= 10) kwList.add(sliderPercentage);		
		else answerAllQuestions = false;
	}
	
	//Intro and Extro Slider Method 
	void findIntrovertExtrovertMatch(double sliderPercentage) {
		answerAllQuestions = true;
		
		if (sliderPercentage >= 0 && sliderPercentage <= 3.75) tsList.add(sliderPercentage);
		else if (sliderPercentage > 3.75 && sliderPercentage < 7.5) jloList.add(sliderPercentage);
		else if (sliderPercentage > 7.5 && sliderPercentage < 11.25) jbList.add(sliderPercentage);
		else if (sliderPercentage >= 11.25 && sliderPercentage <= 15.0) kwList.add(sliderPercentage);
		else answerAllQuestions = false;
	}

	String verifyNames(String personName) {
		// initialization of variables
		boolean validName = true;
		char invalidChar = Character.MIN_VALUE;
	
		
		for (char c : personName.toCharArray()) {
			// if the current character c has an ASCII table value of the following, do this
   	  		if  ((c >= '!' && c <= '@') || (c >= '[' && c <= '`') || (c >= '{' && c <= '~') ) {
   	  			validName = false;
   	  			invalidChar = c;
   	  	
   	  		} 
   	  		if (!(validName)) {
   	  		    nameErrorLabel.setTextFill(Color.DARKRED);
   	  			nameErrorLabel.setText("Do not use " + invalidChar + " in your name. Please enter a valid name.");
   	  		} 
	    }
		if (validName) {
			nameErrorLabel.setText("");
			
			return personName;
		} else {
			return "";
		}
	}
	
	
	void calculateNames(String personName) {
		
		// inialization of variables
		double charCountJB = 0;
		double charCountKW = 0;
		double charCountJL = 0;
		double charCountTS = 0;
		
		String jb = "jenniferlopez";
		String kw = "kanyewest";		
		String jl = "jenniferlopez";
		String ts = "taylorswift";
		
		// to test matching, all characters should be in lowercase and removing white spaces
		personName = personName.toLowerCase();
		personName = personName.replaceAll("\\s", "");
		
		// loop for removing duplicate letters in order to test similar letters
		for (int i = 0; i < personName.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (personName.charAt(i) == personName.charAt(j)) {
					char[] chars = personName.toCharArray();
					chars[j] = '*';
					personName = String.valueOf(chars);
					System.out.println("person name after changes: " + personName);
				}
			}
		}
		System.out.println("person name after removing: " + personName);
		
		
		
		// loop for testing character match (Justin Bieber)
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < jb.length(); p++) {
				if (personName.charAt(i) == jb.charAt(p)) {
					charCountJB += 1; 
				}	
			}
		}
		//-1 for the white space
		//charCountJB = charCountJB-1;
		System.out.print("Justin Bieber " + charCountJB + '\n');
		
		// loop for testing character match (Kanye West)
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < kw.length(); p++) {
				if (personName.charAt(i) == kw.charAt(p)) {
					charCountKW += 1; 
				}	
			}	
		}
		//charCountKW = charCountKW-1;
		System.out.print("Kanye West " + charCountKW + '\n');
		
		// loop for testing character match (Jennifer Lopez)
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < jl.length(); p++) {
				if (personName.charAt(i) == jl.charAt(p)) {
					charCountJL += 1; 
				}	
			}	
		}
		//charCountJL = charCountJL-1;
		System.out.print("Jennifer Lopez " + charCountJL + '\n');
		
		// loop for testing character match (Taylor Swift)
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < ts.length(); p++) {
				if (personName.charAt(i) == ts.charAt(p)) {
					charCountTS += 1; 
				}	
			}	
		}
		System.out.print("Taylor Swift " + charCountTS + '\n');
		
		// adding all counting elements to my lists
		jbList.add(charCountJB);
		kwList.add(charCountKW);
		jloList.add(charCountJL);
		tsList.add(charCountTS);
	}
	
	double verifyAge(String personAge) {
			// initialization of variables
			boolean validAge = true;
			char invalidChar = Character.MIN_VALUE;
			double age = 0.0;
				
			for (char c : personAge.toCharArray()) {
				// testing if inputed age is actually a number
		   	  	if  (!(c >= '0' && c <= '9')) {
		   	  		validAge = false;
		   	  		invalidChar = c;
		   	 	  
		   	  	} else {
		   	  		validAge = true;
		   	  	}
		   	  	if (!(validAge)) {
		   	  		ageErrorLabel.setText("Do not use " + invalidChar + " in your Age. Please enter a valid Age.");
		   	 	   
		   	  	} 
			}
			if (validAge) {
				answerAllQuestions = true;
				Double doubleAge = Double.parseDouble(personAge);	
				if (doubleAge < 16) { // must be 16+
					ageErrorLabel.setTextFill(Color.DARKRED);				
					ageErrorLabel.setText("Sorry, must be 16+");
				} else if (doubleAge > 60) { //must be 60-
					ageErrorLabel.setTextFill(Color.DARKRED);
					ageErrorLabel.setText("Sorry, must be 60-");
				} else {
					age = age + doubleAge;
					ageErrorLabel.setText("");
				}
			}
			return age;
	}
	void calculateAge(double age) {
	
		if(age<=50 && age>40) {
			kwList.add(10.0);
		}
		if(age<=30 && age >= 18) {
			jbList.add(10.0);
		}
		if(age>30 && age<=40) {
			tsList.add(10.0);
		}
		if(age<=60 && age>50 ) {
			jloList.add(10.0);
		}

	}
	
	double calculateCompatibility(ArrayList<Double> celebList) {
		double totalPercent = 0.0;
		
		for (int i=0; i<celebList.size(); i++) {
			double percent = celebList.get(i);
			totalPercent += percent;
		}
		return totalPercent;
	}
	
	@FXML 
	void changeToFinal(ActionEvent event) throws IOException {
		
		System.out.println("Total Value of allButtonsPressed: " + allButtonsPressed);
        if(allButtonsPressed < 5) {
        	buttonsPressed = false;
        } else {
        	buttonsPressed = true;
        }

  	    // Calling Spontaneous Slider Methods 
		double valueSpontaneousSlider = SpontaneousSlider.getValue();
		Question spontaneousSliderQuestion = new Question(valueSpontaneousSlider, 10.0);
		findIntrovertExtrovertMatch(spontaneousSliderQuestion.getPercentage());
		
		// Calling Introvert or Extrovert Slider Methods 
		double valueIntrovertExtrovertSlider = IntroExtroSlider.getValue();
		Question IntrovertExtrovertSlider = new Question(valueIntrovertExtrovertSlider, 15.0);
		findIntrovertExtrovertMatch(IntrovertExtrovertSlider.getPercentage());
		

		// testing person name
		if (nameTextField.getText().equals("")) {
			nameErrorLabel.setText("Please enter your full name.");
			answerName = false;
		} else {
			String personName = nameTextField.getText();
			String verifiedPersonName = verifyNames(personName);
			answerName = true;
			if (verifiedPersonName.equals("")) {
				System.out.print('\n' + verifiedPersonName + '\n');
			} else {
				System.out.print('\n' + verifiedPersonName + '\n');
				calculateNames(verifiedPersonName);
			}	
			System.out.print('\n' + "---Split---");
			
		}

		// testing person age
		if (ageTextField.getText().equals("")) {
			ageErrorLabel.setText("Please enter your age.");
			answerAge = false;
			
		} else {
			String personAge = ageTextField.getText();
			double verifiedPersonAge = verifyAge(personAge);
			answerAge = true;
			
			System.out.print('\n' + "User is: "  + verifiedPersonAge + " Years old" + '\n');
			calculateAge(verifiedPersonAge);
		}
		
		if( ZodiacSignChoiceBox.getValue() == null) {
			 answerZodaic = false;
        }else {
        	String sign = ZodiacSignChoiceBox.getValue();
        	answerZodaic = true;
        	getZodiacSignAnswer(sign);
		}
		
		// prints all final data collected from all questions in a list  
		System.out.println("---Our Final list Results---");
		System.out.println("Justin Bieber List: " + jbList);
		System.out.println("Jennifer Lopez List: " + jloList);
		System.out.println("Taylor Swift list: " + tsList);
		System.out.println("Kanye West list: " + kwList);

		// calculating final compatibility
		double jb = calculateCompatibility(jbList);
		double jlo = calculateCompatibility(jloList);
		double ts = calculateCompatibility(tsList);
		double kw = calculateCompatibility(kwList);
		   
		
	    if (buttonsPressed == true &&  answerZodaic == true && answerName == true && answerAge == true) {
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
		   System.out.println("Kanye West Compatibility: " + kw);
		
		   //creating the bar graph & pieChart
		   finalViewController.createBarGraph(jb, jlo, kw, ts);
		   finalViewController.createPieChart(jb, jlo, kw, ts);
		   finalViewController.setLabel(jb, jlo, kw, ts, nameTextField.getText());

	} else {
		 System.out.println("failed");
		 mainErrorLabel.setTextFill(Color.DARKRED);
		 mainErrorLabel.setText("Please Answer All Questions");
	}
	   
	}


}

