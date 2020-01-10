package programingClass;

import java.util.Scanner;

public class StringCombinations 
{
	public static int factorial(int n)
	{
		int result=1;
		for(int i=1;i<=n;i++)
		{
			result=result*i;
		}
		return result;
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the String");
	      String str = sc.nextLine();
	      int n = str.length();
	      int l = factorial(n);
	      System.out.println(l);
	
	
	
	}

}
