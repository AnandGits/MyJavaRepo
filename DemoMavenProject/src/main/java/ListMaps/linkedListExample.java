package ListMaps;

import java.util.LinkedList;

public class linkedListExample {
	public static void main(String[] args) {
	
		LinkedList<String> cars = new LinkedList<String>(); 
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    System.out.println("First Car " + cars.getFirst());
	    System.out.println("Last Car " + cars.getLast());
	    
	}
}
