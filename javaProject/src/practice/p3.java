package practice;

public class p3 {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++)
	{
		int k=5;
		for(int j=n-1;j>=0;j--)
		{
			if(i+j>4&&i+j!=3)
			{
				System.out.print("* ");
			}
			

		}
		System.out.println();
	}
}
}
