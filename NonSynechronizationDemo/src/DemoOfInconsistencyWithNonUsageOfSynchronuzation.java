
/**
 * 
 * @author ciphe
 * 
 * we are going to demonstrate , what problem you faced on multi threading 
 * 
 * that is going to create multiple threads 
 * 
 * 
 * 
 *
 */
public class DemoOfInconsistencyWithNonUsageOfSynchronuzation {
	
	public static int count=0;
	public static void process()
	{
		
		Thread t1 = new Thread(()->{
			
			for(int i=0;i<100;++i)
			{
			  
				count++;
			}
			
		});
		
		try {
			t1.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Thread t2 = new Thread(()->{
			
			for(int i=0;i<100;++i)
			{
				count++;
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
		
		/**
		 * 
		 * the result of the counter is non dererministic 
		 * 
		 * what is happening behind the scene 
		 * 
		 * public void increment()
		 * {
		 * 
		 * counter++'
		 * counter ++ this operations is going to have several sub opertions 
		 * 
		 * java is going to read the number from the memory
		 * 
		 * it is going to increment the value 
		 * 
		 * it is going to write the number back to the memory 
		 * 
		 * then it is going to return the variable 
		 * 
		 * basically this counter increment operation is not a single atomic operation 
		 * 
		 * but it consist of several other operations 
		 * 
		 * 
		 * while incrementing the value will take some time , another thread may call the inrement operation with value having the previous original value
		 * 
		 *  
		 *  the problem here is incrementing an integer is not an atomic problem 
		 *  
		 *  
		 *  there is why there may be inconsistencies 
		 *  
		 *  this is why we have to use the synchronized key word 
		 *  
		 *  
		 * 
		 * 
		 * 
		
		 * }
		 * 
		 */
		
	}

}
