package ListMaps;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> ht = new Hashtable<String, String>(); 
		ht.put("player 1", "Curry"); 
		ht.put("player 2", "Green");
		ht.put("player 3", "McGee"); 
		Enumeration<String> values = ht.keys(); 
		while (values.hasMoreElements()) 
		{ String str = (String) values.nextElement();
		System.out.println(str + ":" + ht.get(str)); }
		
		//Find the repeating Characters

		String cRepeat="constantinoble";
		final String cF="Found";
		Hashtable<String, String> ht1 = new Hashtable<String, String>(); 
		
		for (int i=0; i < cRepeat.length();i ++)
		{
			String s = String.valueOf(cRepeat.charAt(i));
			if (ht1.get(s)==cF) {
				System.out.println(" Found " + s + " at " + i);
			}
			else {
				ht1.put(s,cF);
			}
		}
		
	}

}
