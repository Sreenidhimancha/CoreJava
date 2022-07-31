package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array1= {10, 20, 30, 40, 50};
//total no of elements
System.out.println(array1.length);
//print second number
System.out.println(array1[1]);
//print last number
System.out.println(array1[array1.length-1]);
//to print frst world

String str1 = "Clean World Green World";

String[] array3 = str1.split(" "); 
System.out.println("The first word is " + array3[0]);
//to print last world
System.out.println(array3[3]);

	}

}
