package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		while(num<=10) {
			if(num==6) {
				num=num+2;
			break;
			
			}
			System.out.println(num);
			num=num+2;
			
		}

	}

}
