
public class VariablesTypes {

	int b = 20;//instance variable
	static int c = 30;//static variable
	final int d = 40;//final variable
	volatile int e = 50;//volatile variable
	transient int f = 60;//Transient Variable
	public static void main(String[] args) {
		VariablesTypes obj = new VariablesTypes();//Object or Reference/instance
		// Local Variable
		int a = 10;
		System.out.println("A = "+a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+c);
		System.out.println("D = "+obj.d);
		System.out.println("E = "+obj.e);
		System.out.println("F = "+obj.f);

	}

}
