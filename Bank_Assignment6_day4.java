//JAVA 10-02-2022 Assignment 6 day 4
/*
 * Create a class called GeneralBank that acts as base class for all banks. 
 * This class has getSavingsInterestRate and getFixedDepositInterestRate methods, 
 * which returns the savings account interest rate and fixed deposit account interest rate that the specific bank gives. 
 * Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
 * Create two subclasses of GeneralBank called ICICIBank and KotMBank. 
 * Override the inherited methods from the base class. The following are the interest rates of these banks.
 * ICICIBank - Savings 4% Fixed 8.5% and
 * KotMBank - Savings 6% Fixed 9%.
 * Create a main method to test the above classes and their methods. Try one by one and observe your findings
 * a) ICICIBank i=new ICICIBank();
 * b) KotMBank k=new KotMBank();
 * c) GeneralBank g=new KotMBank();
 * d) GeneralBank g=new ICICIBank();
 */
abstract class GeneralBank
{
	abstract void getSavingsInterestRate();
	abstract void getFixedDepositInterestRate();
	
}
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
