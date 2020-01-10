package Arrays;

import java.util.Scanner;

public class EvenORodd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the numbers into array");
		arr[i]=sc.nextInt();
	}
	int c=evenOdd(arr);
	System.out.println("even number"+c);
	System.out.println("odd number "+(c-n));
}
static int evenOdd(int arr[])
{

	int c=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			c++;
		
		}
		
	}
	return c;
}
}
