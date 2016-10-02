/**
 * 
 */

/**
 * @author janson
 *
 */
public class ProcessingNumbers {
import java.util.*;
	public static String main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you want to use?");
		int totalnumber = userInput.nextInt();
		int max;
		int min;
		int total;
		for(int count = 0; count <totalnumber;count++) {
			int nextNumber= userInput.nextInt();
			if (nextNumber % 2 ==0) {
				return nextNumber;
			}
			int largestEvenNumber = Math.max(nextNumber);
			total += nextNumber;
			System.out.println("Enter the next # to add");
			for(int i =1; i <= length-1; i++) {
				if(nextNumber >max) {
					max = nextNumber;
				} else if (nextNumber<min) {
							min = nextNumber;
				}
			}	
		}
		System.out.println("The sum of all even number is " + total );
		System.out.println("The largest even number is "+ largestEvenNumber);
		System.out.println("The max and min of all the numbers used is "+ max+ ", "+min);
	}

}
