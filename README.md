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
Hands on Date : 14-02-2022
------------------------------------------------------------------------------------------------------------------------------------------------

P1) 
Get an input String from user and parse it to integer, if it is not a number it will throw number 
format exception Catch it and print "Entered input is not a valid format for an integer." 
or else print the square of that number. (Refer Sample Input and Output).
Sample input and output 1:
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.

Solution)

import java.util.Scanner;
public class Assignment1_14feb 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a integer :");
	try
	{
		String Str=sc.nextLine();
		int num=Integer.parseInt(Str);
		System.out.println("The square vale is : "+Math.pow(num,2));
		System.out.println("The work has been done successfully");
		
	}catch(NumberFormatException N)
	{
		
		System.out.println("Entered input is not a valid format for an integer");
	}	
	}
}

--------------------------------------------------------------------------------------------------------------------------------------------------
P2) 
Write a program that takes as input the size of the array and the elements in the array. The program then asks 
the user to enter a particular index and prints the element at that index.
This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. 
In the catch block, print the class name of the exception thrown.
Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed
Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException

Solution)
import java.util.Scanner;
public class Assignment2_14feb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();
		int [] array=new int[size];
		System.out.println("Enter array Elements :");
		for (int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		try 
		{
			System.out.println("Enter the index you want to access :");
			int idx=sc.nextInt();
			System.out.println("The array element at index "+idx+" : "+ array[idx]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println(aiobe);
		}	
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------
P3)
Write a program that takes as input the size of the array and the elements in the array. 
The program then asks the user to enter a particular index and prints the element at that index. 
Index starts from zero.
This program may generate Array Index Out Of Bounds Exception or NumberFormatException . 
Use exception handling mechanisms to handle this exception.

Sample Input and Output 1:

Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
1
The array element at index 1 = 80
The array element successfully accessed

 Sample Input and Output 2:

Enter the number of elements in the array
2
Enter the elements in the array
50
80
Enter the index of the array element you want to access
9
java.lang.ArrayIndexOutOfBoundsException

 Sample Input and Output 3:

Enter the number of elements in the array
2
Enter the elements in the array
30
j
java.lang.NumberFormatException

Solution)

import java.util.Scanner;
public class Assignment3_14feb 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int size=sc.nextInt();
		int [] array=new int[size];
		try
		{
			System.out.println("Enter array Elements :");
			for (int i=0;i<size;i++)
			{
				array[i]=Integer.parseInt(sc.next());
			}
			
			System.out.println("Enter the index you want to access :");
			String Str=sc.next();
			int num=Integer.parseInt(Str);
			System.out.println("The array element at index "+num+" : "+ array[num]);
			System.out.println("The array element successfully accessed");	
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException N)
		{
			System.out.println(N);			
		}
	}
}

--------------------------------------------------------------------------------------------------------------------------------------------------
P4) 
Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array 
and obtain the sum and average of all the elements and display the result.
Various exceptions that may arise like ArithmeticException, 
NumberFormatException, and so on should be handled.

Solution)

public class MathOperation_14feb 
{
	public static void main(String[] args) 
	{		
		int S = 0;
		int[] array =new int[5];
		float A = 0.0f;
		try 
		{	
			System.out.println("Enter array Elements :");
			for (int i=0;i<5;i++)
			{
				array[i]=Integer.parseInt(args[i]);   //PARSEINT			
			}
			for (int i=0;i<5;i++)
			{
				S=S+array[i];
			}
		A=(float)S/5;
		System.out.println("Sum :"+ S + " Average : "+A);
		System.out.println("Perfect Operation");
		}		
		catch(Exception A1)
		{
			System.out.println("Exception NAME -> :"+A1);
		}	
	}
}

-------------------------------------------------------------------------------------------------------------------------------------------------

P5)
Write a Program with a division method which receives two integer numbers and performs the division operation.
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.

Solution)

