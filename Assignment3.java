package MAP_16feb;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Assignment3 {
	public static void main(String[] args) {
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