class Runner1 extends Thread 
{
	public void execute()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Runner1 "+i);
		}
	}
	
	@Override
	public void run()
	{
		execute();
		
	}
	
}


class Runner2 extends Thread 
{
	public void execute()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Runner2 "+i);
		}
	}
	@Override
	public void run()
	{
		execute();
		
	}
	
}


/**
 * 
 * 
 * @author ciphe
 * 
 * in this example we will try to extend Thread class
 * 
 * java virtual machine is going to start both of the thread 
 * 
 * runner1  and runner2 
 * 
 * 
 * os will do the time slicing 
 * 
 * we can do multithreading by extending the thread class 
 * 
 * 
 * sleep method will take input as long parameter 
 *
 */
public class StartingThreadByExtendingClass {
	
	public static void main(String args[])
	{
		
		Thread t1 = new Runner1();
		
		Thread t2 = new Runner2();
		
		t1.start();
		t2.start();
		
		/**
		 * if you see the output it is deterministic 
		 * 
		 */
	}
	

}
