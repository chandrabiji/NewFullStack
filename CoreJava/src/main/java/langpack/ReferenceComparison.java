package langpack;

public class ReferenceComparison {

	public static void main(String[] args) {
		String s1="Hello";
		String s2 ="Hello";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1==s2) {
			System.out.println("S1 and S2 are Equals");
		}else {
			System.out.println("S1 and s2 are Not Equals");
		}
	}

}
