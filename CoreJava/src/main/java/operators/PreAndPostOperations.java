package operators;

public class PreAndPostOperations {

	public static void main(String[] args) {
		System.out.println("---Pre-Increment---");
		int a = 10;
		System.out.println("A = "+a);//10
		int b = ++a;//b = a+1=10+1=11
		System.out.println("B = "+b);//11
		System.out.println("A = "+a);//11
		
		System.out.println("---Post Increment--");
		int p = 6;
		System.out.println("P = "+p);//6
		int q = p++;
		System.out.println("Q = "+q);//6
		System.out.println("P = "+p);//7
		
		System.out.println("--Pre-Decrement--");
		int m = 8;
		System.out.println("M = "+m);//8
		int n = --m;
		System.out.println("N = "+n);//7
		System.out.println("M = "+m);//7
		
		System.out.println("--Post Decrement--");
		
		int x = 4;
		System.out.println("X = "+x);//4
		int y = x--;
		System.out.println("Y = "+y);//4
		System.out.println("X = "+x);//3

	}

}
