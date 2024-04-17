package week9;

import java.util.Scanner;

public class ValidationMethods {
	public static void main(String[] args) {
		//Initialize local variables
		Scanner sIn = new Scanner(System.in);	//Input Scanner for String
		int intNum = 0;
		double doubleNum = 0;
		String choice = "";
		String playAgain = "Y";

		//Keep program running until user wants to quit		
		do {
			//Get an integer from the user
			int[] intRange1 = {}; 
			intNum = getValidInt(sIn, "Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.",intRange1);
			System.out.println("The whole number your entered was: "+ intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n\n",intNum, (intNum + 10));

			//Get an integer within a range from the user
			int[] intRange2 = {10, 50}; 
			intNum = getValidInt(sIn, "Please enter a whole number between 10 and 50: ", "Invalid response. Only whole numbers between 10 and 50 are acceptable.",intRange2);
			System.out.println("The whole number your entered was: "+ intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n\n",intNum,(intNum + 10));

			//Get a Double from the user
			double[] doubleRange1 = {}; 
			doubleNum = getValidDouble(sIn, "Please enter a floating-point number: ", "Invalid response. Only floating-point numbers are acceptable.",doubleRange1);
			System.out.println("The float your entered was: " + doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n\n", doubleNum, (doubleNum + 10));

			//Get a Double within a range from the user
			double[] doubleRange2 = {5.5, 10.75}; 
			doubleNum = getValidDouble(sIn, "Please enter a floating-point number between 5.5 and 10.75: ", "Invalid response. Only floating-point numbers between 5.5 and 10.75 are acceptable.",doubleRange2);
			System.out.println("The float your entered was: " + doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n\n", doubleNum, (doubleNum + 10));

			//Get either an "a", "b" or "c" from the user
			String[] options1 = {"a","b","c"};
			choice = getValidString(sIn, "Please enter 'a', 'b' or 'c': ", "Invalid response. Only the letters 'a', 'b' or 'c' are acceptable.", options1);
			System.out.printf("The letter your entered was: %s\n\n", choice);

			//Get a word from the user
			String[] options2 = {"Chocolate","Vanilla","Strawberry"};
			choice = getValidString(sIn, "Please choose either Chocolate, Vanilla or Strawberry: ", "Invalid response. Only 'Chocolate', 'Vanilla' and 'Strawberry' are acceptable answers.",options2);
			System.out.printf("You chose: %s\n\n", choice);

			//Get a 'Y' or 'N' from the user
			String[] options3 = {"Y","y","N","n"};	        
			playAgain = getValidString(sIn, "Would you like to play again? (Y/N): ", "Invalid response.  Please answer with a 'Y' or 'N'", options3);	
		}while(playAgain.equalsIgnoreCase("Y"));

	}//end of method main()

	/**getValidInt method validates user input is an Integer within range and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If range is empty, range is ignored and only validates input is an integer.
	 * If range is not empty, validates user input is an integer within range.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static int getValidInt(Scanner sIn, String question, String warning, int[] range){

		int value = range.length;

		while (true) {
			System.out.println(question);
			String userInput = sIn.nextLine();
			try {
				int validInput = 0;
				validInput = Integer.parseInt(userInput);
				if(value != 0) {
					if(validInput >= range[0] && validInput <= range[1]) 
						return validInput;
				}else {
					return validInput;
				}
			}catch(Exception e) {

			}
			System.out.println(warning);
		}

	}//end of method getValidInt(Scanner, String, String, int[])

	/**getValidDouble method validates user input is a double within range and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If range is empty, range is ignored and only validates input is an double.
	 * If range is not empty, validates user input is a double within range.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static double getValidDouble(Scanner sIn, String question, String warning, double[] range){
		int value = range.length;

		while (true) {
			System.out.println(question);
			String userInput = sIn.nextLine();
			try {
				double validDouble = 0;
				validDouble = Double.parseDouble(userInput);
				if(value != 0) {
					if(validDouble >= range[0] && validDouble <= range[1]) 
						return validDouble;
				}else {
					return validDouble;
				}
			}catch(Exception e) {

			}
			System.out.println(warning);
		}
	}//end of method getValidDouble(Scanner, String, String, double[])		


	/**getValidString method validates user input is within list of choices and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If choices is empty, returns input.
	 * If choices is not empty, validates user input is within choices.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static String getValidString(Scanner sIn, String question, String warning, String[] choices){
		while (true) {
			System.out.println(question);
			String b = sIn.nextLine();
			for(String a:choices)
				if (a.equals(b))
					return b;
			System.out.println(warning);

		}
	}// end of method getValidString(Scanner, String, String, String[])

}//end of class Lab9iStartCode

