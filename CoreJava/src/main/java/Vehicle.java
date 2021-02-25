import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Vechile Travel Distance ?");
	double distance = sc.nextDouble();
	System.out.println("Enter Your Vechile Trevel Time ?");
	double time = sc.nextDouble();
	double speed = distance/time;
	System.out.println("Your Vechile Speed = "+speed+" kmp/hr");

	}

}
