package assignment;

import java.util.Scanner;

public class winnerORlooser {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter person winner or looser");
	String man = sc.next();
	String r="winner";
	
	if(man.equals(r))
	{
	 System.out.println("his son score in exame more than 75");
	}
	else
	{
		System.out.println("both son and fathers are loosers");
	}
}
}
