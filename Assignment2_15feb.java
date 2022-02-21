import java.util.ArrayList;
public class Assignment2_15feb 
{
	public static void printALL(ArrayList<String> s)
	{
		for (int i=0;i<s.size();i++)
		{
			System.out.print(s.get(i)+" ");
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<>();
		list.add("Welcome");
		list.add("To");
		list.add("India");
		
		printALL(list);
	}
}
