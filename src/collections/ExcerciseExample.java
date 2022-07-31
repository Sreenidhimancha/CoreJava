package collections;

import java.util.ArrayList;

public class ExcerciseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Sree");
		list1.add("Nidhi");
		list1.add("Priyanka");
		list1.add("John");
		list1.add("Noe");
		for(int index=0; index<list1.size(); index++) {
			if(list1.get(index).equals("Nidhi")) {
				System.out.println(index);
				break;
			}
		}
		
	
	}

}
