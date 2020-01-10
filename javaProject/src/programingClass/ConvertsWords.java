package programingClass;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertsWords 
{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		 String str2[]=str.split(" ");
		 ArrayList ls=new ArrayList();
		 for(String i:str2)
		 {
			 ls.add(i);
		 }
		 System.out.println(ls);
	}

}
