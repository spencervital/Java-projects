package week11;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String choice;
		boolean done = false;
		
		do {
			System.out.println("This program will show the name of an apostle based on the order they were called, with the Prophet as #1");
			System.out.println();
			System.out.println("Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): ");
			choice = in.nextLine();
		
			 if(choice.equals("")) { 
				 break;
			}
			 
			switch(choice) {
			case "1":
				System.out.println("Number 1 is: President Russell M. Nelson\n");
				break;
			case "2":
				System.out.println("Number 2 is: President Dallin H. Oaks\n");
				break;
			case "3":
				System.out.println("Number 3 is: Elder M. Russell Ballard\n");
				break;
			case "4":
				System.out.println("Number 4 is: Elder Jeffrey R. Holland\n");
				break;
			case "5":
				System.out.println("Number 5 is: President Henry B. Eyring\n");
				break;
			case "6":
				System.out.println("Number 6 is: Elder Dieter F. Uchtdorf\n");
				break;
			case "7":
				System.out.println("Number 7 is: Elder David A. Bednar\n");
				break;
			case "8":
				System.out.println("Number 8 is: Elder Quentin L. Cook\n");
				break;
			case "9":
				System.out.println("Number 9 is: Elder D. Todd Christofferson\n");
				break;
			case "10":
				System.out.println("Number 10 is: Elder Neil L. Andersen\n");
				break;
			case "11":
				System.out.println("Number 11 is: Elder Ronald A. Rasband\n");
				break;
			case "12":
				System.out.println("Number 12 is: Elder Gary E. Stevenson\n");
				break;
			case "13":
				System.out.println("Number 13 is: Elder Dale G. Renlund\n");
				break;
			case "14":
				System.out.println("Number 14 is: Elder Gerrit W. Gong\n");
				break;
			case "15":
				System.out.println("Number 15 is: Elder Ulisses Soares\n");
				break;
				default:
					System.out.println("That's not a valid choice. Try again.\n");
			}
			
		}while(!done);
		
		System.out.println("BYE !");
	}

}
