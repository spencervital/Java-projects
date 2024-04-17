package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author spencerpenpenvital
 *
 */

public class Week13Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File constitution = new File("Pwd.txt");
		
		if(!constitution.exists()) {
			System.out.println("File does not exist !");
		}
		
		// Store the word we will use
		ArrayList<String> wordsWithCapitalLetters = new ArrayList<String>();
		
		ArrayList<String> wordsWithUncommonLetters = new ArrayList<String>();
		
		
		
		Scanner constIn = null;
		try {
			
			//Separate the words in the dpcument  using the scanner
			// , and separating by white space and removing other characters from the word
			
			constIn = new Scanner(constitution);
			constIn.useDelimiter("\\s*[^a-zA-Z]\\s*");
			
			// Look at each word in the document
			while(constIn.hasNext()) {
				
				boolean hasUncommonLetter = false;
				boolean hasUppercaseLetter = false;
				
				// Grab the world
				String word = constIn.next();
				
				// Llook at each charcater or char in the word
				
				
				if(hasUncommonLetter(word)) {
					wordsWithUncommonLetters.add(word);
				}
				
				if(hasUppercase(word)) {
					wordsWithCapitalLetters.add(word);
				}
			}
			
			// Read the text feom the uncommon letter header.txt
			Scanner uncommonIn = new Scanner(new File("Uncommon Letters Header.txt"));
			
			// Separate the words in the scanner by a random delimiter
			uncommonIn.useDelimiter("\\Z");
			
			// Grab the whole txt of the file into a string
			String uncommmonReportHeader = uncommonIn.next();
			
			Scanner capitalIn = new Scanner(new File ("Capur.txt"));
			capitalIn.useDelimiter("\\Z");
			String capitalReportHeader = capitalIn.next();
			
			// Printing out to a file using the PrintWriter
			PrintWriter lettersReport = new PrintWriter("Letters Report Constitution.txt");
			
			//Printin the uncommon letters report head to the file
			lettersReport.println(uncommmonReportHeader);
			
			for(String word : wordsWithUncommonLetters) {
				lettersReport.print(word);
			}
			lettersReport.println();
			
			// Printing the capital Lteters
			lettersReport.println(capitalReportHeader);
			
			for(String word : wordsWithCapitalLetters) {
				lettersReport.println(word);
			}
			
			lettersReport.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (constIn !=  null) {
			constIn.close();
		}
		
	}
	
	public static boolean hasUppercase (String word) {
		for (char c : word.toCharArray()) {
			if(Character.isUpperCase(c)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasUncommonLetter(String word) {
		ArrayList<Character> uncommonLetters = new ArrayList<Character>();
		uncommonLetters.add('j');
		uncommonLetters.add('q');
		uncommonLetters.add('x');
		uncommonLetters.add('z');
		
		for(char c : word.toCharArray()) {
			if(uncommonLetters.contains(c)) {
				return true;
			}
			
		}
		return false;
	}

}
