 //JAVA 10-02-2022 Assignment 4
/*Create a base class Fruit with name ,taste and size as its attributes.
 * Create a method called eat() which describes the name of the fruit and its taste.
 * Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
*/

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
public class Fruit_Assignment4_day4 {

	public static void main(String[] args) {
		Apple A=new Apple();
		A.eat();
		Orange O=new Orange();
		O.eat();
	}

}
