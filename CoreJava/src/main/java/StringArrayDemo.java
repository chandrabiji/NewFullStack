import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size ?");
		int size = sc.nextInt();
		String[] names = new String[size];
		System.out.println("Enter Array Elements?");
		for(int i=0;i<size;++i)
		{
			names[i]=sc.next();
		}
		System.out.println("String Array Elements are :");
		for(String name:names) {
			System.out.println(name);
		}

	}

}
