import java.util.ArrayList;
public class Assignment1_15feb 
{
	public static void main(String[] args)
	{
		ArrayList <String> list=new ArrayList<>();
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
		for (int i=0;i<12;i++)
		{
			System.out.println(list.get(i));
		}
	}
}
