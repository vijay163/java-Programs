package multiThread;

import java.util.Scanner;

public class marks {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("marks in social subject");
    double m1 = sc.nextDouble();
    System.out.println("marks in science ");
    double m2 = sc.nextDouble();
    System.out.println("marks in maths");
    double m3 = sc.nextDouble();
    System.out.println("marks in computers");
    double m4 = sc.nextDouble();
    
    if(m1<35||m2<35||m3<35||m4<35)
     {
    	 System.out.println("his a good student  fail all");
     
     }
    else   if(m1>35||m2>35||m3>35||m4>35)
    {
    		double per = (m1+m2+m3+m4)/400*100;
    		if(per>80)
    		{
    			System.out.println("he got distinction");
    		}
    		else if(per>60)
    		{
    			System.out.println("he got only first class only");
    		}
    		else if(per<40)
    		{
    			System.out.println("ordinary pass");
    		}
    				
    	}
     

}
}

