package Final;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Program: Final Exam 2
 * Name: Spencer Vital
 * Date: 14/12/2022
 * Description: Arrays and Functions
 */

public class FinalExam2 {

	public static void main(String[] args) {

		// Declaration of variables
		Scanner in = new Scanner (System.in);

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Display a message to tell the user what the program will do
		System.out.println("In this program, you will ask the user to enter a list of numbers.");
		System.out.println("The program will then find the sum of the numbers and determine which of the numbers is the largest");
		System.out.println();


		//Loop that asks the user to enter a number
		do {
			System.out.print("Please enter a number (or just hit enter to finish):  "); // ask user to enter a number
			String input = in.nextLine();
			if (input.isEmpty()) {
				break;
			}
			int value = (Integer.parseInt(input));
			numbers.add(value);
		}while(true); // end of the do while loop

		System.out.println();
		// Calling the sumNumbers method
		int sum = sumNumbers(numbers);
		System.out.println("The sum of the list of numbers is: "+sum+".");

		//Calling the biggestNumber method
		int bigNum = biggestNumber(numbers); 
		System.out.println("Thelargest number in the list is: "+bigNum+".");

		in.close(); // Closing scanner
	}//end of main()

	// Method that determine the biggest number between the array list.
	private static int biggestNumber(ArrayList<Integer> numbers) {
		// TODO Auto-generated method stub
		int biggestNum = 0;
		for(int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) > biggestNum) {
				biggestNum = numbers.get(i);
			}
		}
		return biggestNum;
	}

	// Method that calculate the sum between the array list.
	private static int sumNumbers(ArrayList<Integer> numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum;
	}

}//end of class FinalExam2