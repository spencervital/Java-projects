package week13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FormLetter {
	public static void main (String[] args) throws IOException{

		//create object

		File gradesFile = new File("Student Assignment Scores.csv");

	// Create an object for letter file

	File letterFile = new File("Warning Letter to Student -.txt");

	// Create an object to read data from letter

	try (Scanner letterScan = new Scanner(letterFile)) {
		letterScan.useDelimiter("\\Z");

		// store entire contents of a letter to the letterContent variable

		String letterContent = letterScan.next();

		try (Scanner grade = new Scanner(gradesFile)) {
			System.out.println("Creating letters for:");

			// Loop in every line of the grades file and check if there is any 0 assignment

			// create a string to store the indices for the units failed or missing.

			// Create a boolean variable to check if a student has any failed or missing assignment

			// will be used to create the letter to the student



			int counter = 0;

			while (grade.hasNextLine()) {

			String[] student;

			if (counter == 0) {

			student = grade.nextLine().split(",");

			} else {

			student = grade.nextLine().split(",");

			boolean createLetter = false;

			String unitsFailed = "";

			for (int i = 1; i < student.length; i++) {

			if (Integer.parseInt(student[i]) == 0) {

			createLetter = true;

			unitsFailed += "" + i;

			}

			}

			// If the student has a failed assignment or missing, generate a letter for the student

			if (createLetter) {

			File studentLetter = new File("Warning Letter to Student - " + student[0] + ".txt");

			studentLetter.createNewFile();

			PrintWriter printWriter = new PrintWriter("Warning Letter to Student - " + student[0] + ".txt");

			System.out.println(student[0]);

			printWriter.write("Dear " + student[0] + ", \n");

			printWriter.write(letterContent);

			for (char indices : unitsFailed.toCharArray()) {

			printWriter.write("\n Assigment " + indices);

			}

			printWriter.close();

			}

			}

			counter++;

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

}
