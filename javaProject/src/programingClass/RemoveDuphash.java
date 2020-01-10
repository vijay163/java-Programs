package programingClass;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuphash 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String into array");
		String str = sc.nextLine();
	     char[] ch = str.toCharArray();
	     HashSet hs = new HashSet();
	     for(int i=1;i<ch.length;i++)
	     {
	    	 hs.add(ch[i]);
	     }
	System.out.println(hs);
	System.out.println(str.length()-hs.size());
	}

}
