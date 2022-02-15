# Problems
Samsung Java Training Modules

P1) Write a program to check if a given integer number is Positive, Negative, or Zero.

import java.util.Scanner;
public class Assignment1_day1 {
	public static void main(String[] args) 
	{
		   Scanner sc=new Scanner(System.in);   
		   System.out.println("Enter number (P/N/ZERO) : ");
		   int a=sc.nextInt();
		   if (a>0) {
			   System.out.println(a+" is positive number");
		   }else if (a<0){
			   System.out.println(a+" is negative number");
		   }else {
			   System.out.println(a+" is Zero");
		   }
	}
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
P2) Write a program to check if a given integer number is odd or even.

import java.util.Scanner;
public class Assignment2_day1 {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter number (to check even or odd ) : ");
		   int b=sc.nextInt();
		   if (b%2==0)
		   {
			   System.out.println(b+" is EVEN number");
		   }else {
			   System.out.println(b+" is ODD number");
		   }
		   
	}

}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
P3) Write a program to receive a color code from the user (an Alphabhet). 
    The program should then print the color name, based on the color code given. 
    The following are the color codes and their corresponding color names.
    R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
    If color code provided by the user is not valid then print "Invalid Code".

import java.util.Scanner;
public class Assignment3_day1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter alphabet R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White : ");
		   char str=sc.next().charAt(0);
		   switch(str)
		   {
		   case 'R' : System.out.println("RED Colour ");   break;
		   case 'B' : System.out.println("BLUE Colour ");  break;
		   case 'G' : System.out.println("GREEN Colour "); break;
		   case 'O' : System.out.println("ORANGE Colour ");break;
		   case 'Y' : System.out.println("YELLO Colour "); break;
		   case 'W' : System.out.println("WHITE Colour "); break;
		   default : System.out.println("Invalid input "); 
		   }
	}
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
P4) Write a program to receive a number and print the corresponding month name.
     Example1)
     I/P: 12
     O/P  : December
     Example2)
     I/P: 15
     O/P Expected : Invalid month.

import java.util.Scanner;	   
public class Assignment4_day1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter month number (1-12) : ");
		   int inp=sc.nextInt();
		   switch(inp)
		   {
		   case 1  : System.out.println("JANUARY ");  break;
		   case 2  : System.out.println("FEBRUARY "); break;
		   case 3  : System.out.println("MARCH ");    break;
		   case 4  : System.out.println("APRIL ");    break;
		   case 5  : System.out.println("MAY ");      break;
		   case 6  : System.out.println("JUNE ");     break;
		   case 7  : System.out.println("JULY ");     break;
		   case 8  : System.out.println("AUGUST");    break;
		   case 9  : System.out.println("SEPTEMBER ");break;
		   case 10 : System.out.println("OCTOBER ");  break;
		   case 11 : System.out.println("NOVEMBER "); break;
		   case 12 : System.out.println("DECEMBER "); break;
		   default : System.out.println("Invalid input "); 
		   }
	}
}

########################################################################################################################################################################
Hands On Problems : Assignment - 2
Date - 08/02/2022
************************************************************************************************************************************************************************

P1) Write a program to print numbers from 1 to 10 in a single row with one tab space.

public class Assignment1_day2 {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			System.out.print(i+"\t");
		}
	}
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
P2) Write a program to print even numbers between 23 to 57 Each number should be printed in a separate row.

public class Assignment2_day2 {
	public static void main(String[] args) {
		for (int i=24;i<57;i++) {
			if (i%2 ==0) {
				System.out.println(i);
			}
		}
	}
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
P3) Write a program to check if a given number is prime or not.

import java.util.Scanner; 
public class Assignment3_day2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int c=0;
		if (num==0 || num==1)
			c=1;
		for (int i=2;i<=num/2;i++) {
			c=0;
			if (num%i == 0) 
			{
				c=1;break;
			}else
				c=0;
		}
		if (c==1)
			System.out.println("Not Prime Number");
		else
			System.out.println("Prime Number");
		}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P4) Write a program to print prime numbers between 10 and 99.

public class Assignment4_day2 {
	public static void main(String[] args) {
		int num1=10,num2=99,c;
		for (int i=num1+1;i<num2;i++) {
			c=0;
			for (int j=2;j<=i/2;j++) {
				if (i%j == 0) {
					c=1;
					break;
				}else
					c=0;
			}
			if (c==0)
				System.out.println(i);
		}
	}
}


