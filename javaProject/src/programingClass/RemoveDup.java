package programingClass;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDup 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   System.out.println("Entere a String");
	  String str = sc.nextLine();
	  char[] a=str.toCharArray();
	  char[] a2=new char[a.length];
	//  HashSet s=new HashSet<>();
	a2[0]=a[0];
	int k=1;
	  for(int i=0;i<a.length;i++)
	  {
		  int j;
		  for( j=0;j<k;j++)
		  {
			  if(a[i]==a2[j])
			  {
				  break;
			  }
		  }
		  if(j==k)
		  {
			  a2[k++]=a[i];
			  
		  }
	  }
	  String str2=new String(a2);
	System.out.println(str2);

	
	}

}
