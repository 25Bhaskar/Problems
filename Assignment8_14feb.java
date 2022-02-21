
class ageexception extends Exception
{
	ageexception(String S)
	{
		super(S);
	}
}
public class Assignment8_14feb 
{
	public static void main(String[] args) 
	{
		 String name=args[0];
		 int age=Integer.parseInt(args[1]);
		 try 
		 {
			 if ((age>=18) && (age<60))
			 {
				 System.out.println("You Entered Proper Argument");
			 }
			 else
				 throw new ageexception("Entered Argument is not proper");
		 }
		 catch (ageexception a)
		 {
			 System.out.println(a);
		 }		   
	}
}
