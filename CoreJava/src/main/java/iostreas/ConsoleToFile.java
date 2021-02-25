package iostreas;

import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFile {

	public static void main(String[] args) throws IOException{
	System.out.println("To Stop Reading type '@");
	FileOutputStream fos = new FileOutputStream("abc.txt");
	int k;
	while((k=System.in.read())!='@') {
		fos.write(k);
	}
	fos.close();

	}

}
