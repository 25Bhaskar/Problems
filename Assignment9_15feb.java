import java.util.HashSet;
import java.util.Iterator;
public class Assignment9_15feb 
{
	public static void main(String[] args) 
	{
		HashSet <String> H1=new HashSet();
		H1.add("Bhaskar");
		H1.add("Meghna");
		H1.add("Ankit");
		H1.add("Shivi");
		H1.add("Nagarjun");
		Iterator it=H1.iterator();
				while(it.hasNext())
				{
					System.out.print(it.next()+" ");
				}
		
		
	}

}