import java.util.Scanner;
public class Assignment5_14feb {
	public static void division(int x,int y)
	{
		int c=0;
		try 
		{
			c=x/y;
			System.out.println("Division is : "+c);
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int inp1=sc.nextInt();
		System.out.println("Enter second Number: ");
		int inp2=sc.nextInt();
		division(inp1,inp2);		
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------
P6)
Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program.

In the same Program write your own Exception classes to take care of Negative values and values out of range 
(i.e. other than in the range of 0-100)

Solution)

import java.util.Scanner;
class myexceptions extends Exception
{
	public myexceptions(String s)
	{
		super(s);
	}
}
public class Assignment6_14feb 
{	
	public static void main(String[] args)
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter name of student 1 :");
			String s1=sc.nextLine();
			System.out.println("Enter marks of 3 subject of "+s1);
			int[] n1=new int[3];
			int[] n2=new int[3];
			String s=null;			
			for (int i=0;i<3;i++)
			{
				s=sc.next();
				n1[i]=Integer.parseInt(s);
				if (n1[i] < 0)
					throw new myexceptions("No negative value is allowed");
				else if ( n1[i] > 100)
					throw new myexceptions("Value out of range");
			}
			sc.nextLine();
			System.out.print("Enter name of student 2 :");
			String s2=sc.nextLine();
			System.out.println("Enter marks of 3 subject of "+s2);
			s=null;
			for (int i=0;i<3;i++)
			{
				s=sc.next();
				n2[i]=Integer.parseInt(s);
				if (n2[i] < 0)
					throw new myexceptions(s);
				else if ( n2[i] > 100)
					throw new myexceptions(s);
			}			
			System.out.println("success");
		}
		catch(NumberFormatException Nfe)
		{
			System.out.println("Exception Detected "+Nfe);
		}
		catch(myexceptions N)
		{
			System.out.println("Exception Detected "+N);
		}
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------
P7) 
A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. 
If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India cannot be registered”

Example2)
i/p:Mini,India
o/p:User registration done successfully

Solution)

class InvalidCountryException extends Exception
{
	InvalidCountryException(String S)
	{
		super(S);
	}
}

public class UserRegistration 
{
	public static void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if (userCountry.equals("India")) 
		{
			System.out.println("User registration done successfully");
		}else
			throw new InvalidCountryException("User Outside India cannot be registered");
	}
	public static void main(String[] args) 
	{
		try 
		{
			registerUser("Mini","India");
		} 
		catch (InvalidCountryException ICE) 
		{
			System.out.println(ICE);
		}
	}
}

---------------------------------------------------------------------------------------------------------------------------------------------
P8)
Write a program to accept name and age of a person from the command prompt
(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
Display proper error messages.
The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)

Solution)

class ageexception extends Exception
{
	ageexception(String S)
	{
		super(S);
	}
}
public class Assignment8_14feb 
{
	public static void main(String[] args) 
	{
		 String name=args[0];
		 int age=Integer.parseInt(args[1]);
		 try 
		 {
			 if ((age>=18) && (age<60))
			 {
				 System.out.println("You Entered Proper Argument");
			 }
			 else
				 throw new ageexception("Entered Argument is not proper");
		 }
		 catch (ageexception a)
		 {
			 System.out.println(a);
		 }		   
	}
}


---------------------------------------------------------------------------------------------------------------------------------------------

P9) 
Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception.

In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
Example1)
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block
Example2)
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block

Solution)

import java.util.Scanner;
public class Assignment9_14feb 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int inp1=sc.nextInt();
		int inp2=sc.nextInt();
		try 
		{
			int div=inp1/inp2;
			System.out.println("The Quotient of "+inp1+"/"+inp2+" = "+div);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("DivideByZeroException caught ");
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
}


################################################################################################################################################
Hands on Date : 15-02-2022
------------------------------------------------------------------------------------------------------------------------------------------------


P1) 
Write a Java program to create an ArrayList, add all the months of a year and print the same.

Solution)

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

------------------------------------------------------------------------------------------------------------------------------------------------

P2) 
Create an ArrayList that can store only Strings.
Create a printAll method that will print all the elements of the ArrayList

Solution)
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

------------------------------------------------------------------------------------------------------------------------------------------------

P3)
Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.

Solution)

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
		} 
                catch (Exception E) 
		{
			System.out.println("Exception Detected "+E);
		}
		System.out.println(list);
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P4)
Implement the assignment P1 using Linked List

Solution)
import java.util.*;
public class Assignment4_15feb 
{
	public static void main(String[] args) 
	{
		List <String> list=new LinkedList<>();
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
		
		Iterator <String>it=list.iterator();
		 while(it.hasNext())
		 System.out.println(it.next());
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P5)
Implement the assignment P1 using Vector

Soution)
import java.util.*
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

