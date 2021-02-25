package flowcontrolls;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number ?");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Given Number is Even Number");
		}else {
			System.out.println("Given Number is Odd Number");
		}

	}

}
