package assignment;

import java.util.Scanner;

public class totalPrime 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
	    for(int i=1;i<num;i++)
	    {
	    	boolean isPrime=true;
	    	for(int j=2;j<i;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			
	    			isPrime=false;
	    			break;
	    		}
	   
	    	}
	    	if(isPrime)
	    	{
	    		System.out.print(" "+i);
	    	}
	  
	    }
	}

}
