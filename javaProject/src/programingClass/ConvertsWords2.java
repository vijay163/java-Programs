package programingClass;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConvertsWords2 
{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
		// String str2[]=str.split(" ");
		String[] str2=str.split(" ");
		List<String> ls = Arrays.asList(str2);
		//List<String> ls = Arrays.asList(str.split(str));
		 System.out.println(ls);
	}

}
