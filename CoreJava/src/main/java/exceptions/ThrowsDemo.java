package exceptions;

public class ThrowsDemo {
	
	public void m1()throws ArithmeticException,NullPointerException
	{
		System.out.println(10/0);
	}

	public static void main(String[] args)throws ArithmeticException,NullPointerException {
		ThrowsDemo obj = new ThrowsDemo();
		obj.m1();

	}

}
