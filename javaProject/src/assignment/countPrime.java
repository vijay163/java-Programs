package assignment;

import java.util.Scanner;

public class countPrime 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
	    for(int i=1;i<num;i++)
	    {
	    	int count=1;
	    	for(int j=2;j<i;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			
	    			count=0;
	    			break;
	    		}
	   
	    	}
	    	if(count==1)
	    	{
	    		System.out.print(" "+i);
	    	}
	  

}
	}
}