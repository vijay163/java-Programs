package Pattrens;

public class Pattren4 
{
	public static void main(String[] args) {
		int i,j,n=6;
		int k=1;
		for(i=0;i<=n;i++)
		{

			for(j=0;j<i;j++)
			{
            System.out.print(" ");
			}
			for(j=1;j<n-i+1;j++)
			{
				if(j%2==0)
				{
					System.out.print(k++ +"");
				
				}
				else
				System.out.print("*");
			}
		System.out.println();
		}
	
}
}
