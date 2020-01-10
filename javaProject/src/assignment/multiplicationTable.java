package assignment;

import java.util.Scanner;

public class multiplicationTable 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=20;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}

}
