package Arrays2D;

import java.util.Scanner;

public class Rotation 
{
	public static void rotationOfMatrix(int[][] a)
	{
		
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[0].length-i-1;j++)
			{
				int temp=a[i][j];
				a[i][j]=a[a.length-1-i][a.length-1-j];
				a[a.length-1-i][a.length-1-j]=a[j][a.length-1-i];
				a[j][a.length-1-i]=temp;
			}
		}
	}
	public static void printMatrix(int[][] c)
	{
		for(int i=0;i<c.length;i++)
		  {
			  for(int j=0;j<c[0].length;j++)
			  {  //print only the 
				 // if(i==j)
				  System.out.print(c[i][j]+" ");
			  }
			  System.out.println();
		  }//end of the loop

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the matrix size:");
	   int m1 = sc.nextInt();
	   int n1 = sc.nextInt();
	   int[][] a=new int[m1][n1];
	   System.out.println("Enter the Elements");
	   for(int i=0;i<m1;i++)
	   {
		   for(int j=0;j<n1;j++)
		   {
			   a[i][j]=sc.nextInt();
		   }
	   }
	   System.out.println("Original Matix Is");
	   printMatrix(a);
	   rotationOfMatrix(a);
	   System.out.println("After Rotating The Matrix");
	  printMatrix(a);
	
	
	
	}

}
