// Janson Chiu 
// Collab Exercise 10/2/16
// 1. Accepts as user input a string of numbers, 2. Prints the smallest and largest of all the numbers supplied by the user. 3. Print the sum of all the even numbers the user typed along with the largest even number typed. 
import java.util.*;
public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you want to use?");
		int totalNumber = userInput.nextInt();
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		int maxEven = Integer.MIN_VALUE;
		int totalEven =0;
		for(int count = 0; count <totalNumber;count++) {
			System.out.println("Enter the next # to add");
			int nextNumber= userInput.nextInt();
			if (nextNumber > max){
				max = nextNumber;
			}
			if (nextNumber < min) {
				min = nextNumber;
			}
			if (nextNumber % 2 == 0){
				totalEven += nextNumber;
				if (nextNumber > maxEven){
					maxEven = nextNumber;
				}
			}
		}
		System.out.println("The smallest number is "+ min);
		System.out.println("The largest number is " + max);
		System.out.println("The sum of all even number is " + totalEven );
		System.out.println("The largest even number is "+ maxEven);
		}
	
}



