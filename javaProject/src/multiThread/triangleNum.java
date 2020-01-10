package multiThread;

public class triangleNum {
public static void main(String[] args) {
	int i,j,n=8,k;
	for(i=1;i<=n;i++)
	{
		k=i;
		for(j=1;j<=i;j++)
		{
			System.out.print(k+" ");
			k=k+n-j;
		}
		System.out.println();
	}

}
}
