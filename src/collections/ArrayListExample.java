package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Sree");
		list1.add("Nidhi");
		list1.add("SRI");
		list1.add("John");
		list1.add("Noe");
		list1.remove(2);
		list1.set(2, "Sree");
		list1.add(0, "Mancha");
		Collections.sort(list1);
		
		System.out.println(list1);
		//System.out.println(list1.size());
		//System.out.println(list1.get(3));
		//for(int index=0; index<list1.size(); index++) {
			//System.out.println(list1.get(index));
		//}
		//for(String name: list1) {
			//System.out.println(name);
		//}
		
ArrayList<Integer> list2=new ArrayList<Integer>();
list2.add(45);
list2.add(56);
System.out.println(list2);

	}

}
