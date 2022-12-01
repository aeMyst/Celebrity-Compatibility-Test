package application;

import java.util.ArrayList;

public class Question {
	
	private double percentage;
	
	
	
	 private String id;
	
	 private double multiplier;
	
	 private double maxValue = 10.0;
	
	 private boolean buttonPressed = true; 
	 
	 private String answer;
	
	
	
	
	Question(String id, String answer){
		this.id = id; 
		this.answer = answer;	    	    							
	}
	Question(String id, String answer, double maxValue){
		this.id = id; 
		this.answer = answer;
		this.maxValue = maxValue;
	}
	
	void match(){
			
		if (id.equals(answer))  {
			setPercentage(maxValue);
			setButtonPressed(false);
			System.out.println("hi");
			
			
			}
		else {
			setPercentage(0); 
		}				
	  }
	
	
	


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



	
	
	
	

}
