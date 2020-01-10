package Pattrens;

public class Pattren3 
{
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
			int k=4;
			for(int j=0;j<n;j++)
			{
				if(i+j<=n-1)
				{
					System.out.print(k-- +" ");
				}
			}
			System.out.println();
		}
	}

}
