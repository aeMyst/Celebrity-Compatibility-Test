package application;

import java.io.FileInputStream;
import java.util.HashMap;
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

	HashMap<String, Double> celebDictionary = new HashMap<String, Double>();
	

    


	HashMap<String, Double> celebDictionary = new HashMap<String, Double>();
	
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
	//sup guys its julii
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
		//this is able to tell me what button was pressed by returning the fx id
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("PizzaFoodButton")) {
			celebDictionary.put("Jennifer Lopez", 10.0);
			PizzaFoodButton.setStyle("-fx-background-color: White");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			SushiFoodButton.setDisable(true);
			IceCreamFoodButton.setDisable(true);
			PastaFoodButton.setDisable(true);
		}
		if (id.equals("SushiFoodButton")) {
			celebDictionary.put("Justin Beiber", 10.0);
			SushiFoodButton.setStyle("-fx-background-color: White");
			
			PizzaFoodButton.setDisable(true);
			IceCreamFoodButton.setDisable(true);
			PastaFoodButton.setDisable(true);
		}
		if (id.equals("PastaFoodButton")) {
			celebDictionary.put("Kanye West", 10.0);
			PastaFoodButton.setStyle("-fx-background-color: White");
			
			SushiFoodButton.setDisable(true);
			IceCreamFoodButton.setDisable(true);
			PizzaFoodButton.setDisable(true);
		}
		if (id.equals("IceCreamFoodButton")) {
			celebDictionary.put("Taylor Swift", 10.0);
			IceCreamFoodButton.setStyle("-fx-background-color: White");
			
			SushiFoodButton.setDisable(true);
			PizzaFoodButton.setDisable(true);
			PastaFoodButton.setDisable(true);
		}
		
		//System.out.println(celebDictionary);
	
	
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
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("FallSeasonButton")) {
			celebDictionary.put("Justin Beiber", 10.0);
			FallSeasonButton.setStyle("-fx-background-color: Orange");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			WinterSeasonButton.setDisable(true);
			SpringSeasonButton.setDisable(true);
			SummerSeasonButton.setDisable(true);
		}
		if (id.equals("WinterSeasonButton")) {
			celebDictionary.put("Kanye West", 10.0);
			WinterSeasonButton.setStyle("-fx-background-color: Turquoise");
			
			FallSeasonButton.setDisable(true);
			SpringSeasonButton.setDisable(true);
			SummerSeasonButton.setDisable(true);
		}
		if (id.equals("SpringSeasonButton")) {
			celebDictionary.put("Taylor Swift", 10.0);
			SpringSeasonButton.setStyle("-fx-background-color: Pink");
			
			WinterSeasonButton.setDisable(true);
			FallSeasonButton.setDisable(true);
			SummerSeasonButton.setDisable(true);
		}
		if (id.equals("SummerSeasonButton")) {
			celebDictionary.put("Jennifer Lopez", 10.0);
			SummerSeasonButton.setStyle("-fx-background-color: Yellow");
			
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
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("RedColourButton")) {
			celebDictionary.put("Kanye West", 10.0);
			RedColourButton.setStyle("-fx-background-color: Red");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			GreenColourButton.setDisable(true);
			BlueColourButton.setDisable(true);
			YellowColourButton.setDisable(true);
		}
		if (id.equals("GreenColourButton")) {
			celebDictionary.put("Justin Beiber", 10.0);
			GreenColourButton.setStyle("-fx-background-color: Green");
			
			RedColourButton.setDisable(true);
			BlueColourButton.setDisable(true);
			YellowColourButton.setDisable(true);
		}
		if (id.equals("YellowColourButton")) {
			celebDictionary.put("Taylor Swift", 10.0);
			YellowColourButton.setStyle("-fx-background-color: Yellow");
			
			GreenColourButton.setDisable(true);
			BlueColourButton.setDisable(true);
			RedColourButton.setDisable(true);
		}
		if (id.equals("BlueColourButton")) {
			celebDictionary.put("Jennifer Lopez", 10.0);
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
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("RapMusicButton")) {
			celebDictionary.put("Kanye West", 10.0);
			RapMusicButton.setStyle("-fx-background-color: White");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			PopMusicButton.setDisable(true);
			IndieMusicButton.setDisable(true);
			ClassicalMusicButton.setDisable(true);
		}
		if (id.equals("PopMusicButton")) {
			celebDictionary.put("Justin Beiber", 10.0);
			PopMusicButton.setStyle("-fx-background-color: White");
			
			RapMusicButton.setDisable(true);
			IndieMusicButton.setDisable(true);
			ClassicalMusicButton.setDisable(true);
		}
		if (id.equals("IndieMusicButton")) {
			celebDictionary.put("Taylor Swift", 10.0);
			IndieMusicButton.setStyle("-fx-background-color: White");
			
			PopMusicButton.setDisable(true);
			RapMusicButton.setDisable(true);
			ClassicalMusicButton.setDisable(true);
		}
		if (id.equals("ClassicalMusicButton")) {
			celebDictionary.put("Jennifer Lopez", 10.0);
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
		Button btn = (Button) event.getSource();
		String id = btn.getId();
		//System.out.println(id);

		if (id.equals("CatAnimalButton")) {
			//there are two celebs who like cats so I split the percentage in half equally
			celebDictionary.put("Justin Beiber", 5.0);
			celebDictionary.put("Jennifer Lopez", 5.0);
			CatAnimalButton.setStyle("-fx-background-color: White");
			//if this button gets pressed I am disabling all the other ones so it is impossible to 
			//click another
			DogAnimalButton.setDisable(true);
		}
		if (id.equals("DogAnimalButton")) {
			celebDictionary.put("Taylor Swift", 5.0);
			celebDictionary.put("Kanye West", 5.0);
			DogAnimalButton.setStyle("-fx-background-color: White");
			
			CatAnimalButton.setDisable(true);
		}
	}
	
	//other components of questions
	@FXML
	private Slider SpontaneousSlider;
	
	@FXML
	private ChoiceBox<String> ZodiacSignChoiceBox;
	
	
	void getZodiacSignAnswer (String signSelected) {
		

		if(signSelected.equals("Sagittarius")) {
			celebDictionary.put("Jennifer Lopez", 10.0);
			//match with Jennifer Lopez who is Leo
		}
		if(signSelected.equals("Capricorn")) {
			celebDictionary.put("", 0.0);
			//no match
		}
		if(signSelected.equals("Aquarius")) {
			celebDictionary.put("Kanye West", 10.0);
			//you match with Kanye cause he is Gemini
		}
		if(signSelected.equals("Virgo")) {
			celebDictionary.put("", 0.0);
			//no match 
		}
		if(signSelected.equals("Libra")) {
			celebDictionary.put("Kanye West", 10.0);
			//match with Kanye who is Gemini
		}
		if(signSelected.equals("Aries")) {
			celebDictionary.put("Taylor Swift", 10.0);
			//match with taylor swift who is sagittarus
		}
		if(signSelected.equals("Scorpio")) {
			celebDictionary.put("Justin Beiber", 10.0);
			//match with Justin who is Pisces 
		}
		if(signSelected.equals("Taurus")) {
			celebDictionary.put("", 0.0);
			// no match
		}
		if(signSelected.equals("Pisces")) {
			celebDictionary.put("", 0.0);
			//no match
		}
		if(signSelected.equals("Gemini")) {
			celebDictionary.put("Taylor Swift", 10.0);
			//match with Taylor swift who is sagittarus
		}
		if(signSelected.equals("Leo")) {
			celebDictionary.put("Taylor Swift", 10.0);
			//you match with Taylor Swift who is a Sagittarus 
		}
		if(signSelected.equals("Cancer")) {
			celebDictionary.put("Justin Beiber", 10.0);
			//you match with Justin bieber who is Pisces
		}	
	}
	
	@FXML
	private Slider IntroExtroSlider;
	
	@FXML
	private Label DisplayCompatibilityScoreLabel;
	

	@FXML
	private Button DoneButton;

	//this method does not work for some reason, please check
	@FXML 
  
		//Spontaneous Slider Method
		void sponSlider (double sliderValue) {
//			double sliding = sliderValue;
			String celeb = "";
			double percentage = 0.0; 
			if (sliderValue >= 0 && sliderValue <= 2.5) {
				celeb = "Jennifer Lopez";
				percentage = 10.0;
						
			}
			if (sliderValue >= 2.5 && sliderValue <= 5) {
				celeb = "Justin Bieber";
				percentage = 10.0;
						
			}
			if (sliderValue >= 5 && sliderValue <= 7.5) {
				celeb = "Taylor Swift";
				percentage = 100;
						
			}
			if (sliderValue >= 7.5 && sliderValue <= 10) {
				celeb = "Kanye West";
				percentage = 10.0;
						
			}
			System.out.println("" + celeb +"" + percentage);
			celebDictionary.put(celeb, percentage);
			
		}
		//Intro/Extro Slider Method 
		void introSlider (double sliderValue) {
			String celeb = "";
			double percentage = 0.0; 
			if (sliderValue >= 0 && sliderValue <= 2.5) {
				celeb = "Taylor Swift";
				percentage = 10.0;
						
			}
			if (sliderValue >= 2.5 && sliderValue <= 5) {
				celeb = "Jennifer Lopez";
				percentage = 10.0;
						
			}
			if (sliderValue >= 5 && sliderValue <= 7.5) {
				celeb = "Justin Bieber";
				percentage = 10.0;
						
			}
			if (sliderValue >= 7.5 && sliderValue <= 10) {
				celeb = "Kanye West";
				percentage = 10.0;
						
			}
			System.out.println("" + celeb +"" + percentage);
			celebDictionary.put(celeb, percentage);
		
			
		
		
	}

