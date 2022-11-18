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
	HashMap<String, Double> celebDictionary = new HashMap<String, Double>();
	

    
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
	void changeToFinal(ActionEvent event) {
		
		//calling zodiac method
		String sign = ZodiacSignChoiceBox.getValue();
		getZodiacSignAnswer(sign);
		
		//testing to see if method worked
		System.out.println(celebDictionary);
		//try {
			
			//FXMLLoader loader = new FXMLLoader();
			//VBox root = loader.load(new FileInputStream("src/application/FinalView.fxml"));
			//Scene finalScene = new Scene(root,1024,768);
			
			//applicationStage.setScene(finalScene);
			//applicationStage.setTitle("Results");
			//applicationStage.show();
		//} catch (Exception e) {
			//e.printStackTrace();
		//}
		
	}
}


