package multiThread;

import java.util.Scanner;

public class palindrome {                                
//private static Object str;

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String");
	 String str = sc.next();
	int len = str.length();
	String r = "";
	for(int i=len-1;i>=0;i--)
	{
		
		 r = r+str.charAt(i);
		//System.out.println("*  r value"+r);
		//System.out.println("****str value****"+str);
	}

	if(str.equals(r))
	{
		System.out.println("entered string is palindrome");
	}
	else 
	{
		System.out.println("not a palindrome");
	}
	
}
}
