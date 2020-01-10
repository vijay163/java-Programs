package Arrays;

import java.util.Scanner;

public class Average 
{
/*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter the  value in to array ");
   int n=sc.nextInt();
   double arr[]=new double[n];
   for(int i=0;i<n;i++)
   {
	   arr[i]=sc.nextDouble();
   }
   average(arr);
}
    static void average(double arr[])
   {
  double sum=0;
   for(int i=0;i<=arr.length;i++)
   {
	  sum=sum+arr[i]; 
   }
   System.out.println(sum/arr.length);
   }

}
*/ 
		 
	 	public static void main(String[] args)  
	 	{ 
	 	 	Scanner sc= new Scanner(System.in); 
	 	 	System.out.println("Enter the number of elements"); 
	 	 	int n = sc.nextInt();  	 
	 	 	double arr[]=new double[n]; 
	 	 	for(int i=0;i<n;i++) 
	 	 	{ 
	 	 	 	arr[i]=sc.nextDouble(); 
	 	 	} 
	 	 	average(arr); 
	 	} 
	 	public static void average(double arr[]) 
	{ 
	 		double sum=0; 
	for(int i=0;i<arr.length;i++) 
	{ 
		 	sum=sum+arr[i]; 
	} 
	System.out.println(sum/arr.length); 
	} 
	}  
