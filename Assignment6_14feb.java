import java.util.Scanner;

class myexceptions extends Exception
{
	public myexceptions(String s)
	{
		super(s);
	}
}

public class Assignment6_14feb 
{
	
	public static void main(String[] args)
	{
		
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter name of student 1 :");
			String s1=sc.nextLine();
			System.out.println("Enter marks of 3 subject of "+s1);
			int[] n1=new int[3];
			int[] n2=new int[3];
			String s=null;			
		try 
		{
			for (int i=0;i<3;i++)
			{
				s=sc.next();
				n1[i]=Integer.parseInt(s);
				if (n1[i] < 0)
					throw new myexceptions("No negative value is allowed");
				else if ( n1[i] > 100)
					throw new myexceptions("Value out of range");
			}
			sc.nextLine();
			System.out.print("Enter name of student 2 :");
			String s2=sc.nextLine();
			System.out.println("Enter marks of 3 subject of "+s2);
			s=null;
			for (int i=0;i<3;i++)
			{
				s=sc.next();
				n2[i]=Integer.parseInt(s);
				if (n2[i] < 0)
					throw new myexceptions(s);
				else if ( n2[i] > 100)
					throw new myexceptions(s);
			}
			
			System.out.println("success");
		}
		catch(NumberFormatException Nfe)
		{
			System.out.println("Exception Detected -> "+Nfe);
		}
		catch(myexceptions N)
		{
			System.out.println("Exception Detected -> "+N);
		}
	}
}
