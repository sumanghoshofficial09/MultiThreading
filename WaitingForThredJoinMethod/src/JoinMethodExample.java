

/*
 * Downloading image
 */

 class DownloadImageClass implements Runnable
{
	 
	 public void downloadImageMethod()
	 {
		 for(int i=100;i>=0;i--)
		 {
			 System.out.println("downloading left "+i+"%");
			 try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		 
		 }
	 }

	@Override
	public void run() {
		downloadImageMethod();
		
	}
	
	
}
 
 
 /***
  * 
  * @author ciphe
  * 
  * processing image class 
  *
  */
 
 class ProcessImageClass implements Runnable
 {
 	 
 	 public void processImageMethod()
 	 {
 		 for(int i=100;i>=0;i--)
 		 {
 			 System.out.println("prcossing left "+i+"%");
 			 try {
 				Thread.sleep(100);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		  
 		 
 		 }
 	 }

	@Override
	public void run() {
		processImageMethod();
		
	}
 	
 	
 }
public class JoinMethodExample {
	
	public static void main(String args[])
	{
		Thread t1 = new Thread(new DownloadImageClass());
		
		
		Thread t2 = new Thread(new ProcessImageClass());
		
		t1.start();
		
		t2.start();
		
		  try { 
			  t2.join();
			  } 
		  catch (InterruptedException e) { // TODO Auto-generated
		    e.printStackTrace(); 
		    }
		 
		
		System.out.println("main thread exit");
		
		/**
		 * when you call join  method , the main method will not get exist 
		 * 
		 * 
		 * until the thread where you applied the join , is still running 
		 * 
		 * 
		 */
	}

}
