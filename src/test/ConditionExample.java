package test;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		if(age>=18){
			System.out.println("Eligible for Vote");
		}else if(age==17){
			System.out.println("Sorry try again next year");
		}
		else {
			System.out.println("Not eligible for Vote");
		}
	}
}

	
