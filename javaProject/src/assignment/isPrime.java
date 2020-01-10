package assignment;

import java.util.Scanner;

public class isPrime 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the final number for finding");
	    int num = sc.nextInt();
	    boolean isPrime=true;
	    for(int i=1;i<num/2;i++)
	    {
	    	if(i%2==0)
	    	{
	    		isPrime=false;
	    		break;
	    	}
	    }
	    if(isPrime)
	    {
	    	System.out.println("entered nmber is a prime"+num);
	    }
	    else
	    {
	    	System.out.println("entered number is not prime number"+num);
	    }
	}

}
