package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> studentNameAndGpa = new ArrayList<String>();
		ArrayList<Double> studentsGpa = new ArrayList<Double>();
		
		// Get Student name and GPA
		boolean valid = false;
		do {
			System.out.println("Enter the next student and their GPA. (Or press enter to be done");
			String input = in.nextLine();
			if(input.equals("")) {
				break;
			}
			if(input.contains(":")) {
				int separator = input.indexOf(":");
				String name = input.substring(0, separator).trim();
				double gpa = 0;
				try {
					String gpaStr = input.substring(separator+1).trim();
					gpa = Double.parseDouble(gpaStr);
					studentNameAndGpa.add(name + ":" +gpa);
					studentsGpa.add(gpa);
					valid = true;
				}catch(Exception e) {
					valid = false;
				}
				
				
			}
			if(!valid) {
				System.out.println("Invalid input. Please have a format of <student>:<gpa>.");
			}
			//<Student>:gpa
			// e.g. "   Spencer Vital :    4.0"
			
		} while(true);
		
		// Display the Average GPA
		Collections.sort(studentNameAndGpa);
		for(String student : studentNameAndGpa) {
			System.out.println(student);
		}
		
		System.out.println("The average GPA is; "+getAverage(studentsGpa));
		//
		
		
		
		
		
		in.close();
	}

	private static Double getAverage(ArrayList<Double> gpas) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < gpas.size(); i++) {
			sum += gpas.get(i);
		}
		return sum / gpas.size();
	}
	
	

}
