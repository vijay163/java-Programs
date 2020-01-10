package Pattrens;

public class TriangleReverseNum
{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			int k=5;
			for(int j=n-1;j>=0;j--)
			{
				if(i+j>=n-1)
				{
					System.out.print(" ");
				}
				else
					System.out.print(k-- +" ");
			}
			System.out.println();
		}
	}

}
