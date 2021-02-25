package multithread;

public class Test {

	public static void main(String[] args) {
		System.out.println("Current Running Thread :  "+Thread.currentThread().getName());
		Thread.currentThread().setName("Chandra");
		System.out.println("Current Running Thread :  "+Thread.currentThread().getName());

	}

}
