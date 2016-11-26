/**
 * 
 */

/**
  APCS1//Janson Chiu
//Period 1
//Date: 11/25/16
//Math Library
 *
 */
public class Calculate {
	public static int square(int number) { 	//The method returns the square of the value passed//
		return(number*number);
	}

	public static double cube(double number) { //This method returns the cube of the value passed//
		return(number*number*number);
	}
	
	public static double average(double number1, double number2) { // The method returns of the average of the two doubles passed//
		return((number1+number2)/2);
	}
	
	public static double average(double number1, double number2, double number3) { // This method would return the average of three doubles passed//
		return((number1+number2+number3)/3);
	}
	
	public static double toDegrees(double number) {//This method converts from Radians to Degrees //
		double pi= 3.14159;
		return((number*180)/pi);
	}
	
	public static double toRadians(double number) { //This method converts from degrees to Radians //
		double pi= 3.14159;
		return((number/180)*pi);
	}
	
	public static double discriminant(double a, double b, double c) { // finds the discriminant of three doubles // 
		return((b*b)-(4*a*c));
	}
				
	public static String toImproperFrac(int wholenumber, int numerator, int denominator) { // This method converts mixed number into an improper fraction //
		String answer = (((wholenumber*denominator)+numerator)+ "/" + denominator);
		return answer;
	}
	
	public static String toMixedNum(int numerator, int denominator){ // This method converts an improper fraction into a mixed number //
		int wholeNumb = numerator/denominator;
		int numer = numerator%denominator;
		if(numer != 0) {
				return(wholeNumb + "_" + numer + "/" + denominator);
		} else {
				return(wholeNumb + "");
		}
	}
	
	public static String foil (int a, int b, int c, int d, String n){ // This method converts a binomial multiplication of the form (ax+d)(cx+d) into a polynomial //
		int secondDegree = a*c;
		int firstDegree = (a*d)+(b*c);
		int yInteger = (b*d);
		String polynomial = (secondDegree+n+"^2 ");
		if (firstDegree < 0){
			polynomial += firstDegree;
		} else {
			polynomial += ("+ "+ firstDegree + n);
		}
		if ( yInteger <0){
			polynomial += (" - "+ -1*yInteger);
		} else {
				polynomial +=(" + "+ yInteger);
		}
		
		return(polynomial);
		
	}
	
	public static boolean isDivisibleBy(int a, int b){ // This method determines whether or not one integer is evenly divisible by another integer //
	
		if (b == 0) {
			throw new IllegalArgumentException ("Cannot be divisible by 0");
		}		
		if(a%b == 0){ 
			return true;
		}else { 
			return false;
		}
	}
	
	public static double absValue(double a) { // This method returns the absolute value of the double passed //
		if (a > 0) {
			return a * (1.0);
		} else {
			return a * (-1.0);
		}
	}
	
	public static double max (double number1, double number2) { // This method returns the larger of the two integers passed //
		if (number1>number2) {
			return number1;
		}else {
			return number2;
		}
	}
				
	public static double max(double a, double b, double c){ // This method returns the largest numbers of three doubles //
		  if(a>b && b>c){
			  return a;
		  }

		  else if(a>b && b>c){
			  return b;
		  }
		  else{
			  return c;
		  }
	}
	
	public static double min(double number1, double number2) { // This method returns the smaller of the two integers passed // 
		if (number1 > number2) {
			return number2;
		}else {
			return number1;
		}
	}
	
	public static double round2(double number1) { // This method rounds a double to 2 decimal places // 
		double x = number1*1000;
		double y = x%10;
		if (y >= 5) {
			return (x-y+10)/1000;
		} else {
			return (x-y)/1000;
		}
		
	}
	
	public static double exponent( double base, int power) { // This method raises a a double to a positive integer power // 
		if (power<0) {
			throw new IllegalArgumentException ("Cannot be raised a number to the negative power");
		}
			if (power == 0) {
				return 1;
			}
			if (power == 1) {
				return base;
			}
			double previous = base;
			while (power > 1) {
				previous = previous * base;
				power--;
			}
			return previous;
		}

	public static int factorial (int n) { // This method returns the factorial of the value passed // 
		if (n<0) {
			throw new IllegalArgumentException ("Cannot get the factorial"
					+ " of a negative number");
		}
		int product=1;
		for(int i = n; i >1; i--){
			product = product*i;
		}
		return product;
		
	}
		
	public static boolean isPrime (int a) { // This method determines whether the integer passed is a prime number//
		for(int i = 2; i < a;i++ ) {
			if(Calculate.isDivisibleBy(a,i) == true) {
				return false;
			}
		}
		return true;	
	}

	public static double gcf(double number1, double number2) {
		if(number1 < 0 || number2 < 0) {
			return gcf(Calculate.absValue(number1), Calculate.absValue(number2));
		}if(number2 == 0) {
			return number1;
		} else {
			return gcf(number2, number1 % number2);
		}
	}
	public static double sqrt(double a) { // This method returns the square root of the double passed. 
		if (a<0) {
			throw new IllegalArgumentException ("Cannot square root a negative number");
		}
		
		a = Calculate.round2(a);
			double t;
			double squareRoot = a / 2.0;
			do {
				t = squareRoot;
				squareRoot = (t + (a / t)) / 2;
			} while ((t - squareRoot) != 0);
		 
			return squareRoot;
			
	}
	

	public static String quadForm(int a, int b, int c) { //The method finds the roots of a quadratic function in standard form (place coefficients in the order they appear in when in standard form)
		double discriminant = Calculate.discriminant(a, b, c);
		if (discriminant < 0) {
			return ("no real roots");
		}
		double rootone = Calculate.round2((-b + Calculate.sqrt(discriminant)) / (2 * a));
		double roottwo = Calculate.round2((-b - Calculate.sqrt(discriminant)) / (2 * a));
		if (rootone == roottwo) {
			return (rootone + "");
		}
		if (rootone > roottwo) {
			return (roottwo + " and " + rootone);
		} else {
			return (rootone + " and " + roottwo);
		}
	}
}


