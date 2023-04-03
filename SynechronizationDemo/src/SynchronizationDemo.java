
public class SynchronizationDemo {
	
	public static int count=0;
	
	/**
	 * we have to make sure that this method is called only by single thread 
	 * at a given time
	 * 
	 * we should use syncronisation when two or more thread trying to access the 
	 * 
	 * same resource 
	 * 
	 * this is what is happening here , two thread trying to increment the value of counter 
	 * 
	 * 
	 * if first thread is dealing with this synchronised method 
	 * 
	 * then the second thread is going to wait for the synchronised method 
	 * 
	 * if the second thread is dealing with syncronized method then the first 
	 * 
	 * thread has to wait for the synchronised method 
	 * 
	 * 
	 * 
	 */
	public static synchronized void increment()
	{
		count++;
	}
	
	public static void process()
	{
		
		Thread t1 = new Thread(()->{
			
			for(int i=0;i<100;++i)
			{
			  
				increment();
			}
			
		});
		
		
		
		Thread t2 = new Thread(()->{
			
			for(int i=0;i<100;++i)
			{
				increment();
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("the counter is "+ count);
		
	}
	
	public static void main(String args[])
	{
		process();
	}
	

}
