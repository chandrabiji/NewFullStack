package multithread;

public class RunnableDemo implements Runnable{
	
	public void run()
	{
		for(int i=1;i<=5;++i)
		{
			System.out.println("Inside run method : "+i);
		}
	}

	public static void main(String[] args) {
		RunnableDemo obj = new RunnableDemo();
		Thread t = new Thread(obj);
		t.start();
		for(int i=6;i<=10;++i)
		{
			System.out.println("Inside main method : "+i);
		}

	}

}
