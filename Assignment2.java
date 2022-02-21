package _17feb;

public class Assignment2 implements Runnable {
	static Thread Tho;
	static Thread The;

	@Override
	public void run() 
	{	
		try 
		{if (Thread.currentThread().getName().equals("Tho")) {The.join();}} catch (InterruptedException e) {e.printStackTrace();}
		
		for (int i = 1; i <= 20; i++) 
		{
			if (Thread.currentThread().getName().equals("The")) 
			{
				if (i % 2 == 0) System.out.print(i+" ");
			} 
			if (Thread.currentThread().getName().equals("Tho")) 
			{
				if (i % 2 == 1) System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Assignment2 A = new Assignment2();
		Tho = new Thread(A);
		The = new Thread(A);
		
		Tho.setName("Tho");
		The.setName("The");
		
		Tho.start();
		The.start();
	}
}