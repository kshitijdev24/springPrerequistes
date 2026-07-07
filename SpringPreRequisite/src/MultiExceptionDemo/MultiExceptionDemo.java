package MultiExceptionDemo;

import java.util.Scanner;

public class MultiExceptionDemo {
      public static void main(String[]args) {
    	  try(Scanner sc= new Scanner(System.in)){
    		  System.out.println("Enter a number:");
    		  int num=sc.nextInt();
    		  
    		  int result=100/num; // may throw ArithmeticException
    		  System.out.println("Result"+result);
    		  
    		  String text=null;
    		  System.out.println(text.length());
    		  
    	  }
    	  catch(ArithmeticException | NullPointerException e) {
    		  System.out.println("Exception caught:"+e);
    	  }
    	  System.out.println("Program continues....");
      }
}
