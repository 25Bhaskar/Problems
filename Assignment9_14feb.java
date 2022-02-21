import java.util.Scanner;

public class Assignment9_14feb 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int inp1=sc.nextInt();
		int inp2=sc.nextInt();
		try 
		{
			int div=inp1/inp2;
			System.out.println("The Quotient of "+inp1+"/"+inp2+" = "+div);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("DivideByZeroException caught ");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}
