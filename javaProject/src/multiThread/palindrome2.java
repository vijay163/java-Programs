package multiThread;

import java.util.Scanner;

public class palindrome2 {
public static void main(String[] args) {
	int r,sum = 0,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the find number is palindrome");
	int num=sc.nextInt();
	temp=num;
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		/*System.out.println("sum value==="+sum);
		System.out.println("**********************************");
		System.err.println("num value===="+num);
	*/
		}
	if(temp==sum)
	{
		System.out.println("*number is palidrome");
	}
	else
	{
		System.out.println("number is a not palindrome");
	}
	
}
}
