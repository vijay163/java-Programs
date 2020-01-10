package Pattrens;

public class ReverseString
{
	public static void main(String[] args) {
		String str="java";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
					System.out.print(str.charAt(j)+" ");
				else
					System.out.print(str.charAt(n-j-1)+" ");
			}
			System.out.println();
		}
	}

}
