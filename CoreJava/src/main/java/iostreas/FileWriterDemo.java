package iostreas;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args)throws IOException {
	FileWriter fw = new FileWriter("wc.txt");
	fw.write(65);
	fw.write("\n");
	char[] ch = {'a','b','c'};
	fw.write(ch);
	fw.write("\n");
	fw.write("Chandra");
	fw.close();
	}

}
