package week10;

import java.io.File;
import java.util.Scanner;

public class StudentScores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		System.out.printf("%-30s%8s%7s%7s%7s%7s%7s", "Student", "Asn 1", "Asn 2","Asn 3","Asn 4","Asn 5","Asn 6");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		try {
			in = new Scanner(new File("Student Assignment Scores.csv"));

			in.nextLine();
			
			while(in.hasNext()) {
				System.out.println();
				String[] studentData = in.nextLine().split(",");
				System.out.printf("%-30s%8s%7s%7s%7s%7s%7s", studentData[0], studentData[1], studentData[2],studentData[3],studentData[4],studentData[5],studentData[6]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