//this method does not work for some reason, please check
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
		ArrayList<Integer> countList = new ArrayList<Integer>();
		int charCountJB = 0;
		int charCountKW = 0;
		int charCountJL = 0;
		int charCountTS = 0;
		
		String jb = "Jennifer Lopez";
		String kw = "Kanye West";		
		String jl = "Jennifer Lopez";
		String ts = "Taylor Swift";
		
		// to test matching, all characters should be in lowercase
		personName = personName.toLowerCase();
		
		// loop for testing character match (Justin Bieber)
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < jb.length(); p++) {
				if (personName.charAt(i) == jb.charAt(p)) {
					charCountJB += 1; 
				}	
			}	
		}
		System.out.print("Justin Bieber " + charCountJB + '\n');
		
		// loop for testing character match (Kanye West)
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < kw.length(); p++) {
				if (personName.charAt(i) == kw.charAt(p)) {
					charCountKW += 1; 
				}	
			}	
		}
		System.out.print("Kanye West " + charCountKW + '\n');
		
		// loop for testing character match (Jennifer Lopez)
		for (int i = 0; i < personName.length(); i++) { 
			for (int p = 0; p < jl.length(); p++) {
				if (personName.charAt(i) == jl.charAt(p)) {
					charCountJL += 1; 
				}	
			}	
		}
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
		
		// adding all counting elements to my list
		countList.add(charCountJB);
		countList.add(charCountKW);
		countList.add(charCountJL);
		countList.add(charCountTS);
		
		// sorting my list from greatest to smallest
		countList.sort(Collections.reverseOrder());
		System.out.print("My counts from Highest to Lowest " + countList);	
		
		//!!!!!!!!!!HELP!!!!!!!!!!
		// can someone figure out what I need to do with the dictionary stuff, I'm not understanding what I need to add to dictionary,
		// since we want it so that every person is calculated and not just the top, do I add all elements to dictionary?
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
				Double doubleAge = Double.parseDouble(personAge);	
				if (doubleAge < 16) { // must be 16+
					ageErrorLabel.setText("Sorry, you are too young to take this test. Please try again.");
				} else if (doubleAge > 60) { //must be 60-
					ageErrorLabel.setText("Sorry, you are old asf (60 or less). Please try again.");
				} else {
					age = age + doubleAge;
					ageErrorLabel.setText("");
				}
			}
			return age;
	}
	double calculateAge(double age) {
		// this method should calculate how close user is to a certain celebrity.
		// reminder to consider that whatever age they input, should have a weight towards each celebrity rather than
		// giving a certain user 0% to the other celebrities other than their top.
		return age;
	}
	
	
	//this method does not work for some reason, please check
	@FXML 
	void changeToFinal(ActionEvent event) {

		
		//calling zodiac method
		String sign = ZodiacSignChoiceBox.getValue();
		getZodiacSignAnswer(sign);
		
		//testing to see if method worked
		System.out.println(celebDictionary);
		//try {

  
  	//Testing Slider Methods 
    double valueSpon = SpontaneousSlider.getValue();
		sponSlider(valueSpon);
		
		double valueIntro = IntroExtroSlider.getValue();
		introSlider(valueIntro);
		System.out.println(celebDictionary);
		try {

			
			//FXMLLoader loader = new FXMLLoader();
			//VBox root = loader.load(new FileInputStream("src/application/FinalView.fxml"));
			//Scene finalScene = new Scene(root,1024,768);
			

			//applicationStage.setScene(finalScene);
			//applicationStage.setTitle("Results");
			//applicationStage.show();
		//} catch (Exception e) {
			//e.printStackTrace();
		//}

			applicationStage.setScene(finalScene);
		    applicationStage.setTitle("Results");
			applicationStage.show();
		} catch (Exception e) {
			e.printStackTrace();}
		}
		
		// testing person name
		if (nameTextField.getText().equals("")) {
			nameErrorLabel.setText("Please enter your first and last name.");
		} else {
			String personName = nameTextField.getText();
			String verifiedPersonName = verifyNames(personName);
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
		} else {
			String personAge = ageTextField.getText();
			double verifiedPersonAge = verifyAge(personAge);
			System.out.print('\n' + "User is: "  + verifiedPersonAge + " Years old" + '\n');
			calculateAge(verifiedPersonAge);
		}
	}

}