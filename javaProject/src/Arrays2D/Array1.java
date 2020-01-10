package Arrays2D;

import java.util.Scanner;

public class Array1
{public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("eneter the Size of Matrix");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] arr=new int[m][n];
    System.out.println("enter the Matrix Elements:");
    for(int i=0;i<m;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    	
    	arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("the Matrix is:");
  for(int i=0;i<m;i++)
  {
	  for(int j=0;j<n;j++)
	  {  //print only the 
		 // if(i==j)
		  System.out.print(arr[i][j]+" ");
	  }
	  System.out.println();
  }//end of the loop

}

}
