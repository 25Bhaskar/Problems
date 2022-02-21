import java.util.List;
import java.util.ArrayList;

class newList<Var> extends ArrayList<Var> 
{
	public boolean add(Var v) 
	{
		if (v instanceof Integer || v instanceof Float || v instanceof Double) 
		{
			super.add(v);
			return true;
		} 
		else 
		{
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
public class Assignment3_15feb 
{	
	public static void main(String[] args) 
	{	
		ArrayList <Object> list = new newList<>();
		
		try 
		{
			list.add(29);
			list.add(1.5f);
			list.add(3.1409d);
			list.add("stringg");
		} catch (Exception E) 
		{
			System.out.println("Exception Detected "+E);
		}
		System.out.println(list);
	}
}