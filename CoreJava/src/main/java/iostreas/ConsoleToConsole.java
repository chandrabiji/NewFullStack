package iostreas;

import java.io.IOException;

public class ConsoleToConsole {

	public static void main(String[] args)throws IOException {
		System.out.println("To Stop Reading data from console type '@");
		int k;
		while((k=System.in.read())!='@') {
			System.out.print((char)k);
		}

	}

}
