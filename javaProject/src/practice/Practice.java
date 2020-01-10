package practice;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Checking number:");
		int num = sc.nextInt();
		int r,sum=0,temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			System.out.println("number is:"+num);
			System.out.println("sum is:::"+sum);
		}
		if(temp==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("its not a palindrome");
		}
	}

}
