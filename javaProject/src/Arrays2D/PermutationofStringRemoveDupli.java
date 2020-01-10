
package Arrays2D;

import java.util.HashSet;
import java.util.Scanner;

public class PermutationofStringRemoveDupli
{
	static HashSet<String> str=new HashSet<>();
	public static void StringArr(String str1,String str2)
	{
		if(str1.length()==0)
		{
			//System.out.println(str2+" ");
			str.add(str2);
			return ;
		}
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			String str3 = str1.substring(0, i)+str1.substring(i+1);
			StringArr(str3, str2+ch);
		
		}
	}
	public static int factorial(int num)
	{
		int result=1;
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		StringArr(s,"");
		int num = s.length();
		int l = factorial(num);
		System.out.println("total Number of permutations");
		System.out.println(l);
		System.out.println(str);
		
   }

}

