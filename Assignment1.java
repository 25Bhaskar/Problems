package _17feb;

class threading extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if (i==6) 
			{
				try { Thread.currentThread().sleep(5000);} catch (InterruptedException e) { e.printStackTrace();}
			}
			System.out.println(i);
		}
	}

}

public class Assignment1 
{	 
	public static void main(String args[])
	{
		threading mt=new threading(); //ready
		mt.start(); //running
	}
}           
