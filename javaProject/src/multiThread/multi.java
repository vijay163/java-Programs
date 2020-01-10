package multiThread;
class bava extends Thread
{
	public void bava() throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("bava hi");
			Thread.sleep(2000);
		}
	}
	
}
class mava extends Thread
{
public void mava() throws InterruptedException
{
for(int i=0;i<5;i++)
{
System.out.println("hello mava");
Thread.sleep(2000);
}
}
}

public class multi {
public static void main(String[] args) throws InterruptedException {
bava obj1 = new bava();
mava obj2=new mava();
obj1.bava();
Thread.sleep(2000);
obj2.mava();

}
 }
