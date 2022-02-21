package MAP_16feb;

public class Assignment8 implements Runnable
{
	String colours[]={"white","blue","black","green","red","yellow"};
	public void run()
	{
		int index=(int)(Math.random()*5);
		System.out.println(index);
		while (colours[index] != ("red"))
		{
		
			System.out.println(colours[index]);
			index=(int)(Math.random()*5);
			System.out.println(index);
		}
	}
	public static void main(String[] args)
	{
		Assignment8 mt=new Assignment8();
		Thread th=new Thread(mt);
		th.start();
	}
}           
		

