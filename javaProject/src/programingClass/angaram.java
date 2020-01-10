package programingClass;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.SortOrder;

public class angaram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String1");
		String str1 = sc.nextLine();
		System.out.println("enter the 2nd String");
		  String str2 = sc.nextLine();
		  str1=str1.replaceAll("\\s","").toLowerCase();
		  str2=str2.replaceAll("\\s","").toLowerCase();
		  if(str1.length()!=str2.length())
		  {
			 System.out.println("entered string are both are different");
			 System.exit(0);
		  }
		  char[] s1=str1.toCharArray();
		  char[] s2=str2.toCharArray();
		  Arrays.sort(s1);
		  Arrays.sort(s2);
		  if(Arrays.equals(s1,s2))
		  {
			  System.out.println("Entered String is Anagram");
		  }
		  else
		  {
			  System.out.println("its not a Anagram");
		  }
		  
	}

}
