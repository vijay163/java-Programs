package Pattrens;

public class OddnumEvenChar 
{
	public static void main(String[] args) {
		int num=4;

		for(int i=0;i<num;i++)
		{ 
			int k=1;
			char ch='a';
			for(int j=0;j<num;j++)
			{
				if(i%2==0)
				{
					System.out.print(k++ +" ");
				}
				else {
					System.out.print(ch++ +" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