########################################################################################################################################################################
Hands On Problems : Assignment - 3
************************************************************************************************************************************************************************

P1) Write a program to reverse a given number and print.
   Example1)
   I/P: 1234
   O/P:4321
   Example2)
   I/P:1004
   O/P:4001

import java.util.Scanner;
public class Assignment1_day3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int a=0;
		while (num > 0)
		{
			a=num%10;
			System.out.print(a);
			num=num/10;
		}	
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P2) Write a Java program to find if the given number is palindrome or not
    Example1)
    I/P: 110011
    O/P: 110011 is a palindrome
    Example2)
    I/P: 1234
    O/P: 1234 is not a palindrome.

import java.util.Scanner;
public class Assignment2_day3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int num=sc.nextInt();
		int tempnum=num,addnum=0,a=0;
		while (num >0)
		{
			a=num%10;
			addnum=(addnum*10)+a;
			num=num/10;
		}
		if ( addnum == tempnum ) 
			System.out.print(tempnum+" is a PALINDROME");
		else 
			System.out.print(tempnum+" is not a PALINDROME");	
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P3) Write a program to print first 5 values which are divisible by 2, 3, and 5.

public class Assignment3_day3 {
	public static void main(String[] args) {
	int count=0;
	for (int i=1;i<=i+1;i++) {
		if ((i%2==0) && (i%3==0) && (i%5==0)) {
			System.out.print(i+" ");
			count++;
			if (count==5) {
				break;
			}
		}
	}
}
}
       
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P4) Write a program to initialize an integer array and print the sum and average of the array.

import java.util.Scanner;
public class Assignment4_day3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();

                int[] array=new int[size]; 
		for(i=0;i<size;i++)  
		{
		array[i]=sc.nextInt();
		}
		
                int sum=0;
		float avg=0;
		for (int i=0;i<size;i++) {
			sum +=array[i];
		}
		avg=sum/size;
		System.out.println("SUM = "+ sum + " Average = "+avg);
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P5) Write a program to initialize an integer array and find the maximum and minimum value of the array.

