package _17feb;

public class Assignment3 implements Runnable
{
	public static void main(String[] args) 
	{
		Assignment3 a= new Assignment3();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		
		t1.setName("th1");
		t2.setName("th2");
		t3.setName("th3");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName()+ ": " + i+" ");		
	}

}