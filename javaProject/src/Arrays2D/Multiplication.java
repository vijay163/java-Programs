package Arrays2D;

import java.util.Scanner;

public class Multiplication
{
	public static int[][] matrixMult(int a[][],int b[][])
	{
		if(a[0].length!=b.length)
			return null;
		int[][] c=new int[a.length][b[0].length];
		//a*b
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				int sum=0;
				for(int k=0;k<a[0].length;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
		return c;
	}
	public static int[][] readMatrix()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Matrix :");
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		int[][] a=new int[m1][n1];
		System.out.println("Enter the Elements into the matrix:");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
		
	}
	public static void printMartix(int[][] c)
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
	public static void main(String[] args) 
	{
		int[][] a=readMatrix();
		int[][] b=readMatrix();
		int[][] c=matrixMult(a, b);
		if(c==null)
		{
			System.out.println("invalid Order");
			System.out.println("Colum of matrix A is Matches with Rows of B");
		}
		else
		{
			System.out.println("***Product Matrix is****");
			printMartix(c);
			
		}
	}
}

