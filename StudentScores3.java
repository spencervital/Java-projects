package week10;

import java.io.File;
import java.util.Scanner;

public class StudentScores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		System.out.printf("%-30s%8s", "Student", "Assignment with 0");
		System.out.println();
		System.out.println("------------------------------------------------");
		try {
			in = new Scanner(new File("Student Assignment Scores.csv"));

			in.nextLine();

			while(in.hasNext()) {
				String[] studentData = in.nextLine().split(",");
				for(int i = 0; i < studentData.length; i++) {
					if (studentData[i].equals("0")) {
						System.out.printf("%-30s%8s", studentData[0], i);
						System.out.println();
					}
				}

			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
