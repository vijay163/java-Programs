package multiThread;
class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("bava hi");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class hi extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("hello mava");
try {
	Thread.sleep(2000);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
}
public class Run1{
public static void main(String[] args) throws InterruptedException {
 Thread obj1 = new hi();
 Thread obj2=new hello();
obj1.start();
Thread.sleep(2000);
obj2.start();

}
 }