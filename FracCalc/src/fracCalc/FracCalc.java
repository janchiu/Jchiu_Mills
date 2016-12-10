package fracCalc;

import java.util.Scanner;

public class FracCalc {

	
    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    		
    		Scanner newInput = new Scanner(System.in);
    		System.out.println("Please enter your input");
    		String input = newInput.nextLine();
    		if(input != "quit"){
    				String answer = produceAnswer(input);
    				System.out.println();
    				System.out.println(answer);
    				input = newInput.nextLine();
    		}
    		if(input == "quit"){
    			System.exit(0);
    		}
    		//String input = newInput.nextLine();
    		//String send = produceAnswer(input);
    		//System.out.println(send);
    	}

  
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        String firstOperand = "";
        String secondOperand = "";
        String operator = "";
        
        
        int locationfirst= input.indexOf(" ");
      
        int locationsecond= input.indexOf(" ", locationfirst+2);
        int[] array = input.split(" ");
        firstOperand= input.substring(0,locationfirst);
        secondOperand = input.substring(locationfirst+3);
        operator= input.substring(locationfirst+1, locationsecond);
        
        return partsImproper(secondOperand);
        
    }
    /*public static String partsImproper(String secondOperand){
    	
    	int slash= secondOperand.indexOf("/");
    	int underscore= secondOperand.indexOf("_");
    	
    	String wholeNum;
    	String denominator;
    	String  numerator;
    	
    	
    	if(slash<0 && underscore<0){
    		wholeNum= secondOperand;
    		numerator= "0";
    		denominator= "1";
    	}
    	else if (slash>0 && underscore<0){
    		wholeNum= "0";
    		numerator = secondOperand.substring(0,slash);
    		denominator = secondOperand.substring(slash+1);
    		
    	}
    	
    	else {
    		wholeNum= secondOperand.substring(0,underscore);
    		numerator = secondOperand.substring(underscore+1,slash);
    		denominator = secondOperand.substring(slash+1);
    	}
    	return ("whole:"+wholeNum+" "+"numerator:"+numerator+" "+"denominator:"+denominator);
    	
    }
    */
    public static int[] parseOperands(String operand){
		
		String[] answer;
        String operator;
        String operand1; 
        String operand2;
        String slash = "/";
        String underscore = "_";
        if (operand.indexOf("+")!= -1){
            answer = operand.split("+");
            operator = "+";
            answer[0] = operand1;
            answer[1] = operand2;
            if (operand1.indexOf(underscore) > 0) {
            	String[] parseWholeFrac = operand1.split("_");
            	String wholeNumber = parseWholeFrac[0];
            	String fraction = parseWholeFrac[1];
            	
            	String[] numberAndDenominator = fraction.split("/");
            	
        } 
        if (operand.indexOf("-") != -1) {
            answer = operand.split("-"); 
            operator = "-";
        } 
        if (operand.indexOf("*") != -1) {
            answer = operand.split("*");
            operator = "*";
        }
        if (operand.indexOf("/") != -1) // fix 
            answer = operand.split("/");
        	operator = "/";
    	}
        
        String[] operands = answer;
        operands[1] = operator;
        operands[0] = operand1; 
        operands[2] = operand2; 
      
        String[] firstOperand;
        if(operand1[0].indexOf(slash) > 0 && operand1[0].indexOf(underscore) > 0) {
            firstOperand = operand1[0].split("/");
            firstOperand = operand1[0].split("_");
        }
        if(operand1[0].indexOf(slash) > 0 && operand1[0].indexOf(underscore) < 0) {
            firstOperand = operand1[0].split(slash);
        }
	}
	
	
	public static int[] addFrac(int denominator1, int denominator2, int numerator1, int numerator2){
	int[] answer; 
	if(denominator1 == denominator2){
		commonDenominator = denominator1;
		answer = (numerator1+numerator2)+ "/ " + commonDenominator;
	}
	else {
		commonDenominator = (denominator1 * denominator2);
		int newNumerator1 = (numerator1 * denominator2);
		int newNumerator2 = numerator2 * denominator1;
		answer = (newNumerator1+newNumerator2) + "/" + commondDenominator;
	}
		return answer;
	
	}
	
    	public static int[] toImproperFrac(int wholeNum, int numerator, int denominator) { // This method converts mixed number into an improper fraction //
    		if(wholeNum > 0) {
                numerator = (wholeNum*denominator) - numerator;
            } else {
            if(wholeNum > 0 ) {
                numerator = (wholeNum*denominator) + numerator;
            } else {
                numerator = (wholeNum*denominator) - numerator;
            }
                int[] numeratorAndDenominator = new int[2];
                numeratorAndDenominator[0] = numerator;

    	}
    	
    	
    	public static int[] subtractFrac(denominator1, denominator2, numerator1, numerator2) {
    	String  answer; 
    	if(denominator1 == denominator2){
    		commonDenominator = denominator1;
    		answer = (numerator1-numerator2)+ "/ " + commonDenominator;
    	}
    	else {
    		commonDenominator = (denominator1 * denominator2);
    		int newNumerator1 = numerator1 * denominator2;
    		int newNumerator2 = numerator2 * denominator1;
    		answer = (newNumerator1-newNumerator2) + "/" + commonDenominator;
    	}
    		return answer;
    	}

    	public static int[] multiplyFrac(denominator1, denominator2, numerator1, numerator2) {
    		String  answer; 
    		int newNumerator = (numerator1 * numerator2);
    		int newDenominator = (denominator1 * denominator2); 
    		answer = newNumerator + "/" + mewDenominator; 
    	}
    	
    	public static int[] divideFrac (numerator1, numerator2, denominator1, denominator2) {
    	String answer; 
    	int newNumerator = (numerator1 * denominator2); 
    	int newDenominator = (numerator2 * denominator1); 
    	answer = newNumerator + "/" + newDenominator; 
    	}
    	

    // TODO: Fill in the space below with any helper methods that you think you will need

}

}
