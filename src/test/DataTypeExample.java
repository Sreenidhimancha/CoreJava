package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num1=40;
  int num2=20;
  int sum=num1+num2;
  int mul=num1*num2;
  int div=num1/num2;
  //System.out.println(sum);
  System.out.println("This is my Sum " +  sum);
  System.out.println("What is my mul " + mul );
  System.out.println(div);
  
  String str1="Clear World Green World";
  System.out.println(str1);
  //to print frst char
  char ch1=str1.charAt(0);
  System.out.println(ch1);
  System.out.println(str1.length());
  
  //total Lenght
  System.out.println(str1.length());
  //last char
  char chn=str1.charAt(str1.length()-1);
  System.out.println(chn);
	}
	

}
