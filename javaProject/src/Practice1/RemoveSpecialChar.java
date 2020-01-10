package Practice1;

import java.util.Scanner;

public class RemoveSpecialChar
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:::");
		String s = sc.nextLine();
		String special="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(!(ch<='a'&&ch>='z')||(ch<='A'&&ch>='Z')||(ch<='0'&&ch>='9'))
			
				continue;
			
			else
				special=special+ch;
		}
		System.out.println(special);
	}

}
