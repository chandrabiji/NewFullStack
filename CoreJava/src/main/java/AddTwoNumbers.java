import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number ?");
		int firstNumber =sc.nextInt();
		System.out.println("Enter Second Number ?");
		int secondNumber = sc.nextInt();
		int sum = firstNumber+secondNumber;
		System.out.println("Sum of Two Number = "+sum);

	}

}
