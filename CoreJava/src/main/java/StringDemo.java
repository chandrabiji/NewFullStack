
public class StringDemo {

	public static void main(String[] args) {
		String str = "Hyderabad";
		System.out.println("String Size = "+str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('d'));
		System.out.println(str.contains("bad"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(6, 9));
		str = "Hello "+str;
		System.out.println(str);
		String s1 = "   Hi   ";
		System.out.println(s1);
		System.out.println(s1.trim());
		

	}

}