------------------------------------------------------------------------------------------------------------------------------------------------

P6)
Write a program that will have a Vector which is capable of storing Employee objects. Use an Iterator and enumeration to 
list all the elements of the Vector.

Solution)
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
			System.out.println(it.next());
		
		System.out.println("----------------------------");
	
	//Enumeration 
		Enumeration Enum=v.elements();
		while (Enum.hasMoreElements())
			System.out.println(Enum.nextElement());
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P7)
Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :

i) int empId
ii)String empName
iii)String email
iv)String gender
v)float salary
vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.

(i)ArrayList list;
ii) boolean addEmployee(Employee e) -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId) ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId
Provide implementation for all the methods and test your program.



Solution)

public class Employee {
	private int EmpId; 
	private String EmpName;
	private String EmpEmail; 
	private char EmpGender;
	private float EmpSalary;
	
	public Employee() {}

	public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpEmail = empEmail;
		EmpGender = empGender;
		EmpSalary = empSalary;
	}

	public String GetEmployeeDetails() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail 
				+ ", EmpGender=" + EmpGender + ", EmpSalary=" + EmpSalary + "]";
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	public char getEmpGender() {
		return EmpGender;
	}
	public void setEmpGender(char empGender) {
		EmpGender = empGender;
	}
	public float getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(float empSalary) {
		EmpSalary = empSalary;
	}	
}


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	List<Employee> empDb = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return empDb.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = empDb.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String pSlip = "Invalid employee id";
		
		for (Employee e : empDb) {
			if (e.getEmpId() == empId) {
				pSlip = "Pay slip for employee id " + empId + " is " +
						e.getEmpSalary();
			}
		}

		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[empDb.size()];
		for (int i = 0; i < empDb.size(); i++)
			empArray[i] = empDb.get(i);
		return empArray;
	}
	
}


import com.w3epic.wiprotraining.assignment2.bean.Employee;
import com.w3epic.wiprotraining.assignment2.bean.EmployeeDB;

public class  Assignment7_employee{

	public static void main(String[] args) {
		EmployeeDB eDb = new EmployeeDB();
		
		Employee emp1 = new Employee(11, "Bhaskar", "bha@gw.com", 'M', 2400550);
		Employee emp2 = new Employee(12, "Ankita Sharma", "ankt@kumar.com", 'F', 30000);
		Employee emp3 = new Employee(13, "Rahul", "rhul@gmail.com", 'M', 10000);
		Employee emp4 = new Employee(14, "Meghna", "mg@iiit.com", 'F', 30000);
		
		eDb.addEmployee(emp1);
		eDb.addEmployee(emp2);
		eDb.addEmployee(emp3);
		eDb.addEmployee(emp4);

		for (Employee emp : eDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		eDb.deleteEmployee(102);
		
		for (Employee emp : eDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(eDb.showPaySlip(103));
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------

P8)
Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) , 
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.
NOTE: You can test the methods using a main method.

Solution)

import java.util.HashSet;
import java.util.*;

class Country
{
	HashSet<String> H1=new HashSet();
	public HashSet<String> saveCountryNames(String CountryName)
	{
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName)
	{
		Iterator it=H1.iterator();
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

public class Assignment8_15feb 
{
	public static void main(String[] args)
	{
		Country c=new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("Pakistan");
		c.saveCountryNames("China");

		System.out.println(c.getCountry("India"));
		System.out.println(c.getCountry("Pakistan"));
		System.out.println(c.getCountry("China"));
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P9)
Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.

Solution)

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
					System.out.print(it.next()+" ");			
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P10)
Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :

a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.

Solution)

import java.lang.reflect.Array;
import java.util.*;
public class Assignment10_15feb 
{
	public static void main(String[] args) 
	{
		Set <String> T=new TreeSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements into a Tree set :");
		for (int i=0;i<5;i++)
		{
			T.add(sc.next());
		}
		System.out.println("Original Treeset : ");
		Iterator <String> it=T.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next()+" ");
			
		}
		System.out.println(" ");
		sc.nextLine();
		System.out.println("Enter string you want to search :");
		String Str=new String(sc.nextLine());
		if (T.contains(Str))
		{
			System.out.println("YES ! Treeset contains element :"+Str);
		}
		else
		{
			System.out.println("NO ! Treeset doesnot contains element :"+Str);
		}
		System.out.println(" ");
		String[] arr=new String[T.size()];
		arr=T.toArray(arr);
		System.out.println("Reversed Treeset :");
		for (int i=T.size()-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}		
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P11)
Implement the assignment (P8) using TreeSet

