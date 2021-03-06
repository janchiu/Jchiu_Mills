// Janson Chiu
// APCS Period 1
//11/6/16
//Arrays Lab 3

package arrays_materials;
import java.util.Arrays;
public class ArraysLab3 
{
	
	public static int[] sum(int[] arr1, int[] arr2) // accepts two arrays of integers arr1 and arr2
	{												// returns an array of integers
		assert (arr1.length > 0);					// assumes that the length of arr1 and arr2 is greater than 0 and has the same length
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
	int[] sumOfTwoArrays = new int[arr1.length];
	for(int i =0; i<arr1.length; i++) {
		sumOfTwoArrays[i] = arr1[i] + arr2[i];
	}
	return sumOfTwoArrays;
	}

	public static int[] append(int[] arr, int num) // accepts an array of integers arr of length n and an integer num
	{												// returns an array of integers of length n+1
		assert (arr.length > 0);					// Assumes that arr length is greater than 0
		int[] appendArray = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			appendArray[i] = arr[i]; 
		}
		appendArray[arr.length] = num;
		return appendArray;
	}
	
	public static int[] remove(int[] arr, int idx) //  accepts an array of integers arr and an integer idx 
												   //  returns an array of integers consisting of all of the elements of arr 
													
	{
		assert (arr.length >= 2);	// assumes that the length of arr is greater than 2 
		int[] removeArr = new int[arr.length-1];
		for(int i = 0; i<idx; i++) {
			removeArr[i] = arr[i];
		}
		for(int i = idx; i<removeArr.length; i++) {
			removeArr[i] = arr[i+1];
		}
		return removeArr;
	}
	
	public static int sumEven(int[] arr) // accepts an array of integers arr
										 // returns an integer containing the sum of the elements at the even indices of arr
	{
		assert (arr.length > 0); // assumes that arr has at least one element
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	
	/*
	 * Write a method rotateRight that accepts an array of integers arr 
	 * and does not return a value.  
	 * The rotateRight method moves each element of arr one index to the right 
	 * (element 0 goes to element 1, element 1 goes to element 2, �, element n-1 goes to element 0).  
	 * You can assume arr has at least one element.
	 */
	public static void rotateRight(int[] arr) // moves each element of arr one index to the right, element n-1 goes to element 0
											  // accepts an array of integers arr and does not return a value 
	{
		assert (arr.length > 0);			// assumes that arr has at least one element
		int lastValue = arr[arr.length-1];
		for (int i = arr.length-1; i >0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = lastValue;
	}

	/*
	 * Write a main method that will 
		Contain
			integer arrays a1, a2, sumArr, appendArr, removeArr
			int variables appendNum, removeIdx, sumOfEvens
		Carry out the following actions
			Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) 
			and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)
			Form sumArr by calling the sum method with a1 and a2 as inputs
			Declare int appendNum and set it to 200.
			Form appendArr by calling the append method with a1 and appendNum as inputs
			Declare int removeIdx and set it to 5.
			Form removeArr by calling remove with a2 and removeIdx
			Form sumOfEvens by calling sumEven with appendArr as the input
			Call rotateRight with a1 as the input
			On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
				sumArr
				appendArr
				removeArr
				sumOfEvens (an int you don�t need Arrays.toString)
				a1
	 */
	
	public static void main(String[] args) // it will test and print out the methods
	{
		int[] a1 = {5,10,15,20,25,30,35,40};
		int[] a2 = {7,14,21,28,35,42,49,56};
		int[] sumArr = sum(a1,a2);
		int appendNum = 2000; 
		int[] appendArr = append(a1,appendNum);
		int removeIdx = 5; 
		int[] removeArr = remove(a2,removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
		
	}
}
