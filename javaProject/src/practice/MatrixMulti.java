package practice;

import java.util.Scanner;

public class MatrixMulti
{
	public static void main(String[] args)
	{
		int[][] a = readMatrix();
		int[][] b = readMatrix();
		int[][] c = multiPlication(a, b);
		if(c==null)
		{
			System.out.println("Invalid Order of Matrix:");
			System.out.println("Enter the matrix a row and B's coulmn should be equal");
		}
		else
		{
			System.out.println("The Product Matrix is");
			printMatrix(c);
		}
		
		
	}
	public static int[][] readMatrix()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Matrix Size: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		System.out.println("Enter the Elements into Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
		
	}
	public static int[][] multiPlication(int[][] a,int[][] b)
	{
		if(a[0].length!=b.length)
		{
		 return null;
		}
		int[][] c = new int[a.length][b[0].length];
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
	public static void printMatrix(int[][] c)
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
