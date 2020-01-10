package multiThread;

public class rectAngleStars {
	public static void main(String[] args) {
		int i,j,n=8;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j==n-i+1||i==j+1||i==5||j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
