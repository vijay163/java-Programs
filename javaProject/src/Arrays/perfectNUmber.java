package Arrays;

import java.util.Scanner;

public class perfectNUmber 
{
 public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	int arr[]=readArray();

	int count =countPerfect(arr);
	System.out.println("total perfect numbers in array is***"+count);
  }

static int[] readArray()
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the size  of   the array");
	  int num = sc.nextInt();
	  int arr[]=new int[num];
	  System.out.println("enter the numbers of elemets into the array");
      for(int i=0;i<num;i++)
      {
    	  arr[i]= sc.nextInt();
      }
      return arr;
  }
  static int countPerfect(int arr[])
  {
	  int count=0;
	  for(int i=0;i<arr.length;i++)
	  {
	  if(isPerfect(arr[i]))
	  {
		  count++;
	  }
	  }
	  return count;
  }
  static boolean isPerfect(int number)
  {
	  int sum=0;
	  for(int i=1;i<number-1;i++)
	  {
		  if(number%i==0)
		  {
			  sum=sum+i;
		  }
		  if(sum==number)
		  {
			  return true;
		  }

	  }
	return false;
  }
	}
