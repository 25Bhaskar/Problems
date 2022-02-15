//JAVA Assignment1 day 5:  11-02-2022
/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string 
 * where 'n' is the length of the string.
 * Example1)
 * i/p:Wipro
 * o/p:WiWiWiWiWi
*/
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
