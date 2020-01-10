package assignment;

import java.util.Scanner;

public class Fiboncci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	  System.out.println("enter the number for find series");
	  int num = sc.nextInt();
	  printFib(num);
	}
	static void printFib(int num)
	{
		int a=0,b=1,c=1;
		if(num==1)
		{
			System.out.println("enter the number more than one ");
		}
		else if(num==0)
		{
			System.out.println("wrong input");
		}
		else
		System.out.println("Series of the numbers are:"+a);
	  while(c<num)
	  {
		  System.out.println(c);
	    c=a+b;
	    a=b;
	    b=c;
	   
	  }
	}
	}


