

class InvalidCountryException extends Exception
{
	InvalidCountryException(String S)
	{
		super(S);
	}
}
//main class : UserRegistration
public class Assignment7_14feb 
{
	public static void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if (userCountry.equals("India")) 
		{
			System.out.println("User registration done successfully");
		}else
			throw new InvalidCountryException("User Outside India cannot be registered");
	}
	public static void main(String[] args) 
	{
		try 
		{
			registerUser("Mini","India");
		} 
		catch (InvalidCountryException ICE) 
		{
			System.out.println(ICE);
		}
	}
}
