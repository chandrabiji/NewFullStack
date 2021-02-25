package collections;

import java.util.HashMap;
import java.util.WeakHashMap;

class Demo
{
	public String toString()
	{
		return "demo";
	}
	public void finalize()
	{
		System.out.println("Finalize method is called");
	}
}
public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		HashMap hm = new HashMap();
		WeakHashMap wm = new WeakHashMap();
		Demo d = new Demo();
		hm.put(d, "Charan");
		wm.put(d, "Chandra");
		System.out.println("HashMap Value = "+hm.get(d)+"\t"+"WeakHashMap Value = "+wm.get(d));
		d = null;
		System.gc();
		Thread.sleep(4000);
		System.out.println("HashMap Value = "+hm.get(d)+"\t"+"WeakHashMap Value = "+wm.get(d));

	}

}
