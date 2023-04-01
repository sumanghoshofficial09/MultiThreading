
class Runner2 implements Runnable{
	
	
	public void execute()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Runner2 "+i);
		}
	}

	@Override
	public void run() {
		execute();
		
	}
}
class Runner1 implements Runnable{
	
	
	public void execute()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Runner1 "+i);
		}
	}

	@Override
	public void run() {
		execute();
		
	}
}

/**
 * 
 * @author ciphe
 * 
 * there are two fundamental to start a thread 
 * 'first of all implement Runnable interface 
 * it needs to override the run method 
 * 
 * 
 * if we copy paste the code we like to run in the overriden run method , then we can achive multi threading 
 * 
 * Runnable interface should be implemented by those class who want their instances to be executed by Thread 
 * 
 * class must define a method of no arguement called run()
 * 
 * 
 *
 */
public class StartingAThread {
	
	public static void main(String args[])
	{
		Runner1 runner1 = new Runner1();
		
		Runner2 runner2 = new Runner2();
		
		new Thread(runner1).start();
		new Thread(runner2).start();
	}
	
	/*
	 * 
	 * 
	 * in this case Java is going to run both Runner1 and Runner 2 
	 * it is going to use time slicing algorithm 
	 * 
	 * this is not parallel execution 
	 * 
	 * this is multi threading execution with timed slicing algorithm 
	 * 
	 * what is then the parallel execution , it is one core of cpu is handling first thread , and another core of cpu handling the second thread , 
	 * this is like parallel execution not  timed sliced 
	 * 
	 * 
	 */

}
