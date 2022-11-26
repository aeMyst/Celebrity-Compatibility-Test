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
			Scene secondaryScene = new Scene(root,400,700);
			secondaryScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
			
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
		
	     allButtonsPressed += 1;
		//this is able to tell me what button was pressed by returning the fx id
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("PizzaFoodButton")) {
			jloList.add(10.0);
			PizzaFoodButton.setStyle("-fx-background-color: White");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			SushiFoodButton.setDisable(true);
			IceCreamFoodButton.setDisable(true);
			PastaFoodButton.setDisable(true);
		}
		if (id.equals("SushiFoodButton")) {
			jbList.add(10.0);
			SushiFoodButton.setStyle("-fx-background-color: White");
			
			PizzaFoodButton.setDisable(true);
			IceCreamFoodButton.setDisable(true);
			PastaFoodButton.setDisable(true);
		}
		if (id.equals("PastaFoodButton")) {
			kwList.add(10.0);
			PastaFoodButton.setStyle("-fx-background-color: White");
			
			SushiFoodButton.setDisable(true);
			IceCreamFoodButton.setDisable(true);
			PizzaFoodButton.setDisable(true);
		}
		if (id.equals("IceCreamFoodButton")) {
			tsList.add(10.0);
			IceCreamFoodButton.setStyle("-fx-background-color: White");
			
			SushiFoodButton.setDisable(true);
			PizzaFoodButton.setDisable(true);
			PastaFoodButton.setDisable(true);
		}
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
		Button btn = (Button) event.getSource();
		String id = btn.getId();

		if (id.equals("FallSeasonButton")) {
			jbList.add(10.0);
			FallSeasonButton.setStyle("-fx-background-color: Coral");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			WinterSeasonButton.setDisable(true);
			SpringSeasonButton.setDisable(true);
			SummerSeasonButton.setDisable(true);
		}
		if (id.equals("WinterSeasonButton")) {
			kwList.add(10.0);
			WinterSeasonButton.setStyle("-fx-background-color: Turquoise");
			
			FallSeasonButton.setDisable(true);
			SpringSeasonButton.setDisable(true);
			SummerSeasonButton.setDisable(true);
		}
		if (id.equals("SpringSeasonButton")) {
			tsList.add(10.0);
			SpringSeasonButton.setStyle("-fx-background-color: Pink");
			
			WinterSeasonButton.setDisable(true);
			FallSeasonButton.setDisable(true);
			SummerSeasonButton.setDisable(true);
		}
		if (id.equals("SummerSeasonButton")) {
			jloList.add(10.0);
			SummerSeasonButton.setStyle("-fx-background-color: Khaki");
			
			WinterSeasonButton.setDisable(true);
			SpringSeasonButton.setDisable(true);
			FallSeasonButton.setDisable(true);
		}
		
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
		Button btn = (Button) event.getSource();
		String id = btn.getId();

		if (id.equals("RedColourButton")) {
			kwList.add(10.0);
			RedColourButton.setStyle("-fx-background-color: firebrick");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			GreenColourButton.setDisable(true);
			BlueColourButton.setDisable(true);
			YellowColourButton.setDisable(true);
		}
		if (id.equals("GreenColourButton")) {
			jbList.add(10.0);
			GreenColourButton.setStyle("-fx-background-color: mediumseagreen");
			
			RedColourButton.setDisable(true);
			BlueColourButton.setDisable(true);
			YellowColourButton.setDisable(true);
		}
		if (id.equals("YellowColourButton")) {
			tsList.add(10.0);
			YellowColourButton.setStyle("-fx-background-color: Khaki");
			
			GreenColourButton.setDisable(true);
			BlueColourButton.setDisable(true);
			RedColourButton.setDisable(true);
		}
		if (id.equals("BlueColourButton")) {
			jloList.add(10.0);
			BlueColourButton.setStyle("-fx-background-color: Turquoise");
			
			GreenColourButton.setDisable(true);
			RedColourButton.setDisable(true);
			YellowColourButton.setDisable(true);
		}
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
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("RapMusicButton")) {
			kwList.add(10.0);
			//celebDictionary.put("Kanye West", 10.0);
			RapMusicButton.setStyle("-fx-background-color: White");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			PopMusicButton.setDisable(true);
			IndieMusicButton.setDisable(true);
			ClassicalMusicButton.setDisable(true);
		}
		if (id.equals("PopMusicButton")) {
			jbList.add(10.0);
			//celebDictionary.put("Justin Beiber", 10.0);
			PopMusicButton.setStyle("-fx-background-color: White");
			
			RapMusicButton.setDisable(true);
			IndieMusicButton.setDisable(true);
			ClassicalMusicButton.setDisable(true);
		}
		if (id.equals("IndieMusicButton")) {
			tsList.add(10.0);
			//celebDictionary.put("Taylor Swift", 10.0);
			IndieMusicButton.setStyle("-fx-background-color: White");
			
			PopMusicButton.setDisable(true);
			RapMusicButton.setDisable(true);
			ClassicalMusicButton.setDisable(true);
		}
		if (id.equals("ClassicalMusicButton")) {
			jloList.add(10.0);
			//celebDictionary.put("Jennifer Lopez", 10.0);
			ClassicalMusicButton.setStyle("-fx-background-color: White");
			
			PopMusicButton.setDisable(true);
			IndieMusicButton.setDisable(true);
			RapMusicButton.setDisable(true);
		}
	}
	
	//animal buttons
	@FXML 
	private Button CatAnimalButton;
	
	@FXML 
	private Button DogAnimalButton;
	
	@FXML
	void setAnimalAnswer (ActionEvent event) {
		allButtonsPressed += 1;
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("CatAnimalButton")) {
			//there are two celebs who like cats so I split the percentage in half equally
			jbList.add(5.0);
			jloList.add(5.0);
			
		
			CatAnimalButton.setStyle("-fx-background-color: White");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			DogAnimalButton.setDisable(true);
		} 
		if (id.equals("DogAnimalButton")) {
			tsList.add(5.0);
			kwList.add(5.0);
			DogAnimalButton.setStyle("-fx-background-color: White");
			
			
			CatAnimalButton.setDisable(true);
		}
		
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
	}
	
	@FXML
	private Slider IntroExtroSlider;
	
	@FXML
	private Label DisplayCompatibilityScoreLabel;
	

	@FXML
	private Button DoneButton;

	@FXML 
  
		//Spontaneous Slider Method
		void sponSlider (double sliderValue) {
		answerAllQuestions = true;
	
			if (sliderValue >= 0 && sliderValue <= 2.5) {
				jloList.add(10.0);			
			}
			if (sliderValue >= 2.5 && sliderValue <= 5) {
				jbList.add(10.0);			
			}
			if (sliderValue >= 5 && sliderValue <= 7.5) {
				tsList.add(10.0);			
			}
			if (sliderValue >= 7.5 && sliderValue <= 10) {
				kwList.add(10.0);
						
			}
		}
		//Intro/Extro Slider Method 
		void introSlider (double sliderValue) {
			answerAllQuestions = true;
	
			if (sliderValue >= 0 && sliderValue <= 2.5) {
				tsList.add(10.0);
						
			}
			if (sliderValue >= 2.5 && sliderValue <= 5) {
				jloList.add(10.0);
						
			}
			if (sliderValue >= 5 && sliderValue <= 7.5) {
				jbList.add(10.0);
						
			}
			if (sliderValue >= 7.5 && sliderValue <= 10) {
				kwList.add(10.0);
						
			}	
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
		
		
		for (int i=0; i<celebList.size(); i++ ) {
			double percent = celebList.get(i);
			totalPercent += percent;
		}
		return totalPercent;
	}
	
	@FXML 
	void changeToFinal(ActionEvent event) throws IOException {
		System.out.println(jbList);
		System.out.println(jloList);
		System.out.println(tsList);
		System.out.println(kwList);
		
		System.out.println(allButtonsPressed);
		
        if(allButtonsPressed <5) {
        	buttonsPressed = false;
        } else {
        	buttonsPressed = true;
        }
		

		//calling zodiac method
      

  	        // Testing Slider Methods 
		double valueSpon = SpontaneousSlider.getValue();
		sponSlider(valueSpon);
		
		double valueIntro = IntroExtroSlider.getValue();
		introSlider(valueIntro);
		
		//checking calculate age method
	
		

		// testing person name
		if (nameTextField.getText().equals("")) {
			nameErrorLabel.setText("Please enter your first and last name.");
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
		getZodiacSignAnswer(sign);}
		
		  
		System.out.println("---Our Final list Results---");
		System.out.println("Justin Bieber List: " + jbList);
		System.out.println("Jennifer Lopez List: " + jloList);
		System.out.println("Taylor Swift list: " + tsList);
		System.out.println("Kanye West list: " + kwList);
		
		
		
		//calculating final compatibility
		double jb = calculateCompatibility(jbList);
		double jlo = calculateCompatibility(jloList);
		double ts = calculateCompatibility(tsList);
		double kw = calculateCompatibility(kwList);
		   
		
	   if (buttonsPressed == true &&  answerZodaic == true && answerName == true
			&&   answerAge == true) {
		//Changes screen to final view scene
		FXMLLoader loader = new FXMLLoader(getClass().getResource("FinalView.fxml"));
		root = loader.load();
				
		FinalViewController finalViewController = loader.getController();

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

