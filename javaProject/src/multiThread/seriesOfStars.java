package multiThread;

public class seriesOfStars {
	public static void main(String[] args) {
		int i,j,n=7,k=1,s=n/2,l=1;
 for(i=1;i<=n;i++)
 {
	 for(j=1;j<=s;j++)
	 {
		 System.out.print(" ");
	 }
	 l=1;
	 for(j=1;j<=k;j++)
	 {
		 if(j<=k/2||j==l||j<=s)
		 {
			 System.out.print("*");
		     l++;
		 }
		 else
		 {
			 System.out.print(" ");
			 l--;
		 }
	 }
	 System.out.println();
	 if(j<=n/2)
	 {
		 s--;
		 l++;
		 k=k+2;
	 }
	 else
	 {
		 s++;
		 l--;
		 k=k-2;
	 }
 }
	
	
	}

}
