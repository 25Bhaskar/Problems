class Employee
{
			private int empID;
			private String ename;
			private String email;
			private String gender;
			private float salary;
			
			public void GetEmployeeDetails()
			{
				System.out.println("EmpId :"+empID);
				System.out.println("Name  :"+ename);
				System.out.println("Email :"+email);
				System.out.println("Gender:"+gender);
				System.out.println("Salary:"+salary);				
			}
			
			public Employee(int empID, String ename, String email, String gender, float salary) 
			{
				this.empID = empID;
				this.ename = ename;
				this.email = email;
				this.gender = gender;
				this.salary = salary;
			}
}

class EmployeeDB
{
	Boolean addEmployee(Employee e)
	{
		
	}
}
	
	
	
	
}
public class Assignment7_15feb {

	
	public static void main(String[] args) {
		
}
}