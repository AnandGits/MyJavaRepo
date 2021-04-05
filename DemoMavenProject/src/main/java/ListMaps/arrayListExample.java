package ListMaps;

import java.util.ArrayList;
import java.util.Iterator;


public class arrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>(); 
		
		al.add("apple");
		al.add("mango"); 
		al.add("grapes"); 
		al.add("orange"); 
		al.add("apple");
		System.out.println("Contents are:" + al); 
		al.remove(2); 
		System.out.println("After removing contents are:" + al); 
		System.out.println("size of array list:" + al.size()); 
		Iterator<String> itr = al.iterator(); while (itr.hasNext()) 
		{ System.out.println(itr.next());  }
		
		
		String cRepeat="constantinoble";
		for (int i=0; i < cRepeat.length();i ++)
		{System.out.println(cRepeat.charAt(i));}
	}

}
