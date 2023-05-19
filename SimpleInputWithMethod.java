package week03;
import java.util.Scanner;

public class SimpleInputWithMethod {
	
	static String myMethod(String x, String y) {
		
		String fullName = x + " " + y;
		return fullName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		
		String firstName = sc.nextLine();
		
		System.out.println("Thank you. What is your last name?");
		String lastName = sc.nextLine();
		
		//System.out.println("First name " + firstName + ", last name " + lastName + "?");
		
		//myMethod(firstName,lastName);
		System.out.println("It's nice to meet you, " + myMethod(firstName, lastName) + ". What brings you to this java console?");
		
		String reason = sc.nextLine();
		System.out.println("That sounds wonderful, " + myMethod(firstName, lastName) + "! I hope you enjoy " + reason + "!");
	}
}
		

