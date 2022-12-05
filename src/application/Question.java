package application;

/** Represents a question.
 * @author Jaimie Marchuk
 * @author Peter Tran 
 * @author Julii Ruta 
 * 
 * Creates a question that can be input into a GUI application or just generally used in a test.
 * Can match a users input with the wanted answer, and then sets the total percentage the user got correct
 *  out of the total weight of the question. Ex) User input a correct answer and the answers weight is 
 *  out of 10 points, sets the total percentage correct to 10. 
 * As well as can be utilized to see if the widget has been accessed or not (if the user actually 
 *   answered the question).
 *
*/

public class Question {
	
	// instance variables
	private double weight = 10.0;
	private double percentage;
	private String id;
	private String answer;
	private boolean widgetUsed = true; 

	 
	// setter and getter methods to access encapsulated instance variables
	
	/** Gets the question's percentage correct.
	 * @return percentage A double containing the question's 
	 *      percentage correct.
	*/
	public double getPercentage() {
		return percentage;
	}
	
	/** Sets the question's percentage correct.
	 * @param percentage A double containing the question's 
	 *      percentage correct.	
	*/
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	/** Gets the question's weight towards a total test.
	 * @return weight A double containing the question's 
	 *     weight towards a total test.
	*/
	public double getWeight() {
		return weight;
	}
	
	/** Sets the question's weight towards a total test.
	 * @param weight A double containing the question's 
	 *     weight towards a total test.	
	*/
	public void setWeight(double weight) {
		this.weight = weight;
	}
		
	/** Gets the question's answer.
	 * @return answer A string containing the question's answer.	
	*/
	protected String getAnswer() {
		return answer;
	}
	
	
	/** Sets the question's answer.
	 * @param answer A string containing the question's answer	
	*/
	protected void setAnswer(String answer) {
		this.answer = answer;
	}
	
	/** Gets a boolean as to whether the user input an answer into the question's widget.
	 * @return widgetUsed A boolean signifying whether the
	 *     user input an answer into the questions widget. 		
	*/
	public boolean isWidgetUsed() {
		return this.widgetUsed;
	}
	
	/** Sets a boolean as to whether the user actual input an answer into the question's widget. 
	 * @param widgetUsed A boolean signifying whether the user input an answer into the questions widget. 	
	*/
	private void setWidgetUsed(boolean widgetUsed) {
		this.widgetUsed = widgetUsed;
	}
	
	/** Creates a question with the specified answer.
	 * @param answer The answer specified question.
	*/
	Question(String answer){
		this.answer = answer;
	}
	
	/** Creates a question with the specified users input and answer.
	 * @param id  Users input/answer to the question.
	 * @param answer  The answer to specified question.
	*/
	Question(String id, String answer) { 
		this.id = id; 
		this.answer = answer;	    	    							
	}
	
	/** Creates a question with the specified users input, answer and total weight of the question.
	 * @param id  Users input/answer to the question.
	 * @param answer  The answer to specified question.
	 * @param weight Specified total weight of question towards total weight.
	*/
	Question(String id, String answer, double weight) { 
		this.id = id; 
		this.answer = answer;
		this.weight = weight; 
	}
	
	/** Creates a question with the specified  total weight of the question.
	 * @param weight Specified total weight of question towards total weight.
	*/
	Question(double weight){
		this.weight = weight;
	}

	
    /**
     * Matches the user's input to the question's answer. 
     * If the answer is correct, set's percentage correct to the total weight of the question. 
     *  Else, sets to zero. 
     * 
     */
	public void match(){ 
		if (id.equals(answer))  {
			setPercentage(weight);
			setWidgetUsed(false);
		} else {
			setPercentage(0); 
		}				
	}

	
	
}
