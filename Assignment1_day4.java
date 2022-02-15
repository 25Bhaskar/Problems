//JAVA 10-02-2022 : Assignment 1
/* Create a class named ‘Animal’ which includes methods like eat() and sleep().
 * Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
 * Create an instance of Animal class and invoke the eat and sleep methods using this object.
 * Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
 */

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