Solution)
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


################################################################################################################################################
Hands on Date : 16-02-2022
------------------------------------------------------------------------------------------------------------------------------------------------

P1)
1.Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , 
the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo
2.
Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3.
Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4.
Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital Value – Country
Delhi India
Tokyo Japan
5.
Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.

NOTE: You can test the methods using a main method.

Solution)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class CountryMap 
{
	private HashMap<String, String> M1;	
	public CountryMap()
	{
		M1 = new HashMap<String, String>();
	}
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital)
	{
		M1.put(CountryName, capital);
		return M1;
	}
	public String getCapital(String CountryName) 
	{
		return M1.get(CountryName);  
	}
	
	public String getCountry(String capitalName) 
	{
		Set<Map.Entry<String, String>> set = M1.entrySet();
		
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}	
		return null;
	}
	public HashMap<String, String> swapKeyValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}	
		return M2;
	}	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
}
public class Assignment1 
{
	public static void main(String[] args) 
	{
		CountryMap cM = new CountryMap();

		cM.saveCountryCapital("India", "Delhi");
		cM.saveCountryCapital("Pakistan", "Islamabad");
		cM.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(cM.getCapital("India"));
		System.out.println(cM.getCountry("Washington, D.C."));
		System.out.println(cM.toArrayList());
		
		HashMap<String, String> M2 = cM.swapKeyValue();
		System.out.println(M2);
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P2)
Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.

Solution)

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		HashMap <Integer,String> m1=new HashMap();
		m1.put(1, "string1");
		m1.put(2, "string2");
		m1.put(3, "string3");
		m1.put(4, "string4");
		m1.put(5, "string5");
		m1.put(6, "string6");
		Scanner sc=new Scanner(System.in);
		//a>
		System.out.println("Enter key you want to check (exist or not) :");
		int key=sc.nextInt();
		boolean k=m1.containsKey(key);
		if (k)
		{
			System.out.println("Key Exist !");
		}else
		{
			System.out.println("Key Does Not Exist !");
		}
		
		//b>
		sc.nextLine();
		System.out.println("Enter value you want to check (exist or not) :");
		String value=sc.nextLine();
		boolean s=m1.containsValue(value);
		if (s)
		{
			System.out.println("Value Exist !");
		}else
		{
			System.out.println("Value Does Not Exist !");
		}
		
		System.out.println("---------MAP---------");
		
		//c> Traversing a Map
		for (Map.Entry <Integer,String> m: m1.entrySet())
		{
			System.out.print(m.getKey()+" : "+m.getValue());
		}
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P3)
Write a program that will have a Properties class object which is capable of storing some States of India and their Capital. 
Use an Iterator to list all the elements stored in the Properties.

Solution)

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Assignment3 
{
	public static void main(String[] args) 
			{
				Properties pro = new Properties();
				
				pro.setProperty("Uttar Pradesh", "Lucknow");
				pro.setProperty("Rajasthan", "Jaipur");
				pro.setProperty("Bihar", "Patna");
				pro.setProperty("Madhya Pradesh", "Bhopal");
				pro.setProperty("Telengana","Hyderabad");
				

				Set<Entry<Object, Object>> set = pro.entrySet();
				Iterator<Entry<Object, Object>> it = set.iterator();
				while (it.hasNext()) 
				{
					Entry<Object, Object> me = it.next();
					System.out.println(me);
				}
			}

}
------------------------------------------------------------------------------------------------------------------------------------------------

P4) 
Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.

