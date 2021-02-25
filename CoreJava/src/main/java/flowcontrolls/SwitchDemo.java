package flowcontrolls;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. One");
		System.out.println("2. Two");
		System.out.println("3. Three");
		System.out.println("4. Four");
		System.out.println("5. Five");
		System.out.println("Enter Your Number ?");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("1 = One");
		       break;
		case 2:System.out.println("2 = Two");
		       break;
		case 3:System.out.println("3 = Three");
		       break;
		case 4:System.out.println("4 = Four");
		       break;
		case 5:System.out.println("5 = Five");
		       break;
		default:System.out.println("Please select Your choice range 1-5 only");       
		}

	}

}
