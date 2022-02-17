package COLLECTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Adding numbers in a array list and sort using Comaparator interface
 */

class compl implements Comparator <Integer>
{
	public int compare(Integer o1, Integer o2) 
	{
		if (o1>o2)  //Ascending order sorting 
			return 1;
		return -1;
	}
	
	/*public int compare(Integer o1, Integer o2) 
	{
		if (o1%10>o2%10)  //sorting with last digit of entered number 
			return 1;
		return -1;
	}
	*/
}

public class ComparatorClass 
{
	public static void main(String[] args) 
	{	
		Comparator <Integer> com= new compl();
		ArrayList <Integer> val=new ArrayList<>();
		val.add(15);
		val.add(92);
		val.add(89);
		val.add(23);
		val.add(10);
		
		
		/*using lamda expression
		 * --------------------------------------------
		 * Comparator <Integer> com=(o1,o2) ->
		 * {
		 *    if (o1>o2)
		 *        return 1;
		 *    return -1;
		 * }
		 * ---------------------------------------------
		 * 
		 * or
		 * 
		 * ---------------------------------------------
		 * Comparator <Integer> com=(o1,o2) ->
		 * { return (o1>o2) ? 1:-1 ; }
		 * ---------------------------------------------
		 */
		System.out.println(val);
		Collections.sort(val, com);
		/* or
		 * In a single line
		 * ----------------------------------------------
		 * Collections.sort(val, (o1,o2)-> { return (o1>o2> ? 1:-1});
		 ------------------------------------------------
		 */
		
		System.out.println(val);
	}

}