Solution)
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		HashMap <String,Integer> ContactList=new HashMap();
		ContactList.put("Bhaskar",1001);
		ContactList.put("Meghna",1002);
		ContactList.put("Rohan",1003);
		ContactList.put("Manoj",1004);
		ContactList.put("Das",1005);

		System.out.println("Enter contact name you want to check (exist or not) :");
		String key=sc.nextLine();
		boolean k=ContactList.containsKey(key);
		if (k)
		{
			System.out.println("Contact Name Exist !");
		}else
		{
			System.out.println("Contact Name Does Not Exist !");
		}
		
		//b>
		sc.nextLine();
		System.out.println("Enter contact number you want to check (exist or not) :");
		int value=sc.nextInt();
		boolean s=ContactList.containsValue(value);
		if (s)
		{
			System.out.println("Contact Number Exist !");
		}else
		{
			System.out.println("Contact Number Does Not Exist !");
		}
		
		System.out.println("---------MAP---------");
		//c> Traversing a Map
		Set<Entry<String, Integer>> set = ContactList.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) 
		{
			Entry<String, Integer> me = it.next();
			System.out.println(me);
		}	
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------
P5)
Implement the assignment 1 using TreeMap.


Solution)

public class CountryMap {
	private TreeMap<String, String> M1;
	
	public CountryMap() {
		M1 = new TreeMap<String, String>();
	}
	
	public TreeMap<String, String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName, capital);
		return M1;
	}
	
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	public TreeMap<String, String> swapKeyValue() {
		TreeMap<String, String> M2 = new TreeMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
}


import java.util.HashMap;
public class Assignment5 {

	public static void main(String[] args) {
		CountryMap cM = new CountryMap();

		cM.saveCountryCapital("India", "Delhi");
		cM.saveCountryCapital("Pakistan", "Islamabad");
		cM.saveCountryCapital("Bhutan", "thimphu");
		
		System.out.println(cM.getCapital("India"));
		System.out.println(cM.getCountry("thimphu"));
		System.out.println(cM.toArrayList());
		
		HashMap<String, String> M2 = countryMap.swapKeyValue();
		System.out.println(M2);
	}

}

------------------------------------------------------------------------------------------------------------------------------------------------

P6)
Implement the assignment 1 using HashTable.

------------------------------------------------------------------------------------------------------------------------------------------------

P7)
Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.

Solution)
public class Assignment7 
{
	public static void main(String[] args) 
	{
		Thread Th1 = new Thread("Scooby") 
		{
			public void run() 
			{
				System.out.println(Thread.currentThread().getName());	
				}
		};
		
		Thread Th2 = new Thread("Shaggy") 
		{
			public void run() 
			{
				System.out.println(Thread.currentThread().getName());
				}
		};
			
		Th1.start();
		Th2.start();
	}
}

------------------------------------------------------------------------------------------------------------------------------------------------

P8)
Store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnable interface

Solution)
public class Assignment8 implements Runnable
{
	String colours[]={"white","blue","black","green","red","yellow"};
	public void run()
	{
		int index=(int)(Math.random()*5);
		System.out.println(index);
		while (colours[index] != ("red"))
		{
		
			System.out.println(colours[index]);
			index=(int)(Math.random()*5);
			System.out.println(index);
		}
	}
	public static void main(String[] args)
	{
		Assignment8 mt=new Assignment8();
		Thread th=new Thread(mt);
		th.start();
	}
}           


################################################################################################################################################

Hands on Date : 17-02-2022
------------------------------------------------------------------------------------------------------------------------------------------------

P1) 
Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6

Solution)
class threading extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if (i==6) 
			{
				try { Thread.currentThread().sleep(5000);} catch (InterruptedException e) { e.printStackTrace();}
			}
			System.out.println(i);
		}
	}
}
public class Assignment1 
{	 
	public static void main(String args[])
	{
		threading mt=new threading(); //ready
		mt.start(); //running
	}
}           
		
------------------------------------------------------------------------------------------------------------------------------------------------

P2) 
Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers

Hint: use join

Solution)
public class Assignment2 implements Runnable {
	static Thread Tho;
	static Thread The;

	@Override
	public void run() 
	{	
		try 
		{if (Thread.currentThread().getName().equals("Tho")) {The.join();}} catch (InterruptedException e) {e.printStackTrace();}
		
		for (int i = 1; i <= 20; i++) 
		{
			if (Thread.currentThread().getName().equals("The")) 
			{
				if (i % 2 == 0) System.out.print(i+" ");
			} 
			if (Thread.currentThread().getName().equals("Tho")) 
			{
				if (i % 2 == 1) System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Assignment2 A = new Assignment2();
		Tho = new Thread(A);
		The = new Thread(A);
		
		Tho.setName("Tho");
		The.setName("The");

		Tho.start();
		The.start();
	}
}
		
------------------------------------------------------------------------------------------------------------------------------------------------
P3)
Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time. Observe the completion of the threads.

Solution)
public class Assignment3 implements Runnable
{
	public static void main(String[] args) 
	{
		Assignment3 a= new Assignment3();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		
		t1.setName("th1");
		t2.setName("th2");
		t3.setName("th3");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName()+ ": " + i+" ");		
	}

}		
------------------------------------------------------------------------------------------------------------------------------------------------

