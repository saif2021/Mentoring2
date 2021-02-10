package listBasic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBasic {

	public static void main(String[] args) {
		// Limiting ArrayList to a certain datatype 
		ArrayList <String> al1=new ArrayList<String>();
		
		// list2 can store any type of object/data
		ArrayList <Object> al2=new ArrayList <Object>();
		
		ArrayList <Object> al3=new ArrayList <Object>();
		
		ArrayList <Object> al4=new ArrayList <Object>();
		
		// Adding elements to al1
		al1.add("saif");
		al1.add("kevin");
		al1.add("james");
		al1.add("sam");
		
		
		//Adding elements to al2
		
		al2.add("saif");
		al2.add(100);
		al2.add(20.5);
		al2.add('S');
		
		// copying one arraylist to another
		al3.addAll(al1);
	
		
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);
		
		
		// Retrieve data by index number
		System.out.println(al2.get(2));
		System.out.println(al2.get(1));
		System.out.println(al3.get(0));
		
		// Update an element
				System.out.println("Before Updating "+al2.get(3));
				al2.set(3, 'F');
				System.out.println("After Updating "+al2.get(3));
				
				
				// Remove an element
				System.out.println("Before removing "+al2);
				al2.remove(1);
				System.out.println("After removing "+al2);
				
			
				// Remove all from an ArraList
				//System.out.println("Before Removing elements :"+al1);
				//al1.removeAll(al1);
				//System.out.println("After removing :"+al1);
				
				
				// verifying presence of an element 
				System.out.println("=======Search for element========");
				System.out.println(al2.contains("saif"));
				System.out.println(al2.contains("kevin"));
				System.out.println(al4.isEmpty());
		
		
		
		
		// Iterating with Basic for LOOP
		System.out.println("======Iterating with Basic for LOOP=========");
		for(int i=0; i<al2.size(); i++ ) {
			System.out.println(al2.get(i));
		}
		
		
		
		// Iterating with each for loop (enhanced for loop)
		
		System.out.println("======Iterating with enhanced for LOOP=========");
		for(Object e:al1) {
			System.out.println(e);
		}
		
		
		
		// Iterating with Iterator
		System.out.println("======Iterating with Iterator=========");
		
		Iterator<String> itr=al1.iterator();
			while(itr.hasNext()) {
		System.out.println(itr.next());
		
			}
		
		
		
		
		
		
		
		
		

	}

}
