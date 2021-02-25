package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(new Integer(40));
		hs.add("Chandra");
		hs.add('B');
		hs.add(null);
		hs.add(true);
		hs.add(87);
		hs.add(10);
		System.out.println("HashSet Elements are : "+hs);
		System.out.println(hs.contains("Chandra"));
		System.out.println("HashSet Size = "+hs.size());
		hs.remove("Chandra");
		System.out.println("After Remove HashSet Elements are : "+hs);
		HashSet hs1 = new HashSet();
		hs1.add(100);
		hs1.add(200);
		hs.addAll(hs1);
		System.out.println(hs);
		System.out.println(hs.containsAll(hs1));
		hs1.clear();
		System.out.println("Second HashSet After Clear Elements : "+hs1);
		System.out.println(hs1.isEmpty());
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
