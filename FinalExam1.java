package Final;

import java.util.Scanner;

/*
 * Program: Final Exam 1
 * Name: Spencer Vital
 * Date: 14/12/2022
 * Description: Strings
 */


public class FinalExam1 {
	public static void main(String[] args) {

		// Declaration of global variables
		Scanner in = new Scanner(System.in);
		boolean validMaleNumber = false;
		boolean validFemaleNumber = false;

		int males = 0;
		int females = 0;

		// Asking the user to enter the name and store it in a variable
		System.out.print("Please enter your name: ");
		String name = in.nextLine();
		System.out.println();
		
		// Asking the user to enter the ward's name and store it in a variable
		System.out.print("Please enter the name of your ward: ");
		String wardName = in.nextLine();
		System.out.println();

		// This do while loop checks the user's input for the adult male's numbers in the ward.
		do {
			System.out.print("Please enter the approximate number of adult males in the ward: ");

			try {

				males = Integer.parseInt(in.nextLine());
				validMaleNumber = true;
				System.out.println();
			}catch(Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
				validMaleNumber = false;
				System.out.println();
			}
		}while(!validMaleNumber); // End of the loop


		// This do while loop checks the user's input for the adult female's numbers in the ward.
		do {
			System.out.print("Please enter the approximate number of adult females in the ward: ");
			try {

				females = Integer.parseInt(in.nextLine());
				validFemaleNumber = true;
				System.out.println();
			}catch(Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
				validFemaleNumber = false;
				System.out.println();
			}
		}while(!validFemaleNumber); // End of the loop


		int sumOfMembers = males + females; // This variable contains the sum of men and women in the ward
		System.out.printf("There are %d adult members in %s's %s ward.", sumOfMembers, name, wardName); // Print out the result

		in.close(); // Closing Scanner

	}//end of main()


}//end of class FinalExam1
