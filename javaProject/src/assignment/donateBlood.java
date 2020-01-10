package assignment;

import java.util.Scanner;

public class donateBlood
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
 System.out.println("*enter the age of the person*");
int age = sc.nextInt();
if(age>21)
{
	System.err.println("**enter weight of the person******");
	int weight = sc.nextInt();
	if(weight>=50)
	{
		System.out.println("*he is eligible for donate blood*");
		
	}
	else
	{
	System.out.println("*his wieght is not enough for give blood*");	
	}
}else
{
System.out.println("**********his age is less than 21****");	
}


}
}
