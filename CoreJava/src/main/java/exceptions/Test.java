package exceptions;

public class Test {

	public static void main(String[] args) {
	System.out.println("First Line");
	try {
		System.out.println(10/0);
	}catch(ArithmeticException ae) {
		ae.printStackTrace();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		//System.out.println(e.toString());
		//System.out.println(e.getMessage());
		System.out.println("Some Problem Here");
	}
	System.out.println("Last Line");

	}

}
