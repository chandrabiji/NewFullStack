package langpack;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
		//Primitive to String
		
		int a = 10;//Primitive
		String s1 = Integer.toString(a);//String 

		//Wrapper to String
		
		Integer i1 = new Integer(20);//Wrapper Object
		String s2 = i1.toString();//String
		System.out.println(s1+s2);//10+20=1020
		System.out.println(a+i1);//10+20=30
		
		//Primitive to Wrapper Object
		
		int b = 30;//primitive
		Integer i2 = Integer.valueOf(b);//Wrapper Object
	}

}
