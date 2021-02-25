package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(new Integer(45));
		al.add("Chandra");
		al.add('B');
		al.add(true);
		al.add(null);
		al.add(10);
		al.add(87);
		System.out.println("ArrayList Elements are : "+al);
		ListIterator lt = al.listIterator();
		System.out.println("---Forward---");
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("---Backward---");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

	}

}
