package Practice1;

import java.util.Scanner;

public class CountStringOfWords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String s = sc.nextLine();
		int alpha_bit_count=0;
		int number_count=0;
	   for(int j=0;j<s.length();j++)
	   {
		  char ch = s.charAt(j);
		   if(ch<='a'&&ch>='z'||ch<='A'&&ch>='Z')
		   {
			   System.out.println("char");
			   alpha_bit_count=alpha_bit_count++;
		   }
		   else if(ch<='0'&&ch>='9')
		   {
			  // number_count=number_count++;
			   System.out.println("number");
		   }
	   }
	   System.out.println(s.length());
	   System.out.println("NUmber of alphabits are::"+alpha_bit_count);
	   System.out.println("Number of numerics are::"+number_count);
	   
	
	}

}
