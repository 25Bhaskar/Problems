//JAVA 10-02-2022 Assignment 3 day 4
/*Create a school application with a class called Person. Create name and dateOfBirth as member variables.

Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.

Create a class called Student that inherits from Person class. This class will have a member variable called studentId.

Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.

Create objects of each of this classes, invoke and test the methods that are available in these classes.
*/
class Personclass
{
	private String name;
	private String dateOfBirth;
	
	public Personclass(String name, String dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public void getName() {
		System.out.println("Student Name: "+name);
	}

	public void getDateOfBirth() {
		System.out.println("Student DOB: "+dateOfBirth);
	}
}
class Teacher extends Personclass
{
	private double salary;
	private String subject;
	
	public Teacher(String name, String dateOfBirth, double salary, String subject) {
		super(name, dateOfBirth);
		this.salary = salary;
		this.subject = subject;
	}

	public void getSalary() {
		System.out.println("Teacher's Salary:"+salary);
	}

	public void getSubject() {
		System.out.println("Subject Teacher Teaches :"+subject);
	}
	
}
class Student extends Personclass
{
	private int studentID;

	public Student(String name, String dateOfBirth, int studentID) {
		super(name, dateOfBirth);
		this.studentID = studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void getStudentID() {
		System.out.println("Student ID: "+studentID);
	}
}
class CollegeStudent extends Student 
{
	private String collegeName;
	private String year;
	
	public CollegeStudent(String name, String dateOfBirth, int studentID, String collegeName, String year) {
		super(name, dateOfBirth, studentID);
		this.collegeName = collegeName;
		this.year = year;
	}

	
	public void getCollegeName() {
		System.out.println("College Name: "+collegeName);
	}

	public void getYear() {
		System.out.println("Year of study: "+year);
	}
}

public class SchoolApplication_day4 {
	public static void main(String[] args) {
	
	Personclass P=new Personclass("BHASKAR","25-NOV-1996");
	Student S=new Student("BHASKAR","25-NOV-1996",100);
	Teacher T=new Teacher("BHASKAR","25-NOV-1996",100000,"Maths");
	CollegeStudent CS=new CollegeStudent("BHASKAR","25-NOV-1996",100,"IIIT DM Jabalpur","2nd Year Student");
	
	P.getName();
	P.getDateOfBirth();
	
	S.getStudentID();
	
	CS.getCollegeName();
	CS.getYear();
	
	T.getSalary();
	T.getSubject();

	}
}
