package week03;
import java.util.*;


public class SmallerArrayWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameList = {"Henry","Franklin","Joanne","Mike","Carlton","Chet","Whitney","Charlie","Pamela","Zarathustra"};
		for (int i = 0; i < nameList.length; i++) {
			System.out.println(nameList[i]);
		}	
			System.out.println("---------------");
			System.out.println("Type a name to check against the array:");
			
			Scanner sc = new Scanner(System.in);
			String testName = sc.nextLine();

			
			
			
			if (isPresent(nameList, testName) == true) {
				System.out.println("Yes, the name " + testName + " is in the array!");
			} else {
				System.out.println("No, doesn't look like THAT'S in there...");
			}
			
			
			
		
	}

	public static boolean isPresent(String[] nameList, String testName) {
		List nameListAl = Arrays.asList(nameList);
		boolean wellIsIt = nameListAl.contains(testName);
		
		return wellIsIt;
	}}

