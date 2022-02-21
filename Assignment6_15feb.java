import java.util.*;
class Employee
{
	private String ename;
	private int eno;
	private double salary;
	
	public Employee(String ename, int eno, double salary) 
	{
		this.ename =ename;
		this.eno =eno;
		this.salary=salary;
	}
	
	public String toString() 
	{
		return ename+" "+eno+" "+salary;
	}
}

public class Assignment6_15feb 
{
	public static void main(String[] args) 
	{
		Employee E=new Employee("Bhaskar Chauhan",10,9000000);
		Vector <Employee> v=new Vector<> ();
		v.add(E);
		v.add(new Employee("Meghna Chauhan",20,4000000));
		v.add(new Employee("Rahul Chauhan",30,5000000));
		
        //Iterator
		Iterator <Employee> it=v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("----------------------------");
		//Enumeration 
		Enumeration Enum=v.elements();
		while (Enum.hasMoreElements())
			System.out.println(Enum.nextElement());
	}
}
