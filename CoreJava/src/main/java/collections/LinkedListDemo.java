package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(20);
		ll.add("Chandra");
		ll.add('B');
		ll.add(true);
		ll.add(34);
		ll.add(20);
		System.out.println("LinkedList Elements are : "+ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println("After Adding LinkedList Elements are : "+ll);
		Iterator it = ll.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
