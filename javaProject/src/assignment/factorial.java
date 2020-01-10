package assignment;

import java.util.Scanner;

public class factorial 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the number ");
	    int num = sc.nextInt();
	    int result=factorial(num);
	    System.out.println("factorial of the the"+num+"is"+result);
	}
	public static int factorial(int num)
	{
		int result=1;
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
		return result;
	}
	
	}


