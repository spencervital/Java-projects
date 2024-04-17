package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class PasswordScanner {

	public static void main(String[] args) {

		File passwords = new File("Pwd.txt");

		if (!passwords.exists()) {
			System.out.println("Error, no file 'Pwd.txt' exists");
			return;
		}

		Scanner fileIn = null;
		PrintWriter invalidPasswords = null;
		PrintWriter validPasswords = null;
		try {
			System.out.println("Beginning password analysis....");
			System.out.println("Opening file 'Pwd.txt'");
			fileIn = new Scanner(passwords);
			invalidPasswords = new PrintWriter("invalidpwd.txt");
			validPasswords = new PrintWriter("validpwd.txt");

			while (fileIn.hasNextLine()) {
				String password = fileIn.nextLine();
				if (hasUpper(password) && hasLower(password) && hasNumber(password) && hasSpecial(password)) {
					validPasswords.println(password);
				} else {
					invalidPasswords.println(password);
				}
			}

			fileIn.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Analysis complete. Closing files.");
			if (fileIn != null) {
				fileIn.close();
			}
			if (invalidPasswords != null) {
				invalidPasswords.close();
			}
			if (validPasswords != null) {
				validPasswords.close();
			}
		}
		System.out.println("Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the "
				+ passwords.getAbsolutePath() + " directory.");

	}



	public static boolean hasUpper (String word) {
		for (char c : word.toCharArray()) {
			if(Character.isUpperCase(c)) {
				return true;
			}
		}
		
		return false;
	}



	public static boolean hasLower (String word) {
		for (char c : word.toCharArray()) {
			if(Character.isLowerCase(c)) {
				return true;
			}
		}
		
		return false;
	}



	public static boolean hasNumber (String word) {
		for (char c : word.toCharArray()) {
			if(Character.isDigit(c)) {
				return true;
			}
		}
		
		return false;
	}



	public static boolean hasSpecial(String text) {
		ArrayList<Character> specials = new ArrayList<Character>();
		specials.add('@');
		specials.add('#');
		specials.add('%');
		specials.add('-');
		specials.add('&');
		specials.add('*');
		for (char c : text.toCharArray()) {
			if (specials.contains(c)) {
				return true;
			}
		}
		return false;
	}

}

