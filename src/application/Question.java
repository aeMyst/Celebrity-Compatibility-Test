package application;

import java.util.ArrayList;

public class Question {
	
	 private double maxValue = 10.0;
	 private double percentage;

	 private String id;
	 private String answer;
	 
	 private double multiplier;
	
	 private boolean buttonPressed = true; 

	 
	 // setter and getter methods to access encapsulated instance variables
	 public double getPercentage() {
			return percentage;
		}
		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public boolean isButtonPressed() {
			return this.buttonPressed;
		}
		public void setButtonPressed(boolean buttonPressed) {
			this.buttonPressed = buttonPressed;
		}

	// Question class constructors
	 Question(String id, String answer){ //constructor for button questions
		this.id = id; 
		this.answer = answer;	    	    							
	}
	Question(String id, String answer, double maxValue){ //constructor for dog and cat button question
		this.id = id; 
		this.answer = answer;
		this.maxValue = maxValue; //double check maxValues, why do we need to overwrite for 5%? shouldn't they be 10%?
	}
	
	
	// class methods
	void match(){
			
		if (id.equals(answer))  {
			setPercentage(maxValue);
			setButtonPressed(false);
		} else {
			setPercentage(0); 
		}				
	}
}
