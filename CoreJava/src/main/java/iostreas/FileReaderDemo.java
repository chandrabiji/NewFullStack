package iostreas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args)throws IOException {
		FileReader fr = new FileReader("wc.txt");
		BufferedReader br = new BufferedReader(fr);
		int k;
		while((k=br.read())!=-1) {
			System.out.print((char)k);
		}

	}

}
