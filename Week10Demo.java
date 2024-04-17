package week10;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Week10Demo {
	public static void main(String[] args) {
		ArrayList<String[]> timecardData= loadDataFromFile("Student Assignment Scores.csv");	
		
		printTimeCardReport(timecardData);
		
		System.out.println();
		
		printDaysMissedReport(timecardData);
	}
	
	
	public static void printDaysMissedReport(ArrayList<String[]> timecardData) {
		System.out.println("****** Day Missed Report ******");
		System.out.printf("%-30s Day%n", "Employee name");
		
		for(String[] employee:timecardData) {
			for(int i = 2; i < employee.length; i++) {
				if(employee[i].equals("0.0")) {
					System.out.printf("%-30s Day%n", employee[0], i);
				}
			}
		}
	}
	
	public static void printTimeCardReport(ArrayList<String[]> timecardData) {
		System.out.println("****** Timecard Report ******");
		System.out.printf("%-30s%8s%7s%7s%7s%7s%7s%7s%7s%10s%n", "Employee name", "Pay rate", "Day 1","Day 2","Day 3","Day 4","Day 5","Day 6","Day 7", "Total pay");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		for(String[] hoursWorked:timecardData) {
			
			double totalRate = Double.parseDouble(hoursWorked[1]);
			double totalHours = 0.0;
			
			for(int i = 2; i < hoursWorked.length; i++) {
				totalHours += Double.parseDouble(hoursWorked[i]);
			}
			
			double totalPay = totalRate * totalHours;
			
			System.out.printf("%-30s%8s%7s%7s%7s%7s%7s%7s%7s%10.2f%n", hoursWorked[0], hoursWorked[1], hoursWorked[2],hoursWorked[3],hoursWorked[4],hoursWorked[5],hoursWorked[6],hoursWorked[7],hoursWorked[8], totalPay);
		}
	}
	
	public static ArrayList<String[]> loadDataFromFile(String name){
		Scanner in = null;
		ArrayList<String[]> data = new ArrayList<String[]>();
		try {
			
			in = new Scanner(new File("Student Assignment Scores.csv"));

			// SKip the header line
			in.nextLine();

			while(in.hasNextLine()) {
				String[] hoursWorked  = in.nextLine().split(",");
				data.add(hoursWorked);

			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(in != null) {
				in.close();
			}
		}
		return data;
	}
	

}



