import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Countryy
{
	Set<String> Ts=new TreeSet();
	public Set<String> saveCountryNames(String CountryName)
	{
		Ts.add(CountryName);
		return Ts;
	}
	public String getCountry(String CountryName)
	{
		Iterator it=Ts.iterator();
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

public class Assignment11_15feb  
{
	public static void main(String[] args)
	{
		Countryy c=new Countryy();
		c.saveCountryNames("India");
		c.saveCountryNames("Pakistan");
		c.saveCountryNames("China");

		System.out.println(c.getCountry("India"));
		System.out.println(c.getCountry("Pakistan"));
		System.out.println(c.getCountry("China"));
	}
}
