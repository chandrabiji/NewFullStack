package multithread;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup tg1 = new ThreadGroup("First Group");
		Thread t1 = new Thread(tg1,"First");
		t1.start();
		Thread t2 = new Thread(tg1,"Second");
		t2.start();
		ThreadGroup tg2 = new ThreadGroup(tg1, "Second Group");
		Thread t3 = new Thread(tg2,"Three");
		t3.start();
		Thread t4 = new Thread(tg2,"Four");
		t4.start();
		System.out.println("Tofind thread group : "+t3.getThreadGroup());
		System.out.println("To find parent group name : "+tg2.getParent());
		System.out.println("To know thread priority : "+t4.getPriority());
		System.out.println("To know Active Thread : "+tg1.activeCount());
		

	}

}
