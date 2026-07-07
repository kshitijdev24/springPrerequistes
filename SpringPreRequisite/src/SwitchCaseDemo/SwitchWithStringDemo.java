package SwitchCaseDemo;

import java.util.Scanner;

public class SwitchWithStringDemo {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter the day of the week");
			String day= sc.nextLine();
			
			switch(day.toLowerCase()) {
			case "monday":
				System.out.println("Start of the week!");
				break;
			
	        case "tuesday":
		        System.out.println("2nd of the week!");
		        break;
	
            case "wednesday":
	            System.out.println("mid of the week!");
	            break;

            case "thursday":
	            System.out.println("2nd mid of the week!");
	            break;

            case "friday":
	            System.out.println("5th day of the week!");
	            break;

            case "saturday":
	           System.out.println("weekend day1!");
	           break;

            case "sunday":
	           System.out.println(" weekend day2!");
	           break;

            default:
	           System.out.println("Not a valid day");
	
			
			
			
		}
			sc.close();

	}
	}


