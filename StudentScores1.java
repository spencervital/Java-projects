package week10;

import java.io.File;
import java.util.Scanner;

public class StudentScores1 {
	public static void main(String[] args) {
		Scanner in = null;
		
		try {
			in = new Scanner(new File("Student Assignment Scores.csv"));
			
			while(in.hasNext()) {
				System.out.println();
				System.out.println(in.nextLine());
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