P4)
Write a java program that connects to MySQL database, queries the inbuilt table “emp” and 
displays the first two columns (empno using column index and ename using column name ) of all the rows.

Solution)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC_try1 {

	public static void main(String args[]){
	try{

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SamSung","root","root"); 

	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from emp");
	while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	con.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
 		
------------------------------------------------------------------------------------------------------------------------------------------------

P5)
Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. Display the columns ename, job, sal and comm.
		
Solution)
mport java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC_try2 {

	public static void main(String args[]){
	try{

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SamSung","root","root"); 

	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from emp where sal > 1000 and sal <2000");
		while(rs.next()) 
			System.out.println(rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(6)+" "+rs.getString(7));
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}

------------------------------------------------------------------------------------------------------------------------------------------------

P6)
Inserting a record
ABC International School wants to computerize students details. The school maintains a database of students in Oracle.
The student table contains information related to students and is shown in the following student table structure.
Column Name Type Constraint
Rollno Number (4) Primary Key
StudentName Varchar (20) Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date
Fees Number (9,2)
 When a new student joins the school, the student record is inserted in the student table. The valid student details are as follows:
• Rollno: Valid value is a 4-digit number
• StudentName: Valid value can contain maximum 20 letters in uppercase
• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Write a Java program to insert some records to the table

Solution)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		
		try 
		{
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaskar","root","root"); 
		} 
		catch (ClassNotFoundException e) 
			{
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();
			
			try {
				rollno = Integer.parseInt(rollstr);
				if (String.valueOf(rollno).length() != 4) rollno = 0;
			} catch (Exception e) {}
		} while (rollno == 0);
		
		String studentName = "";
		boolean lowercasefound;
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();
			
			lowercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}
			
		} while (studentName.length() > 20 || lowercasefound);
		
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		List<String> list = new ArrayList<>(Arrays.asList(standards));
		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));

		System.out.print("Enter D.O.B.: ");
		String dob = sc.nextLine();
		
		Double fees = 0.0;
		do {
			System.out.print("Enter fees: ");
			if (sc.hasNextDouble())
				fees = sc.nextDouble();
		} while (fees == 0.0);
		
		
		// inserting data into db
		String sql = "insert into stdnt values(?, ?, ?, ?, ?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, rollno);
			ps.setString(2, studentName);
			ps.setString(3, standard);
			ps.setString(4, dob);
			ps.setDouble(5, fees);
			ps.executeQuery();
			System.out.println("Student added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error");
			ps.close();
			con.close();
		}			
		sc.close();
	}
}
----------------------------------------------------------------------------------------------------------------------------------------------
P7)
Deleting a Student’s record When a student leaves the school, the record related to that student needs to be deleted from the Student table.
The student’s roll no, whose record has to be deleted, should be passed as a command line argument.
Upon deletion, the Student details must be stored in another table named StudentLog which will maintain the details such as Rollno, 
StudentName, Standard and Leaving_date.

Solution)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "";
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaskar","root","root"); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = Integer.parseInt(args[0]);
		
		try {
			
			sql = "INSERT INTO stdnt_log SELECT * FROM stdnt WHERE rollno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, rollno);
			int og = ps.executeUpdate();
			
			
			sql = "DELETE FROM stdnt WHERE rollno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, rollno);
			
			if (ps.executeUpdate() == 1 && og == 1)
				System.out.println("Student having rollno = " + rollno + " deleted successfully");
			else
				System.out.println("Error");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		sc.close();
	}

}
--------------------------------------------------------------------------------------------------------------------------------------------
P8)
Modification of Student record
When there is a change in the fee to be paid by a student, the respective row should be appropriately updated. 
Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in the table for that particular student.

