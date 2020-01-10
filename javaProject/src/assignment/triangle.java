package assignment;

import java.util.Scanner;

public class triangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("**enter the size of angle 'A'");
        int a = sc.nextInt();
        System.out.println("**enter the size of angle  'B'");
        int b = sc.nextInt();
        System.out.println("**enter the size of angle  'C'");
        int c = sc.nextInt();


        if(a==b && b==c)
        {
            System.out.println("Equilateral");
        }
        else if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
        {
            System.out.println("Not a triangle");
        }
        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
        {
            System.out.println("Isosceles");
        }
        else if(a!=b && b!=c && c!=a)
        {
            System.out.println("Scalene");
        }
  } 
}
