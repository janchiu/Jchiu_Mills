
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";

		if (statement.indexOf("no") >= 0) {
			response = "Why not?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0 
				|| statement.indexOf("brother") >= 0){
			response = "Tell me more about your family.";
		} else if (statement.indexOf("wolf") >= 0 ) {
			response = "I love wolves";
		} else if (statement.indexOf("friend") >= 0) {
			response = "Tell me more about your friend";
		} else if (statement.indexOf("thirsty") >= 0) {
			response = "Go drink some water";
		} else if (statement.indexOf("tennessee") >= 0){
			response = "You're the only ten I see";
		} else if(statement.trim().length()==0){
			response = "Say something, please.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "What did you do today?";
		} else if (whichResponse == 5) {
			response = "What is your favorite video game?";
		}
		return response;
	}
}
