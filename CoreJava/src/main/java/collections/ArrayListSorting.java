package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(98);
		al.add(43);
		al.add(32);
		al.add(12);
		al.add(9);
		System.out.println("Without sorting ArrayList Elements are : "+al);
		Collections.sort(al);
		System.out.println("After Sorting ArrayList Elements are : "+al);

	}

}
