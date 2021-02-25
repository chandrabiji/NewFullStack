package iostreas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	public int sid;
	public transient String sname;
	public  int marks;
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
		
}
public class SDTest {
	
	public void serilization(Object obj) {
		try {
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Serilization Completed....");
	}
	
	public Object deSerilization() {
		FileInputStream fis;
		Object obj=null;
		try {
			fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}

	public static void main(String[] args) {
		SDTest sd = new SDTest();
		Student s1 = new Student(100,"abc",98);
		sd.serilization(s1);
		Student s2 = (Student) sd.deSerilization();
		System.out.println(s2.sid+"\t"+s2.sname+"\t"+s2.marks);

	}

}
