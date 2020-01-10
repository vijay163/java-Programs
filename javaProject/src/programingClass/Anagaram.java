package programingClass;

import java.util.Arrays;
import java.util.Scanner;

public class Anagaram 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String str1 = sc.nextLine();
		System.out.println("Enter the string2");
		String str2=sc.nextLine();
	//	str1=removeSpace(str1);
		//str2=removeSpace(str2);
		if(str1.length()!=str2.length())
		{
			System.out.println("entered String is not equal");
			System.exit(0);
		}
		else
		{
			char[] s1=str1.toCharArray();
			char[] s2=str2.toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			int i;
			for( i=0;i<str1.length();i++)
			{
				if(s1[i]!=s2[i])
				{
				break;	
				}
				}
			if(i==s1.length)
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("string is Not anagram");
			}
		}
	
	}

		
/*		public static String removeSpace(String s)
		{
			String s="";
			for(int i=0;i<s1.length();i++)
			{
			if(s1.charAt(i)!=i)
			{
				s=s1+s.charAt(i);
			}
		
		}
			return s;
		}
*/
}
