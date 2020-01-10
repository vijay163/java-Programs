/*package programingClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortWords2 implements Comparable
{
	public static Object[] toArrayOfWords(String s)
	{
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			String str=" ";
			int start=i;
			while(i<s.length()&&s.charAt(i)!=' ')
			{
				i++;
			}
			int end=i-1;
			if(start<=end)
			{
				for(int j=start;j<=end;j++)
				{
					str=str+s.charAt(j);
				}
				al.add(str);
			}
			
		}
		String[] arr=(String[]) al.toArray();
		return arr;
	}
	public static Object[] toSortWordsArray(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			int min_pos=i;
			for(int j=i+1;j<s.length();j++)
			{
				if(s[min_pos]).compareTo(s[j])>0)
				{
					min_pos=j;
				}
			}
			if(min_pos!=i)
			{
				String temp=s[i];
				s[i]=s[min_pos];
                                                                   s[min_pos]=temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String");
	    String str = sc.nextLine().toLowerCase();
	    ArrayList<String> ls = toArrayOfWords(str);
	   Collections.sort(ls);
	   System.out.println("After Sorting the Words");
	   for(String i:ls)
	   {
		   System.out.println(i);
	   }
	}
	
}
*/