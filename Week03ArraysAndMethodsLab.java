//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;
import java.util.*;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int array[] = new int[6];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 8;
		array[4] = 13;
		array[5] = 6;
		
		// 2. Print out the first element in the array
		System.out.println(array[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(array.length);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(array[6]);
		System.out.println("It throws an exception that the position is out of bounds for the length of the array.");
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(array[-1]);
		System.out.println("It throws an exception that the position is out of bounds for the length of the array.");
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i <= 5; i++) {
			System.out.println(array[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int value : array) {
			System.out.println(value);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int j = 0; j < 6; j++) {
			sum = sum + array[j];
		}
		System.out.println("Sum = " + sum);
		
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = sum / array.length;
		System.out.println("The average of the numbers of the array is " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int odd : array) {
			if (odd % 2 != 0) {
				System.out.println(odd);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		//String[] firstNames = new String[]{"Sam", "Sally", "Thomas", "Robert"};
		String[] firstNames = new String[4];
			firstNames[0] = "Sam";
			firstNames[1] = "Sally";
			firstNames[2] = "Thomas";
			firstNames[3] = "Robert";
			
		// 12. Calculate the sum of all the letters in the new array

		String monsterName = "";
		for (int m = 0; m <4; m++) {
			monsterName = monsterName + firstNames[m];
		}
		int monsterLength = monsterName.length();
		System.out.println("The length of all names is " + monsterLength);
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greetingMethod(monsterName);
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
			System.out.println(greetingReturnMethod(monsterName));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
			//13 applies a method to a called string which it prints.
			//14 only creates the greeting around the string, which you have to then print yourself.
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println("It's " + stringGreaterThanNumber(monsterName) + ", the name " + monsterName + " has more letters than the number of entries in the array.");
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		//Scanner sc = new Scanner(System.in);
		//String presentName = sc.nextLine();
		//if(isPresent(presentName, firstNames) == true) {
		//	System.out.println("Yep, " + presentName + " is in the array.");
		//}	else {
		//	System.out.println("Noo, " + presentName + " is not in the array, idiot.");
		//}
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		//int[] smallestNum = {5,7,14,29,3,444,1};
		//	System.out.println("The smallest number in the array is " + isSmallest(smallestNum) + ".");
		//
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] doubleNums = {18,46,25,99.4,16.05};
			double aveReturn = aveDouble(doubleNums);
			System.out.println(aveReturn);

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	
	// Method 13:
	public static void greetingMethod(String g) {
		System.out.println("Hello, " + g + ", it's a pleasure to meet you!");
	}

	// Method 14:
	public static String greetingReturnMethod(String b) {
		return "Hello, " + b + ", good to see you. You're looking mighty sus today!";
	}
	
	// Method 15:
	public static boolean stringGreaterThanNumber(String w) {
		int firstNames = 4;
		int monsterLength = w.length();
		return monsterLength > firstNames;
	}
	
	// Method 16:
	public static boolean isPresent(String p, String[] q) {
		boolean present = Arrays.asList(q).contains(p);
			return present;
		}
	

	
	// Method 17:
	/*public static int isSmallest(int[] tempNum) {
		int smallest = 1000;
		for(int r = 0; r <= tempNum.length; r++) {
			if (tempNum[r] < smallest) {
				smallest = tempNum[r];
			}
			return smallest;
		}
	} */

	
	// Method 18:
	public static double aveDouble(double[] doubleNums) {
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += doubleNums[i];
		}
		double average = (sum / doubleNums.length);
		return average;
	}
	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

}