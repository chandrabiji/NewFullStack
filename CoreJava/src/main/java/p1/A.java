package p1;

public  class A {
	//Instance Variables
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;

	public static void main(String[] args) {
		A obj = new A();//instance
		System.out.println("A = "+obj.a);
		System.out.println("B = "+obj.b);
		System.out.println("C = "+obj.c);
		System.out.println("D = "+obj.d);

	}

}
