package Pattrens;

public class p7 
{
	public static void main(String[] args) {
		int num=5,k=1;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i>=j)
					System.out.print(j%2 +" ");
				else 
					System.out.print(" ");
					
			}
			System.out.println();
		
	}

}
}
