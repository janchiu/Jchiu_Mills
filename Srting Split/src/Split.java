//Janson Chiu 
// 10/27/16
import java.util.Arrays;

public class Split 
{
	public static void main(String[] args) 
	{
	splitBread();
	insideSandwich();
		
	String breadStatement = ("applespineapplesbreadlettustomatobaconmayohambreadcheese");
	}
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
	// Make sure you have bread first
	// FindYourKeyword 
	//Test if there is anything between the two breads 
	
	
	public static void splitBread(String statement) {
		if(statement.indexOf(statement)<= 1) {
			System.out.println("Not a sandwich");
		}
		
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	public static void insideSandwich(String sandwich){	
			// no bread = not a sandwich
			if(sandwich.indexOf("bread") < 0){
				System.out.println("Not a Sandwich");
			}
			String substringAfterFirstBread = sandwich.substring(sandwich.indexOf("bread")+5); 
			//location of possible second bread
			if(substringAfterFirstBread.indexOf("bread") <= 0){
				System.out.println("Not a Sandwich");
			}else{
				String stuffNotBread [] = sandwich.split("bread");
				System.out.println(Arrays.toString(stuffNotBread));
				
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		

	}

}
