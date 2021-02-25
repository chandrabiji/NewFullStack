package collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(200, "pqr");
		tm.put(100, "xyz");
		tm.put(300, "xyz");
		System.out.println("TreeMap Elements are : "+tm);

	}

}
