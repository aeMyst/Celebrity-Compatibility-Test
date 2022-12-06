package application;

/** Represents a range question.
 * @author Jaimie Marchuk
 * @author Peter Tran 
 * @author Julii Ruta 
 * 
 * Creates a range question that extends the question class. 
 * Takes a range condition as well as a user's input. If the user's input correctly matches 
 *  the wanted range, sets the total percentage the user got correct
 *  to the total weight of the question.
 *  
 *
*/

public class RangeQuestion extends Question{
	// encapsulated instance variable
	private boolean condition = true;
	

	/** Creates a range question with the specified range the input can fall into,
	 *  as well as the total weight of the question.
	 * @param range Range the user's input can fall into. 
	 * @param weight Specified total weight of question towards total weight.
	*/
	 RangeQuestion(boolean range, double weight) { //constructor for slider questions
		super(weight);
		this.condition =range ;
	} 
	
	
	 
	@Override
	 /**
     * Matches the user's input to the question's range.  
     * If the range input answers true, this set's the percentage correct to the total weight of the question. 
     *  Else, sets to zero. 
     * 
     */
	 public void match(){ 
			if (this.condition)  {
				super.setPercentage(super.getWeight());
				System.out.println("hi");
			
			} else {
				setPercentage(0); 
			}				
		}
	
	/** Gets the range question's total percentage correct.
	 * @return answer A double containing the total percentage correct of the question.	
	*/
	 public double getRangePercentage() {
		return super.getPercentage();
	 }
	 
	}


