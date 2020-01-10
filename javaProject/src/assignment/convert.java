package assignment;

import java.util.Scanner;

public class convert 
{
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the character");
	char[] c = sc.next().toCharArray();
	System.out.println("before Converting");
	System.out.println(c);
	for(int i=0;i<c.length;i++)
	{
	if(c[i]>='A'&&c[i]<='Z')
	{
	c[i]=(char)(c[i]+32);	
	}
	else if(c[i]>='a'&&c[i]<='z')
	{
	c[i]=(char)(c[i]-32);	
	}
	else if(c[i]>='0'&&c[i]<='9')
	{
	c[i]=(char) (c[i]+10);	
	}
	}
	System.out.println("after Converting");
	System.out.println(c);
}
}
