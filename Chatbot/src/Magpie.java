import java.util.ArrayList;
import java.util.Random;

/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>
 * Uses indexOf to find strings</li>
 * <li>
 * Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie {

	private String[] randResponse = { "Interesting, tell me more.", "Hmmm.",
			"Do you really think so?", "You don't say.", "Are you sure?",
			"Is that a hobby of yours?" };

	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.trim().length() > 0) {
			if (findKeyword(statement, "no") >= 0) {
				response = "Why so negative?";
			} else if (findKeyword(statement, "mother") >= 0
					|| findKeyword(statement, "father") >= 0
					|| findKeyword(statement, "sister") >= 0
					|| findKeyword(statement, "brother") >= 0) {
				response = "Tell me more about your family.";
			} else if (findKeyword(statement, "cat") >= 0
					|| findKeyword(statement, "dog") >= 0) {
				response = "Tell me more bout your pets.";
			} else if (findKeyword(statement, "arrington") >= 0) {
				response = "She sounds like a goo teacher";
			} else if (findKeyword(statement, "school") >= 0) {
				response = "Do you enjoy school?";
			} else if (findKeyword(statement, "work") >= 0
					|| findKeyword(statement, "job") >= 0
					|| findKeyword(statement, "no") >= 0){
				response = "What is your job.";
			} else if (findKeyword(statement, "I want to") >= 0){
				response = transformIWantToStatement(statement);
			} else if(findKeyword(statement, "I") == 0 && findKeyword(statement, "you") > 1){	
				response = transformYouMeStatement(statement);
			} else {
				response = getRandomResponse();
			}
		} else {
			response = "Please say something";
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		return randResponse[(int)(Math.random() * randResponse.length)];
	}
	
	private int findKeyword(String statement, String goal, int startPos){
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		while(psn >= 0){
			String before = " ", after = " ";
			if(psn > 0){
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			
			if(psn + goal.length() < phrase.length()){
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			if(((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))){
				return psn;
			}
			
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
		}
		
		return -1;
		
	}
	
	private int findKeyword(String statement, String goal){
		return findKeyword(statement, goal, 0);
	}
	
	private String transformIWantToStatement(String statement){
		statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if(lastChar.equals(".")){
			statement = statement.substring(0, statement.length() - 1);
		}
		int psn = findKeyword(statement, "I want to", 0);
		String restOfString = statement.substring(psn + 9).trim();
		return "What would it mean to " + restOfString + "?";
	}
	
	private String transformYouMeStatement(String statement){
		String verb = statement.substring(findKeyword(statement, "I") + 1, findKeyword(statement, "you")).trim();
		return "Why do you " + verb + " me?";
	}
}
