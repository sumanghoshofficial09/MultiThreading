

class Worker implements Runnable 
{

	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Hello World from given thread .....");
		
	}
	
	
}

class DaemonWorker implements Runnable 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true)
		{
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Daemon thread is running ");
		}
		
	}
	
	
	
}


class NormalWorker implements Runnable 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int i=0;
		while(i++<=10)
		{
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Normal thread is running "+i);
		}
		
	}
	
	
	
}

/**
 * 
 * 
 * @author ciphe
 * 
 * 
 * see in the this example the though the daemon thread is runnign in loop 
 * 
 * but When the worker Thread terminate , JVM automatically shuts down all daemon Thread terinate itself 
 * 
 * 
 *
 */
public class DaemonThreadAndCurrentThreadExample {
	
	public static void main(String args[])
	{
		String name = Thread.currentThread().getName();
		
		System.out.println(name);
		
		/**
		 * 
		 * we have the main thread , the first thread of java virtual machine 
		 * 
		 * when the java programme start one thread begin immediately 
		 * 
		 * this is called main thread 
		 * 
		 * we can create child thread from the main thread 
		 * 
		 * this is what we are talking about in the previous lectures 
		 * 
		 * 
		 * with help of Runnable Interface or with the help of thread class
		 * 
		 * 
		 * main thread is the last thread to finish execution  : looks like this statement is wrong 
		 * 
		 * main thread and every other child threads are  worker thread 
		 * 
		 * and then we have daemon thread 
		 * 
		 * such as daemon thread is going to handle the garbage collection 
		 * 
		 * 
		 * when we run the application : 
		 * 
		 * Java virtual machine is going to create main thread and daemoon thread 
		 * 
		 * 
		 * we are going to decide that the child thread is going to be worker thread or daemeon thread 
		 * 
		 * we are able to create our daemon thread as well 
		 * 
		 * these are low priority threads that runs in the background to perform some task as garbage collection 
		 * 
		 * 
		 * usually we create daemon thread for input output operations and services 
		 * 
		 * 
		 * we can create daemon thread for smart phone application to look for smart watches to pair with 
		 * 
		 * 
		 * usually Dameon threads are low priority thread those are running in background 
		 * 
		 * Dameon threads are teminated by JVM , when all worker threads are terminated 
		 * ]
		 * daemon threads are terminated by java virtual machine
		 * 
		 * when all the worker thread finish executions
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Thread t1  = new Thread(new DaemonWorker());
		
		t1.setDaemon(true);  // turning a thread to Daemon thread 
		
		
		System.out.println(t1.isDaemon());
		
		Thread t2  = new Thread(new NormalWorker());
		
		t2.setDaemon(false);
		
		t1.start();
		
		t2.start();
		
		/**
		 * 
		 * java virtual machine is going to terminate all the daemon threads when all the worker threads got terminated 
		 * 
		 * 
		 */
		
	 /**
	  * daemon thread is going to run in back ground 
	  * 
	  * these are low  priority threads and java virtual machine can terminae the thread 
	  */
		
		
		
	}

}

