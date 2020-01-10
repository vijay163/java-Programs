package assignment;

import java.util.Scanner;

public class EvenODD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("***enter the number*****");
	     int num = sc.nextInt();
	     if(num%2==0)
	     {
	    	 System.out.println("number is only even");
	    	 if(num%3==0)
	    	 {
	    		 System.out.println("entered number is even and multiple by 3====="+num);
	    		 
	    	 }
	    	 else
	    	 {
	    		 System.err.println("number is even but not divisible by 3");
	    	 }
	     }
	     else if(num%2!=0)
	     {
	    	 System.out.println("enter number is even ");
	    	 if(num%5==0)
	    	 {
	    		 System.out.println("entered number is odd and divisible 5====="+num);
	    	 }
	    	 else
	    	 {
	    	 System.err.println("number is odd but not divisible by 5");
	        }
	     }
	
	}

}
