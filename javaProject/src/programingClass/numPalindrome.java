package programingClass;

import java.util.Scanner;

public class numPalindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		int num = sc.nextInt();
		int sum=0;
		int temp=num;
		for(int i=0;i<num;i++)
		{
			int a = num%10;
			sum=(sum*10)+a;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("**Entered number is palindrome***"+sum);
		}
		else
		{
			System.err.println("Entered number is a not palindrome***"+temp);
		}
	}

}
