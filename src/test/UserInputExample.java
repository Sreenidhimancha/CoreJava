package test;

import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=scanner.nextInt();
		if(num%2==0) {
			System.out.println("Even");
			
		}
		else {
			System.out.println("odd");
		}
			}

	}


