package programingClass;

import java.util.Scanner;

public class ConvertSentence
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String ");
	    String s = sc.nextLine();
	     String reversed = reverse(s);
	     System.out.println(reversed);
	}
	static String reverse(String s)
	{
		if(s.isEmpty())
		{
			return "";
			
		}
		return reverse(s.substring(1))+s.substring(0,1);
		

}
}