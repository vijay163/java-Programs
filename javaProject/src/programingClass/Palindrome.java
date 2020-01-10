package programingClass;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine().toLowerCase();
	   int length=str.length();
	   String rev="";
	   for(int i=length-1;i>=0;i--)
	   {
		   rev=rev+str.charAt(i);
	   }
	   if(str.equals(rev))
	   {
		   System.out.println("**its a Palindrome@@@"+rev);
	   }
	   else
	   {
		   System.out.println("*its not a palindrome*"+str);
	   }
	}

}
