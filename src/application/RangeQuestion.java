package application;

public class RangeQuestion extends TextFieldQuestion{
	// encapsulated instance variable
	private boolean condition = true;
	
	// getter method to get percentage from parent class
	public double getSliderPercentage() {
		return super.getPercentage();
	}
	
	// class constructor that writes to its own instance variable at its parent class
	public RangeQuestion(boolean slider, double weight) { //constructor for slider questions
	super(weight);
	this.condition =slider ;
	} 

	@Override
	public void match(){ //match method determines what user has clicked vs. actually match
		if (this.condition)  {
			super.setPercentage(super.getWeight());
		} else {
			setPercentage(0); 
		}				
	}
}


