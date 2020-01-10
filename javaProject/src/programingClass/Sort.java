package programingClass;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Character");
		String str = sc.nextLine();
		char[] s1=str.toCharArray();
		 Arrays.sort(s1);
		 System.out.println(s1);
	}
}
