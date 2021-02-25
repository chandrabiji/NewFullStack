package multithread;
class A{}
public class ThreadPriorityDemo extends A implements Runnable{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriorityDemo obj = new ThreadPriorityDemo();
		Thread t1 = new Thread(obj);
		t1.setName("One");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		Thread t2 = new Thread(obj);
		t2.setName("Two");
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.setDaemon(true);
		t2.start();
		Thread t3 = new Thread(obj);
		t3.setName("Three");
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();

	}

}
