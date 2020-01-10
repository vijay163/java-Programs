package Pattrens;

public class ReversePrint1
{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{    int k=1;
		     int l=5;
			for(int j=0;j<n;j++)
			{
				if(j==4)
					System.out.print(" "+k++ );
				else if(i==n-1||i+j>3)
					System.out.print(l-- +" ");
				else
					System.out.print("  ");
			
			}
			System.out.println();
		}
	}

}
