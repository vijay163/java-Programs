package assignment;

import java.util.Scanner;

public class CheckChar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("entere the character");
	     char c = sc.next().charAt(0);
	    if(c>='0'&&c<='9')
	    {
	    	System.out.println("entered character is a number :"+c);
	    }
	    else if(c>='a'&&c<='z'||c>='A'&&c<='Z')
	    {
	    	System.out.println("entered character is a alphabet:"+c);
	    }
	    else {
	    	System.out.println("entered character is a speacial key words:"+c);
	    }
	
	}

}
