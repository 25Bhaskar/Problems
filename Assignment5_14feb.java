import java.util.Scanner;
public class Assignment5_14feb {
	public static void division(int x,int y)
	{
		int c=0;
		try 
		{
			c=x/y;
			System.out.println("Division is : "+c);
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int inp1=sc.nextInt();
		System.out.println("Enter second Number: ");
		int inp2=sc.nextInt();
		division(inp1,inp2);
		
	}
}
