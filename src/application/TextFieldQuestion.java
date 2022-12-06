package application;

public class TextFieldQuestion extends Question{
	// instance variables
	private String justinBieber = "justinbieber";
	private String pitbull = "pitbullperez";		
	private String jenniferLopez = "jenniferlopez";
	private String taylorSwift = "taylorswift";
	
	private int justinBieberCount;
	private int pitbullCount;
	private int jenniferLopezCount;
	private int taylorSwiftCount;
	
	// constructors that pass to parent constructors using super keyword
	TextFieldQuestion(String id, String answer) {
		super(id, answer);
	}
	TextFieldQuestion(String answer){
		super(answer);
	}
	 TextFieldQuestion(double weight) {
		super(weight);
	}
	 
	// getter methods to access encapsulated instance variables
	public String getJustinBieber() {
		return justinBieber;
	}
	public String getPitbull() {
		return pitbull;
	}
	public String getJenniferLopez() {
		return jenniferLopez;
	}
	public String getTaylorSwift() {
		return taylorSwift;
	}
	public int getJustinBieberCount() {
		return justinBieberCount;
	}
	public void setJustinBieberCount(int justinBieberCount) {
		this.justinBieberCount = justinBieberCount;
	}
	public int getPitbullCount() {
		return pitbullCount;
	}
	public void setPitbullCount(int kanyeWestCount) {
		this.pitbullCount = kanyeWestCount;
	}
	public int getJenniferLopezCount() {
		return jenniferLopezCount;
	}
	public void setJenniferLopezCount(int jenniferLopezCount) {
		this.jenniferLopezCount = jenniferLopezCount;
	}
	public int getTaylorSwiftCount() {
		return taylorSwiftCount;
	}
	public void setTaylorSwiftCount(int taylorSwiftCount) {
		this.taylorSwiftCount = taylorSwiftCount;
	}

	 
	// class methods
	// class method that verifies user's name input; if error, throw InvalidNameException
	public void verifyNames() throws InvalidNameException {
		// initialization of variables
		boolean validName = true;
		char invalidChar = Character.MIN_VALUE;
	
		
		for (char c : super.getAnswer().toCharArray()) {
			// if the current character c has an ASCII table value of the following, do this
   	  		if  ((c >= '!' && c <= '@') || (c >= '[' && c <= '`') || (c >= '{' && c <= '~') ) {
   	  			validName = false;
   	  			invalidChar = c;
   	  		} 
   	  		if (!(validName)) {
   	  		    throw new InvalidNameException(String.format("Do not use %c in your name. Make sure to enter a real name.", invalidChar));
   	  		} 
	    }
		if (!validName) {
			super.setAnswer("");
		}
	}
	
	// class method that verifies user's age input; if error, throw InvalidAgeException
	public void verifyAge() throws InvalidAgeException {
		// initialization of variables
		boolean validAge = true;
		char invalidChar = Character.MIN_VALUE;
		
		for (char c : super.getAnswer().toCharArray()) {
			// testing if inputed age is actually a number
	   	  	if  (!(c >= '0' && c <= '9')) {
	   	  		validAge = false;
	   	  		invalidChar = c;
	   	  	} 
	   	  	if (!(validAge)) {
	   	  		throw new InvalidAgeException(String.format("Do not use %c in your Age. Please enter a valid Age.", invalidChar));
	   	 	   
	   	  	} 
		}
		if (validAge) {
			Double doubleAge = Double.parseDouble(super.getAnswer());	
			if (doubleAge < 16) { // must be 16+
				super.setAnswer("");
				throw new InvalidAgeException("Sorry, must be 16+. Please try again.");	
			} else if (doubleAge > 60) { //must be 60-
				super.setAnswer("");
				throw new InvalidAgeException("Sorry, must be 60-. Please try again.");
			} 
		}
	}
	
	// method that calculates names and sets the count for each celebrity using helper methods
	public void calculateNames() {
		//first call removeDuplicateLettersHelper to remove duplicate letters
		String nameAfterChanges = removeDuplicateLettersHelper(super.getAnswer());
		
		//now call a count method for each celebrity
		justinBieberCount = characterMatchCount(nameAfterChanges, getJustinBieber());
		pitbullCount = characterMatchCount(nameAfterChanges, getPitbull());
		jenniferLopezCount = characterMatchCount(nameAfterChanges, getJenniferLopez());
		taylorSwiftCount = characterMatchCount(nameAfterChanges, getTaylorSwift());
	}
	
	// method that removes any duplicate letters within user's name
	private String removeDuplicateLettersHelper(String name) {
		// to test matching, all characters should be in lowercase and removing white spaces
		name = name.toLowerCase();
		name = name.replaceAll("\\s", "");
		
		// loop for removing duplicate letters in order to test similar letters
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (name.charAt(i) == name.charAt(j)) {
					char[] chars = name.toCharArray();
					chars[j] = '*';
					name = String.valueOf(chars);
				}
			}
		}
		return name;
	}
	
	// method that counts the characters between user's name and celebrities name
	private int characterMatchCount(String nameAfterChanges, String celebrityName) {
		//initialization of our count
		int count = 0;
		
		//loop for every character in name by index i
		for (int i = 0; i < nameAfterChanges.length(); i++) { 
			//nested loop for every character in celebrity name by index j
			for (int p = 0; p < celebrityName.length(); p++) {
				//if name at index i is the same as celebrity name at index j, add to count
				if (nameAfterChanges.charAt(i) == celebrityName.charAt(p)) {
					count++; 
				}	
			}
		}
		return count;
	}
}
