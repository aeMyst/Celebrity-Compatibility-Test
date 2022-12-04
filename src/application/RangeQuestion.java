package application;

public class RangeQuestion extends Question{
	
	private boolean condition = true;
	

 public RangeQuestion(boolean slider, double weight) { //constructor for slider questions
	super(weight);
	this.condition =slider ;
} 

@Override
 public void match(){ //match method determines what user has clicked vs. actually match
		if (this.condition)  {
			super.setPercentage(10);
			System.out.println("hi");
		
		} else {
			setPercentage(0); 
		}				
	}
 public double getSliderPercentage() {
	return super.getPercentage();
 }
 

}


