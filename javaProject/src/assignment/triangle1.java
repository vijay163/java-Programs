package assignment;

import java.util.Scanner;

public class triangle1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the angle of 'A'");
	int a = sc.nextInt();
	System.out.println("enter the angle of 'B'");
    int b = sc.nextInt();
    System.out.println("enter the angle of 'C'");
   int c = sc.nextInt();
   if(a==b&&b==c)
   {
	   System.out.println("its a equalent trianle=="+"A size:"+a+",B size:"+b+",C size:"+c);
   }
   else
   {
	   System.out.println("its not a equalent triangle==="+"A size:"+a+",B size:"+b+",C size:"+c);
   }
}
}
