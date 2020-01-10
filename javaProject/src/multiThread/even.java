package multiThread;

import java.util.Scanner;

public class even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("range of the array");
	    int range = sc.nextInt();
	    System.out.println("no.of even no");
	    int even=sc.nextInt();
	    int count = 0;
	    for(int i=0;i<range;i++)
	    {
	    	if(i%2==0)
	    	{
	    	count++;
	    	System.out.println("**total of the even numbers==="+count);
	    	System.out.println(i);
	    	}
	    }
	
	
	
	
	}

}
