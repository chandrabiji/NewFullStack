import java.util.Scanner;

public class StringReverse {
	
	public String stringReverse(String input)
	{
		String output = "";
		for(int i=input.length()-1;i>=0;--i) {
			output +=input.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
		StringReverse obj = new StringReverse();//Object or Instance
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String ?");
		String input = sc.next();
	   	System.out.println("Given input String = "+input);
		String output = obj.stringReverse(input);
		System.out.println("Reverse String = "+output);
		if(input.equals(output)) {
			System.out.println("Given String is Plaindrome");
		}else {
			System.out.println("Given String is Not a Plaindrome");
		}
	}

}
