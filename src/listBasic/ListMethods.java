package listBasic;

import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {
		
        ArrayList <String> al1=new ArrayList<String>();
		
		// list2 can store any type of object/data
		ArrayList <Object> al2=new ArrayList <Object>();
		
	
		
		// Adding elements to al1
		al1.add("saif"); //0
		al1.add("saif");  //1
		al1.add("saif");  //2
		al1.add("kevin");  //3
		al1.add("james");  //4
		al1.add("sam");    //5
		
		
		//Adding elements to al2
		
		al2.add("saif");
		al2.add(100);
		al2.add(20.5);
		al2.add('S');
		al2.add(null);
		al2.add(null);
		al2.add(null);
		
		
		
		
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al2.get(0));
		
		

	}

}
