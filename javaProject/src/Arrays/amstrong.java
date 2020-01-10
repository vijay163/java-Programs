package Arrays;

import java.util.Scanner;

public class amstrong 
{
	public static void main(String[] args) {
		int count=0,reminder,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for checking amstrong");
		int num = sc.nextInt();
	     temp=num;
	     while(num>0)
	     {
	    	reminder=num%10;
	    	num=num/10;
	    	count=count+(reminder*reminder*reminder);
	    	
	     }
	     if(temp==count)
	     {
	    	 System.out.println("entered number is armstrong:"+temp);
	     }
	     else
	     {
	    	 System.out.println("entered number is not a armstrong:"+temp);
	     }
	
	}

}
