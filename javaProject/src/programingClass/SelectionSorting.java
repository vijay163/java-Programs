package programingClass;

import java.util.Scanner;

public class SelectionSorting
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the array");
	int num = sc.nextInt();
	int[] a=new int[num];
	System.out.println("enter the values into the array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		int min_position=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[min_position]>a[j])
			{
				min_position=j;
			}
		}
		if(min_position!=0)
		{
			int temp=a[i];
			a[i]=a[min_position];
			a[min_position]=temp;
		}
	}
	System.out.println("sorted array");
	for(int l:a)
	{
		System.out.println(l);
	}
	}

}
