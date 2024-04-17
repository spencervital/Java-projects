package week10;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		ArrayList<String[]> classRoster =  new ArrayList<String[]>();

		try {
			in = new Scanner(new File("Student Test Grades.csv"));

			in.nextLine();
			System.out.println("------------------------------------------------------");
			System.out.printf("%-24s%-8s%-8s%-8s", "Student", "Test 1", "Test 2", "Test 3");
			System.out.println();
			System.out.println("------------------------------------------------------");
			while(in.hasNextLine()) {
				String[] classStudent = in.nextLine().split(",");
				classRoster.add(classStudent);

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		in.close();
		String[][] studentGrades = {{"94", "A"}, {"90", "A-"}, {"87", "B+"}, {"84", "B"}, {"80", "B-"},
				{"77", "C+"}, {"74", "C"}, {"70", "C-"}, {"67", "D+"}, {"64", "D"}, {"60", "D-"}};

		for(int j=0; j<classRoster.size();j++) {
			String[] student = classRoster.get(j);
			
			int test1 = Integer.parseInt(student[1]);
			int test2 = Integer.parseInt(student[2]);
			int test3 = Integer.parseInt(student[3]);
			
			String grade1 = "", grade2 = "", grade3 = "";
			
			for(int i = 0; i < studentGrades.length;i++ ) {
				int data = Integer.parseInt(studentGrades[i][0]);
				
				if(test1 > data && grade1.isEmpty())
					grade1 = studentGrades[i][1];
				
				if(test2 > data && grade2.isEmpty())
					grade2 = studentGrades[i][1];
				
				if(test3 > data && grade3.isEmpty())
					grade3 = studentGrades[i][1];
			
			}
			
			if(grade1.isEmpty())
				grade1 = "E";
			if(grade2.isEmpty())
				grade2 = "E";
			if(grade3.isEmpty())
				grade3 = "E";

			System.out.printf("%-24s%-8s%-8s%-8s",student[0], grade1, grade2, grade3);
			System.out.println();

		}



	}

}
