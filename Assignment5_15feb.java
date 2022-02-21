import java.util.*;
public class Assignment5_15feb 
{
	public static void main(String[] args) 
	{
		 Vector <String> list = new Vector<>();
		 list.add("January");
		 list.add("Feburary");
		 list.add("March");
		 list.add("April");
		 list.add("May");
		 list.add("June");
		 list.add("July");
		 list.add("August");
		 list.add("September");
		 list.add("October");
		 list.add("November");
		 list.add("December");

		 Iterator <String> it= list.iterator();
		 while (it.hasNext())
		 {
			 System.out.println(it.next());
		 }
	}
}
