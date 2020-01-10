package multiThread;
class bye implements Runnable
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
class bhai implements Runnable
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

public class runInte {
	public static void main(String[] args) throws InterruptedException {
		Runnable b1 = new bye();
	    Runnable b2 = new bhai();
	    Thread t1 = new Thread(b1);
	    Thread t2 = new Thread(b2);
	t1.start();
	Thread.sleep(2000);
	t2.start();
	}

}
