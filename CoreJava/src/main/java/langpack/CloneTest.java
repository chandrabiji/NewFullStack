package langpack;

public class CloneTest implements Cloneable{
	
	public int a = 10;
	public int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
	CloneTest t1 = new CloneTest();
	System.out.println("A = "+t1.a);
	System.out.println("B = "+t1.b);
	CloneTest t2 = (CloneTest) t1.clone();
	t2.a=100;
	t2.b=200;
	System.out.println("Clone Object A = "+t2.a);
	System.out.println("Clone Object B = "+t2.b);
	System.out.println("A = "+t1.a);
	System.out.println("B = "+t1.b);
	
	}

}
