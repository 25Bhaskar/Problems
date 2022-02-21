import java.util.HashSet;
import java.util.*;

class Country
{
	HashSet<String> H1=new HashSet();
	public HashSet<String> saveCountryNames(String CountryName)
	{
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName)
	{
		Iterator it=H1.iterator();
		while (it.hasNext())
		{
			if (it.next().equals(CountryName))
			{
				return CountryName;
			}
		}
		return null;
	}
}

public class Assignment8_15feb 
{
	public static void main(String[] args)
	{
		Country c=new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("Pakistan");
		c.saveCountryNames("China");

		System.out.println(c.getCountry("India"));
		System.out.println(c.getCountry("Pakistan"));
		System.out.println(c.getCountry("China"));
	}
}
