package application;

public class Question {
	
	// instance variables
	private double maxValue = 10.0;
	private double percentage;
	private double weight = 10.0;

	private String id;
	private String answer;
	 
	private double multiplier;
	
	private boolean buttonPressed = true; 

	 
	// setter and getter methods to access encapsulated instance variables
	public double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public boolean isButtonPressed() {
		return this.buttonPressed;
	}
	public void setButtonPressed(boolean buttonPressed) {
		this.buttonPressed = buttonPressed;
	}
	
	/*to include the OO approach, we should be trying to open the file from the
	 * constructors and setting the values from the file to the instance variables.
	 * This way we can be specific with data collection towards certain questions
	 */

	// Question class constructors
	Question(String answer){
		this.answer = answer;
	}
	Question(String id, String answer) { //constructor for button questions
		this.id = id; 
		this.answer = answer;	    	    							
	}
	Question(String id, String answer, double maxValue) { //constructor for dog and cat button question
		this.id = id; 
		this.answer = answer;
		this.maxValue = maxValue; //double check maxValues, why do we need to overwrite for 5%? shouldn't they be 10%?
	}
	Question(double multiplier, double weight) { //constructor for slider questions
		this.multiplier = multiplier;
		this.weight = weight;
	}
	
	// class methods
	public void match(){ //match method determines what user has clicked vs. actually match
		if (id.equals(answer))  {
			setPercentage(maxValue);
			setButtonPressed(false);
		} else {
			setPercentage(0); 
		}				
	}
	public double calculatePercentage() { //calculates percentage based on user input
		double finalPercentage = this.multiplier * 10 * (getWeight()/100);
		return finalPercentage;
	}
	
}
