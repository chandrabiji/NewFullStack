package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(43);
		pq.add(65);
		pq.add(23);
		//pq.add(null);
		//pq.add("Chandra");
		pq.add(9);
		pq.add(2);
		System.out.println("PriorityQueue Elements : "+pq);
		pq.remove();
		System.out.println("After Remove PriorityQueue Elements : "+pq);

	}

}
