package application;

public class Question {
	
	// instance variables
	private double weight = 10.0;
	private double percentage;
	private String id;
	private String answer;
	private double sliderValue;
	private boolean widgetUsed = true; 

	 
	// setter and getter methods to access encapsulated instance variables
	public double getSliderValue() {
		return this.sliderValue;
	}
	public void setSliderValue(double sliderValue) {
		this.sliderValue = sliderValue;
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
		return this.widgetUsed;
	}
	public void setButtonPressed(boolean buttonPressed) {
		this.widgetUsed = buttonPressed;
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
	Question(String id, String answer, double weight) { //constructor for dog and cat button question
		this.id = id; 
		this.answer = answer;
		this.weight = weight; //double check maxValues, why do we need to overwrite for 5%? shouldn't they be 10%?
	}
	//constructor for slider questions

	
	Question(double weight){
		this.weight = weight;
	}

	
	// class methods
	public void match(){ //match method determines what user has clicked vs. actually match
		if (id.equals(answer))  {
			setPercentage(weight);
			setButtonPressed(false);
		} else {
			setPercentage(0); 
		}				
	}

	//public double calculatePercentage() { //calculates percentage based on user input
	//	double finalPercentage = this.multiplier * 10 * (getWeight()/100);
	//	return finalPercentage;
	//}

	
}
