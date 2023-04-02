

class Worker1 implements Runnable 
{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("worker one is working "+ i);
		}
		
	}
	
	
}


class Worker2 implements Runnable 
{

	@Override
	public void run() {
		
		for(int i=0;i<10;i++)
		{
			
			
			System.out.println("worker 2 is workign "+i);
		}
		
	}
	
	
}
public class ThreadPriorityExample {
	
	public static void main(String args[])
	{
		
		System.out.println("Thread current name "+Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
		/**
		 * whatever priority we are going to use  here , the priority is going to be updated 
		 * 
		 * if we use 60 then it is used to be an exception\\
		 * \
		 * 
		 * Exception in thread "main" java.lang.IllegalArgumentException
	at java.base/java.lang.Thread.setPriority(Thread.java:1138)
	at ThreadPriorityExample.main(ThreadPriorityExample.java:9)
		 * 
		
		 */
		
		System.out.println("Thread Priority "+Thread.currentThread().getPriority());
		
	
		Thread.currentThread().setPriority(1);
		Thread t1  = new Thread(new Worker1());
		
		
		Thread t2 = new Thread(new Worker2());
		
		
		
		t1.setPriority(1);
		
		t2.setPriority(10);
		
		t1.start();
		
		t2.start();
		
		System.out.println("this is the main thread");
		
		
		
	}

}
