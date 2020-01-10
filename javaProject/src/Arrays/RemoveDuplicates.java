package Arrays;

import java.util.Scanner;

public class RemoveDuplicates 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter size of the array");
    int size = sc.nextInt();
    int a[]=new int[size];
    int b[]=new int[a.length];
    System.out.println("enter the numbers into arrays");
    for(int i=0;i<a.length;i++)
    {
    	
    	 a[i]=sc.nextInt();
    }
    b[0]=a[0];
    int k=1;
    int i,j = 0;
    for( i=1;i<a.length;i++)
    {
    	for(j=0;j<i;j++)
    	{
    	if(a[i]==b[j])
    	{
    		break;
    		
    	}
      }
    if(i==j)
    {
    	b[k++]=a[i];
    }
   }
    a=b;
    System.out.println("after removing duplicates");
    for(i=0;i<k;i++)
    {
    	System.out.println(a[i]);
    }
  }


}
