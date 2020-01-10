package assignment;

import java.util.Scanner;

public class naturalNumbers 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		naturalNumber(num);
	}
	public static int naturalNumber(int num)
	{
		for(int i=1;i<num;i++)
		{
			System.out.println(i+" ");
		}
		return num;
	}
	}


