package exceptions;

import java.util.Scanner;

class TooYoungException extends RuntimeException
{
	TooYoungException(String msg){
		super(msg);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String msg){
		super(msg);
	}
}
public class TestAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age ?");
		int age = sc.nextInt();
		if(age<18) {
			throw new TooYoungException("You have to wait some more time for voting ");
		}else if(age>60) {
			throw new TooOldException("You have take care because of COVID");
		}else {
			System.out.println("Welcome to Voting System");
		}

	}

}
