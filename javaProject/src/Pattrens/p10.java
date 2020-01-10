package Pattrens;

public class p10 
{
	public static void main(String[] args) {
		int num=5;
		for(int i=0;i<num;i++)
		{
			int k = 5;
			for(int j=0;j<num;j++)
			{
				if(i+j>=num-1)
					System.out.print(k);
				else 
					System.out.print(" ");
					
			}
			System.out.println();
		
	}

}
}
