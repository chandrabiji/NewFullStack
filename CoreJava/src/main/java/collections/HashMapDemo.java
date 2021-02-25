package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap();
		hm.put(100, "abc");
		hm.put(300, "xyz");
		hm.put(200, "pqr");
		hm.put(400,"aaa");
		hm.put(500, "CCC");
		hm.put(null, "asd");
		hm.put(600, null);
		System.out.println("HashMap Elements : "+hm);
		Set keys = hm.keySet();
		System.out.println("HashMap keys are : "+keys);
		Collection c = hm.values();
		System.out.println("HashMap Values are : "+c);
		Set<Map.Entry<Integer, String>> entries = hm.entrySet();
		for(Entry<Integer, String> e:entries) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}

}
