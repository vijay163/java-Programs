//design a method which accept a matrix and it returns tranpose of matrix
package Arrays2D;

import java.util.Scanner;

public class array3 
{
	public static int[][] transPoseMatrix(int[][] a)
	{
		int[][] b=new int[a[0].length][a.length];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
				return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix size");
		int m = sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		System.out.println("Enter the "  +(m*n)+  "elements");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the Matrix is original Position is:");
		  for(int i=0;i<m;i++)
		  {
			  for(int j=0;j<n;j++)
			  {  
				  System.out.print(arr[i][j]+" ");
			  }
			  System.out.println();

	      }
		  System.out.println("******************************************");
		  int[][] b= transPoseMatrix(arr);
		  System.out.println("after Transpose the Matrix");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			
 
		  
		 
		  
	
}
}