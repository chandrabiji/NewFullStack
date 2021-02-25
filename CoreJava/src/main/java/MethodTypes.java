
public class MethodTypes {
	//instance methods
	public void welcome()
	{
		System.out.println("Welcome to Core Java");
	}
	
	public int add(int i,int j)
	{
		return i+j;
	}

	//static method
	public static void m1()
	{
		System.out.println("From static Method");
	}
	//final method
	public final void m2()
	{
		System.out.println("From Final Method");
	}
	public synchronized void m3()
	{
		System.out.println("From Synchronized Method");
	}
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();//instance
		obj.welcome();
		System.out.println(obj.add(10, 5));
		m1();
		obj.m2();

	}

}