Solution)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "";
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaskar","root","root"); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = Integer.parseInt(args[0]);
		double fees = Double.parseDouble(args[1]);
		
		try {			
			sql = "UPDATE stdnt SET fees = ? WHERE rollno = ?";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, fees);
			ps.setInt(2, rollno);
			
			if (ps.executeUpdate() == 1)
				System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
			else
				System.out.println("Error");
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		sc.close();
	}
}

---------------------------------------------------------------------------------------------------------------------------------------

P9)
Display Student details
Write the code to display details of all the students, if no roll no. is passed, while executing the main program.
If while executing the main program, the roll no. is passed, then it should display the record of that particular student.

Solution)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "";
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaskar","root","root"); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int rollno = 0;
		try {
			rollno = Integer.parseInt(args[0]);
		} catch (Exception e) {}
		
		
		try {			
				if (rollno != 0)
				sql = "SELECT * FROM stdnt WHERE rollno = ?";
			else 
				sql = "SELECT * FROM stdnt";
			
			ps = conn.prepareStatement(sql);
			if (rollno != 0) ps.setInt(1, rollno);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				int ROLLNO = rs.getInt("ROLLNO");
				String STUDENTNAME = rs.getString("STUDENTNAME");
				String STANDARD = rs.getString("STANDARD");
				String DATE_OF_BIRTH = rs.getString("DATE_OF_BIRTH");
				double FEES = rs.getDouble("FEES");
				
				System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + 
						" " + DATE_OF_BIRTH + " " + FEES);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		sc.close();
	}
}


################################################################################################################################################

Hands on Date : 18-02-2022
------------------------------------------------------------------------------------------------------------------------------------------------

Develop a jdbc program containing main method, which should instantiate a class called DAOClass, which should contain methods called insert, delete, modify and display. Description of what each of these methods are expected to do is given below. Necessary details required for executing these methods, are passed from command line argument. For e.g. If the name of the class containing the main method is JDBCCalls, then if you want to insert a record, you will execute this class as 
java JDBCCalls 1 101 “Ajit” “IV” “20-Nov-2001” 4000
Where 1 is the option for inserting the record and all other details are the values for the columns in each row of the student table. The structure of student table is given below. Similarly, for deleting a record, you have to execute the code as 
 
java JDBCCalls 2 101
 
where 2 is the option for deleting a record and 101 is the rollno of the student, whose record has to be deleted.
For modifying a record, you will use
java JDBCCalls 3 101 4500, where 3 is the option for modifying a record and the 4500 is the new fee which needs to replace the old fee value.
For Displaying records, if the main class is executed as follows 
 
java JDBCCalls 4 101
it should display only one record, that of the student with roll no. 101. 4 option is for displaying the record. 
If the main class is executed as
java JDBCCalls 4 (without specifying the rollno.), it means that details of all the students should be displayed.

Solution)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaskar","root","root"); 
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception Detected "+e);
		} catch (SQLException e) {
			System.out.println("SQL Exception Detected "+e)
		}
		
		return con;
	}
}


public class JDBCCalls {

	public static void main(String[] args) {
		int choose = Integer.parseInt(args[0]);
		DAOClass Dclass = new DAOClass();
		
		switch (choose) {
		case 1: 
			int rollno = Integer.parseInt(args[1]);
			String name = args[2];
			String grade = args[3];
			String dob = args[4];
			int fee = Integer.parseInt(args[5]);
			
			if (Dclass.insert(rollno, name, grade, dob, fee))
				System.out.println("Inserted successfully");
			else 
				System.out.println("Insertion error");
			break;
			
		case 2: 
			rollno = Integer.parseInt(args[1]);
			
			if (Dclass.delete(rollno))
				System.out.println("Deleted successfully");
			else 
				System.out.println("Deletion error");
			
			break;
			
		case 3: 
			rollno = Integer.parseInt(args[1]);
			fee = Integer.parseInt(args[2]);
			
			if (Dclass.modify(rollno, fee))
				System.out.println("Modified successfully");
			else 
				System.out.println("Modification error");
			break;
			
		case 4: 
			try {
				rollno = Integer.parseInt(args[1]);
				Dclass.display(rollno);
				break;
			} catch (Exception e) {
				Dclass.display();
				break;
			}
			
			
		}

	}

}

---------------------------------------------------------------xxx---------------------------------------------------------------------------