import java.util.Scanner;
public class Assignment5_day3 {
	public static void main(String[] args) {
		
                Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();

                int[] array=new int[size]; 
		for(i=0;i<size;i++)  
		{
		array[i]=sc.nextInt();
		}

		int max=0,min=array[0];
 		for (int i=0;i<size;i++) {
			if (max < array[i]) {
				max=array[i];
			}
			if (min > array[i]) {
				min=array[i];
			}
		}
		System.out.println("Maximum Value = "+ max + " Minimum Value = "+ min);
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P6) Write a program to initialize an integer array with values and check if a given number is present in the array or not. 
If the number is not found, it will print -1 else it will print the index value of the given number in the array.
Example 1) If the Array elements are {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are {1,4,34,56,7} and the search element is 56, then the output expected is 3.


import java.util.Scanner;
public class Assignment6_day3 {
	public static void main(String[] args) {
		
                Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();

                int[] array=new int[size]; 
		for(i=0;i<size;i++)  
		{
		  array[i]=sc.nextInt();
		}
		int c=0;
		System.out.print("Enter a number to search : ");
		int num=sc.nextInt();
		
		for (int i=0;i<size;i++) {
			if (array[i]==num) {
				c=i;
				break;
			}else
				c=0;
		}
		if (c !=0)
			System.out.println(c);
		else
			System.out.println("-1");		
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P7) Initialize an integer array with ascii values and print the corresponding character values in a single row.

public class Assignment7_day3 {
	public static void main(String[] args) {
		int[] array=new int[52];
		int j=65,k=97;
		for (int i=0;i<52;i++) {
			if (i<26) {
			array[i]=j;
			j++;
			}else {
				array[i]=k;
				k++;
			}
		}
		for (int i=0;i<52;i++) {
			System.out.print(array[i]+" "+(char)array[i]+" ");
			}
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P8) Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

import java.util.Scanner;
public class Assignment8_day3 {
		public static void main(String[] args){
                
                Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();

                int[] array=new int[size]; 
		for(i=0;i<size;i++)  
		{
		  array[i]=sc.nextInt();
		}

		int c=0,mx1=array[0],mx2=array[1],mi1=array[0],mi2=array[1];
		int temp1=0,temp2=0;
		
                //swapping
		if (mx2 > mx1)
		{
			temp1=mx2;
			mx2=mx1;
			mx1=temp1;
		}
		
		if (mi2 < mi1)
		{
			temp2=mi2;
			mi2=mi1;
			mi1=temp2;
		}
		
		for(int i=2;i<size;i++)
		{//Largest
			if (array[i] > mx1)
			{
				mx2=mx1;
				mx1=array[i];
			}
			else if ((array[i] > mx2) && (array[i] != mx1))
			{
				mx2=array[i];
			}
			
		//Smallest
			if (array[i] < mi1)
			{
				mi2=mi1;
				mi1=array[i];
			}
			else if ((array[i] < mi2) && (array[i] != mi1))
			{
				mi2=array[i];
			}
			
		}
		//Print
		System.out.println("Largest 1 :"+mx1 +"\n"+"Largest 2 : "+mx2 +"\n" + "Smallest 1 :"+mi1 +"\n"+"Smallest 2 : "+mi2);
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P9) Write a program to initialize an array and print them in a sorted order.

import java.util.Scanner;
public class Assignment9_day3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();

                int[] array=new int[size]; 
		for(i=0;i<size;i++)  
		{
		  array[i]=sc.nextInt();
		}		

		int temp=0;					
		for (int i=0;i<size;i++)
		{
			for (int j=i+1;j<size;j++)
			{
				if (array[i] > array[j])
					{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					}
			}
		}
		for (int i=0;i<size;i++) {
		System.out.print(array[i]+ " ");
		}
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P10) Write a program to remove the duplicate elements in an array and print the same.
     Example:
     I/P:{12,34,12,45,67,89}
     O/P:{12,34,45,67,89}

import java.util.Scanner;
public class Assignment10_day3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size=sc.nextInt();
		int [] array=new int[size];
		System.out.println("Enter array elements :");
		for (int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		int [] b=new int [size];
		int j=0;
		for (int i=0;i<size-1;i++) {
			if (array[i] !=array[i+1] )
				{
				b[j++]=array[i];
				}	
		}
		
		b[j++]=array[size-1];
		for (int i=0;i<j;i++)
		{
			System.out.print(b[i]+" ");
		}				
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P11) Write a program to print the sum of the elements of an array following the given below condition.
     If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
      Eg1) Array Elements - 10,3,6,1,2,7,9
      O/P: 22
      [i.e 10+3+9]
      Eg2) Array Elements - 7,1,2,3,6
      O/P:19
      Eg3) Array Elements - 1,6,4,7,9
      O/P:10

import java.util.Scanner;
public class Assignment11_day3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int size=sc.nextInt();
		
		int [] array=new int[size];
		System.out.println("Enter array elements :");
		for (int i=0;i<size;i++) {
			array[i]=sc.nextInt();	
		}
		
		int sum=0,i,j,i6=0,i7=0,fg=0;
		for ( i=0;i<size-1;i++) 
		{
			if (array[i]==6)
				{
					for( j=i+1;j<size;j++)
					{
						if (array[j]==7)
						{
							i6=i;
							i7=j;
							fg=1;
							break;
						}
					}
					break;
				}
		}
		for (i=0;i<size;i++)
		{
			if (fg == 1) 
			{
				if ((i<i6) || (i>i7))
				   sum+=array[i];
				else
				   continue;
			}
			else 
			{
				sum+=array[i];
			}
		}
		System.out.print(sum+" ");
	}
}




------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P12) Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
     The dimensions of the Box are width, height, depth. The class should 
     have a method that can return the volume of the box. Create an object of the Box class and test the functionalities

public class BOX {
	int w;
	int h;
	int d;
	BOX(int width,int height,int depth)
	{
		w=width;
		h=height;
		d=depth;
	}
	public int volume()
	{
		return w*h*d;
	}
	public static void main(String[] args) {
	BOX B=new BOX(2,3,4);
	System.out.print("Volume : "+ B.volume());
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P13) Create a new class called Calculator with the following methods:
     1. A static method called powerInt(int num1,int num2)
        This method should return num1 to the power num2.
     2. A static method called powerDouble(double num1,int num2).
        This method should return num1 to the power num2.
     3. Invoke both the methods and test the functionalities.

