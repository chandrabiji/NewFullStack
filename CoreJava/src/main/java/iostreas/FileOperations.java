package iostreas;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args)throws IOException {
		File f1 = new File("abc.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.isFile());
		File f2 = new File("Chandra");
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.isDirectory());
		File f3 = new File("Chandra","pqr.txt");
		f3.createNewFile();
		File f4 = new File("G:\\Angular_E");
		String[] fname = f4.list();
		for(String name:fname) {
			System.out.println(name);
		}
		f3.delete();
		f1.renameTo(f3);

	}

}
