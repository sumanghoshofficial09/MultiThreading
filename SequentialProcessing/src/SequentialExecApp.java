

class Runner1{
	
	
	public void execute()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Runner1 "+i);
		}
	}
}

class Runner2{
	
	
	public void execute()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Runner2 "+i);
		}
	}
}
public class SequentialExecApp {
	
	
	
	public static void main(String args[])
	{
		System.out.println("Hello World 1");
		System.out.println("Hello World 2");
		System.out.println("Hello World 3");
		
		downloadImage();
		
		
		
		showImage();
		
		Runner1 runner1 = new Runner1();
		
		Runner2 runner2 = new Runner2();
		
		/*
		 * 
		 * this is called Sequential processing , java is going to execute the code line by line 
		 * 
		 */
		
		runner1.execute();
		
		runner2.execute();
		
		/**
		 * 
		 * the operation here java is performing line by line basic means sequential basis 
		 */
	}

	private static void showImage() {
		// TODO Auto-generated method stub
		
	}

	private static void downloadImage() {
		// TODO Auto-generated method stub
		
	}

}