     Hint: Use Math.pow(double,double) to calculate the power.


public class Calculator {
	public static int powerInt(int num1,int num2)
	{
		return (int) Math.pow(num1,num2);	
	}
	public static int powerDouble(double num1,int num2)
	{
		return (int) Math.pow(num1,num2);	
	}
	public static void main(String[] args) {
		int num1=2;
		int num2=8;
		Calculator.powerInt(num1,num2);
		Calculator.powerDouble(num1,num2);
		System.out.println(Calculator.powerInt(num1,num2));
		System.out.println(Calculator.powerDouble(num1,num2));

	}
}



########################################################################################################################################################################
Hands On Problems : Assignment - 4
************************************************************************************************************************************************************************

P1) Create a class named ‘Animal’ which includes methods like eat() and sleep().
    Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
    Create an instance of Animal class and invoke the eat and sleep methods using this object.
    Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

class Animal
{
	public void eat() {
		System.out.println(" Class Animal : EAT Method");
	}
	public void sleep() {
		System.out.println(" Class Animal : SLEEP Method");
	}
}

class Bird extends Animal
{
	public void eat() {
		System.out.println(" Class Bird : EAT Method");
		
	}
	public void sleep() {
		System.out.println(" Class Bird : SLEEP Method");
		
	}
	public void fly() {
		System.out.println(" Class Bird : FLY Method");
	}
}

public class Assignment1_day4 {
	public static void main(String[] args) {
		Animal A=new Animal();
		Bird B=new Bird();
		A.eat();
		A.sleep();
		B.eat();
		B.sleep();
		B.fly();
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P2) Create a class called Person with a member variable name. Save it in a file called Person.java
    Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), 
    the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
    Your class should have the necessary constructors and getter/setter methods.
    Write another class called TestEmployee, containing a main method to fully test your class definition.

~~~~~~~~~~~~~~~~~
public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
~~~~~~~~~~~~~~~~~
public class Employee extends Person {	
	private double salary;
	private int year;
	private String Insnum;	
	public Employee(String name) {
		super(name);
		System.out.println("Employee Name : "+getName());
	}
		
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsnum() {
		return Insnum;
	}
	public void setInsnum(String insnum) {
		Insnum = insnum;
	}
}
~~~~~~~~~~~~~~~~~
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee Emp=new Employee("Bhaskar");
		Emp.setSalary(1000000);
		Emp.setYear(2022);
		Emp.setInsnum("98XBO92018282");
		
		System.out.println("Salary :"+Emp.getSalary());
		System.out.println("Joining Year :"+Emp.getYear());
		System.out.println("InsuranCE Number :"+Emp.getInsnum());	
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P3) Create a school application with a class called Person. Create name and dateOfBirth as member variables.
    Create a class called Teacher that inherits from the Person class. The teacher will have additional properties like salary, and the subject that the teacher teaches.
    Create a class called Student that inherits from Person class. This class will have a member variable called studentId.
    Create a class called College Student that inherits from Student class. This class will have collegeName, the year in which the student is studying
    (first/second/third/fourth) etc.
    Create objects of each of this classes, invoke and test the methods that are available in these classes.

~~~~~~~~~~~~~~~~~~
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
~~~~~~~~~~~~~~~~~~
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
~~~~~~~~~~~~~~~~~~~
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
~~~~~~~~~~~~~~~~~~~~
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
~~~~~~~~~~~~~~~~~~~~
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

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P4) Create a base class Fruit with name ,taste and size as its attributes.
    Create a method called eat() which describes the name of the fruit and its taste.
    Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

~~~~~~~~~~~~~~~~~~~~~
class Fruit
{
	String name;
	String taste;
	float size;
	void eat() 
		{
			System.out.println("Name of the fruit is : "+name);
			System.out.println("Taste : "+taste);
		}
}
~~~~~~~~~~~~~~~~~~~~~
class Apple extends Fruit
{
	String name;
	String taste;
	Apple()
	{
		name="APPLE";
		taste="Sweet and Puffy";
	}
	void eat()
	{
		System.out.println("Name: "+name);
		System.out.println("Taste: "+taste);
		
	}
}
~~~~~~~~~~~~~~~~~~~~~~
class Orange extends Fruit
{
	String name;
	String taste;
	Orange()
	{
		name="ORANGE";
		taste="Sour";
	}
	void eat()
	{
		System.out.println("Name: "+name);
		System.out.println("Taste: "+taste);
	}
}
~~~~~~~~~~~~~~~~~~~~~~
public class Fruit_Assignment4_day4 {

