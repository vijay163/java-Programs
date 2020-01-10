package assignment;

import java.util.Scanner;

public class leapYear 
{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the yaer ");
	  int year=sc.nextInt();
	  if((year%4==0&&year%100!=0)||(year%400==0))
	  {
		  System.out.println("entered year is leap year"+year);
	  }
	  else
	  {
		  System.out.println("entered year is not leap year "+year);
	  }
   

}
}
