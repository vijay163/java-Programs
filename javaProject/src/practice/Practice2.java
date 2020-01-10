package practice;

import java.util.Scanner;

public class Practice2 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String into the method to Check ::::");
		String str = sc.nextLine();
		int len = str.length();
		String r="";
		for(int i=len-1;i>=0;i--)
		{
			r=r+str.charAt(i);
		}
		if(str.equals(r))
		{
			System.out.println("Enter The String palindrome::::"+r);
		}
		else
			System.out.println("its not a Palindrome::::");
	}

}