	public static void main(String[] args) {
		Apple A=new Apple();
		A.eat();
		Orange O=new Orange();
		O.eat();
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P5) Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
    For this class, create three sub classes, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase ().
    The draw() method should print “Drawing Circle”, “Drawing Triangle” and “Drawing Square” respectively.
    The erase() method should print “Erasing Circle”, “Erasing Triangle” and “Erasing Square” respectively.
    Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature `
    of the class by calling draw() and erase() method using each object.
    Shape c=new Circle();
    Shape t=new Triangle();
    Shape s=new Square();

~~~~~~~~~~~~~~~~~~~~~~~~
class Shape
{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public void erase()
	{
		System.out.println("Erase Shape");
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void erase()
	{
		System.out.println("Erase Circle");
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~
class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}
	public void erase()
	{
		System.out.println("Erase Triangle");
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~
class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Square");
	}
	public void erase()
	{
		System.out.println("Erase Square");
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~
public class Shape_Assignment5_day4 {

	public static void main(String[] args) {
		//Shape S=new Shape();
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.draw();t.draw();s.draw();
		c.erase();t.erase();s.erase();	
	}
}


------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P6) Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and getFixedDepositInterestRate methods,
    which returns the savings account interest rate and fixed deposit account interest rate that the specific bank gives. 
    Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
    Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class. 
    The following are the interest rates of these banks.
    ICICIBank - Savings 4% Fixed 8.5% and
    KotMBank - Savings 6% Fixed 9%.
    Create a main method to test the above classes and their methods. Try one by one and observe your findings
    a) ICICIBank i=new ICICIBank();
    b) KotMBank k=new KotMBank();
    c) GeneralBank g=new KotMBank();
    d) GeneralBank g=new ICICIBank();

~~~~~~~~~~~~~~~~~~~~~~~~
abstract class GeneralBank
{
	abstract void getSavingsInterestRate();
	abstract void getFixedDepositInterestRate();
	
}
~~~~~~~~~~~~~~~~~~~~~~~~
class ICICIBank extends GeneralBank
{
	float sav=0.04f;
	float fix=0.085f;
	public void getSavingsInterestRate()
	{
		System.out.println("saving ICICI: "+sav);
	}
	public void getFixedDepositInterestRate()
	{
		System.out.println("fixed ICICI: "+fix);
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~
class KotMBank extends GeneralBank
{
	float sav=0.06f;
	float fix=0.09f;
	public void getSavingsInterestRate() 
	{
		System.out.println("saving KotmBank: "+sav);
	}
	public void getFixedDepositInterestRate() 
	{
		System.out.println("fixed KotmBank: "+fix);
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~
public class Bank_Assignment6_day4 {

	public static void main(String[] args) 
	{
		ICICIBank i=new ICICIBank();
		i.getSavingsInterestRate();
		i.getFixedDepositInterestRate();
		
		KotMBank k=new KotMBank();
		k.getSavingsInterestRate();
		k.getFixedDepositInterestRate();
		
		GeneralBank g=new KotMBank();   //Using Base class object
		g.getSavingsInterestRate();
		g.getFixedDepositInterestRate();
		
		GeneralBank g1=new ICICIBank();
		g1.getSavingsInterestRate();
		g1.getFixedDepositInterestRate();
		
	}

}


------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P7) An online library application need to be created for two types of users/roles-Adults and children. Both of these users should be able to register an account.
    Any user who is less than 12 years of age will be registered as a child and they can borrow a “Kids” category book for 10 days, whereas an adult can borrow  
    “Fiction” category books which need to be returned within 7 days.
    Note: In future, more users/roles might be added to the library where similar rules will be enforced.
    Develop Interfaces and classes for the categories mentioned above.
    1. Create an interface LibraryUser with the following methods
       void registerAccount()
       void requestBook()
    2. Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser interface.
    3. Both the classes should have two instance variables - age(int),bookType(String)
    4. The methods in the KidUser class should perform the following logic.
       registerAccount():
       if age < 12, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console.
       If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the console.
       requestBook():
       if bookType is “Kids”, a message displaying “Book Issued successfully, please return the book within 10 days” should be displayed in the console,else,
       a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console.
    5. The methods in the AdultUser class should perform the following logic.
       registerAccount():
       if age > 12, a message displaying “You have successfully registered under an Adult Account” should be displayed in the console.
       If age<12, a message displaying, “Sorry, Age must be greater than 12 to register as an adult” should be displayed in the console.
       requestBook function():
       if bookType is “Fiction”, a message displaying “Book Issued successfully, please return the book within 7 days” should be displayed in the console.,
       else, a message displaying, “Oops, you are allowed to take only adult Fiction books” should be displayed in the console.
    6. Create a class “LibraryInterfaceDemo.java” with a main method and test the functionalities by creating objects of KidUser and AdultUser
       classes.An online library application need to be created for two types of users/roles-Adults and children. 
       Both of these users should be able to register an account.
~~~~~~~~~~~~~~~~~~~~~~~~~~~
interface LibraryUser
{
	void registerAccount(); 
	void requestBook();
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class AdultUsers implements LibraryUser
{
	int age;
	String bookType;
	AdultUsers(int age, String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount() 
	{
		if (age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}else
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
	public void requestBook() 
	{
		if (bookType.contentEquals("Fiction") && (age>12)) //Improve the condition a bit
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~
class KidUsers implements LibraryUser
{
	int age;
	String bookType;	
	KidUsers(int age, String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount() 
	{
		if (age < 12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else 
		{	
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook() 
	{
		if (bookType.equals("Kids") && (age <12)) //Improve the conditions a bit
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
	}
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~
public class Library_Assignment7_day4 {
	public static void main(String[] args) 
	{
		KidUsers K=new KidUsers(10,"Kids");        //passing age as 10 year
		AdultUsers A=new AdultUsers(25,"Fiction"); //passing age as 25 year
		K.registerAccount();
        K.requestBook();
	
		A.registerAccount();
		A.requestBook();
	}
}




########################################################################################################################################################################
Hands On Problems : Assignment - 5
************************************************************************************************************************************************************************

P1) Write a program to check whether a given string is palindrome or not.

import java.util.Scanner;
public class Assignment8_day4_StringPalindrome {

   	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String s=sc.nextLine();
		String rs="";
		int size=s.length();
		for (int i=size-1;i>=0;i--)
		{
			rs+=s.charAt(i);
		}
		
		if (rs.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P2) Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
    Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
    Example1)
    i/p:Sachin,Tendulkar
    o/p:sachin tendulkar
    Example2)
    i/p:Mark,kate
    o/p:markate

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Assignment9_day4 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		char[] s=sc.nextLine().toLowerCase().toCharArray();
		char[] b;
		int j=0;
		int size=s.length;
		HashSet<Character> s1 = new LinkedHashSet<>(size - 1);
		for(char i: s)
		{ 
			if (i==',')
			{
				continue;
			}else
			{
				s1.add(i);
			}
		}
		 for (char x : s1)
	            System.out.print(x);
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P3) Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.
    Example1)
    i/p:Wipro
    o/p:WiWiWiWiWi

import java.util.Scanner; 
public class Assignment1_string_day5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		
		StringBuilder S=new StringBuilder(" ");
		
		int a=0,b=1;
		for (int i=0;i<str.length();i++)
		{
		
			S.insert(a,str.charAt(0));
			S.insert(b,str.charAt(1));
			a+=2;
			b+=2;
		}
		System.out.println(S);
	}

}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
P4) Write a java program that will return the first half of the string, if the length of the string is even. It should return null for odd length string.
    Example1)
    i/p:TomCat
    o/p:Tom
    Example2)
    i/p:Apron
    o/p:null

import java.util.Scanner;
public class Assignment2_string_day5 {
	public static String halfstring(String str,int size)
	{
		StringBuilder S=new StringBuilder(" ");
		if (size%2==0)
		{
			for(int i=0;i<size/2;i++)
			{
				S.insert(i,str.charAt(i));
			}
		}
		else
			return null;
		return S.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		int size=str.length();
		String S=halfstring(str,size);
		System.out.println(S);
	}
}


------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P5) Write a java program that accepts a string and returns a new string without the first and last character of the input string.
     Example1)
     i/p:Suman
     o/p:uma
import java.util.Scanner;
public class Assignment3_string_day5 {
	public static String firstlast(String str, int size)
	{
		StringBuilder S=new StringBuilder(str);
		S.delete(0,1);
		S.delete(size-1,size);	
		return S.toString();
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		int size=str.length();
		String S=firstlast(str,size-1);
		System.out.println(S);
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P6) Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).
    If input is "hi" and "hello", then output will be "hihellohi".

import java.util.Scanner;
public class Assignment4_string_day5 {
	public static String concat(String s1,String s2,int sz1, int sz2)
	{
		String newstr;
		if (sz1 < sz2)
		{
			newstr=s1+s2+s1;
			return newstr;
		}
		else
		{
			newstr=s2+s1+s2;
			return newstr;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1=sc.nextLine();
		int size1=str1.length();
		
		System.out.print("Enter string 2: ");
		String str2=sc.nextLine();
		int size2=str2.length();
		
		System.out.println(concat(str1,str2,size1,size2));	
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P7) Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
    If the input is "xHix", then output is "Hi".
    If the input is "America", then the output is "America".

import java.util.Scanner;
public class Assignment5_string_day5 {
	public static String removeX(String s,int sz)
	{
		StringBuilder SB=new StringBuilder("");
		if (s.charAt(0) !='x')
			return s;
		if ((s.charAt(0)=='x') && (s.charAt(sz-1)=='x'))
		{
			for (int i=1;i<sz-1;i++)
				{
					SB.append(s.charAt(i));
				}
		}	
		return SB.toString();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();			
		int size=str.length();
		System.out.println(removeX(str,size));
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P8) Write a Java program that accepts a string (with * in it). The program should return a new string in which the 
    following characters are removed-*,the characters that are to the left and right of *
    Example1)
    i/p:ab*cd
    o/p:ad

import java.util.Scanner;
public class Assignment6_string_day5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();
		int size=str.length();
		StringBuilder Sb=new StringBuilder(str);
	
		for (int i=0;i<size;i++)
		{
			if (str.charAt(i)=='*') 
			{
				Sb.delete(i-1,i+2);
				
			}
		}
		System.out.println(Sb);
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P9) Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a,
    second character of b and so on.
    Any characters left, will go to the end of the result.
    Example1)
    i/p:Hello,World
    o/p:HWeolrllod

import java.util.Scanner;
public class Assignment7_string_day5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1=sc.nextLine();
		int size1=str1.length();
		
		System.out.print("Enter string 2: ");
		String str2=sc.nextLine();
		int size2=str2.length();
		int j=0,k=0;
		StringBuilder Sb=new StringBuilder(" "); 
		
		for (int i=0;i<(size1+size2);i++)
		{
			if (i%2 ==0 )
			{
				Sb.append(str1.charAt(j));
				j++;
			}
			else 
			{
				Sb.append(str2.charAt(k));
				k++;
			}
		}
		System.out.println(Sb);
	}

}



------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P10) Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
     You may assume that n is between 0 and the length of the string, inclusive.
     Example1)
     i/p:Wipro,3
     o/p:propropro
import java.util.Scanner;
public class Assignment8_day5_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int size=str.length();
		
		String str1=str.substring(size-n,size);
		for (int i=0;i<n;i++)
		{
		System.out.print(str1);
		}
		
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------
P11) Given two strings a and b, return a new string, following the rules given below.
     If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
     Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
     Example1)
     i/p:abcXY123XYijk,XY
     o/p:c13i
     Example2)
     i/p:XY123XY,XY
     o/p:13
     Example3)
     i/p:XY1XY,XY
     o/p:11

public class Assignment9_string_day5 {
	public static String xyprint(String str1,String str2,int sz1,int sz2) 
	{	
		StringBuilder Sb=new StringBuilder("");
		for(int i=0;i<sz1;i++)
		{
			if (str1.charAt(i)==str2.charAt(0))
			{
				if (i==0)
					;
				else
					Sb.append(str1.charAt(i-1));
				if (i==sz1-2)
					;
				else
					Sb.append(str1.charAt(i+sz2));
			}
				
		}
		return Sb.toString();
	} 	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1=sc.nextLine();
		int size1=str1.length();
		
		System.out.print("Enter string 2: ");
		String str2=sc.nextLine();
		int size2=str2.length();
		
		System.out.println(xyprint(str1,str2,size1,size2));
	}
}
#######################################################################################################################################################################
