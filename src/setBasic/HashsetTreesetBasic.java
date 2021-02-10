package setBasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashsetTreesetBasic {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		//TreeSet<String> hs=new TreeSet<String>();
		
		//HashSet<Integer> HS=new HashSet<Integer>();
		TreeSet<Integer> HS=new TreeSet<Integer>();
		
		HashSet hs1=new HashSet();
		//TreeSet<Object> hs1=new TreeSet<Object>();
		
		hs1.add("saiful");
		hs1.add(100);
		hs1.add("Mike");
		hs1.add(300);
		hs1.add(25.5);
		
		
		hs.add("Joy");
		hs.add("James");
		hs.add("Ashik");
		hs.add("Becca");
		hs.add("Becca");
		hs.add("charlie");
		
		HS.add(7);
		HS.add(21);
		HS.add(60);
		HS.add(300);
		HS.add(500);
		HS.add(3);
		
		System.out.println(HS);
		System.out.println(hs1);
		
		System.out.println(hs);
		System.out.println(hs.remove("James"));
		System.out.println(hs);
		 
		System.out.println("=====for-each loop====");
		for(String str:hs) {
			System.out.println(str);
		}
		
		System.out.println("=====Iterating using Iterator====");
		
		Iterator <String> itr=hs.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		
	}

}
