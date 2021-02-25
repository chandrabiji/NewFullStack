package multithread;

public class ThreadDemo extends Thread{
	
	public void run()
	{
		for(int i=1;i<=5;++i)
		{
			System.out.println("inside run method : "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void start()
	{
		super.start();
		System.out.println("--start-----");
	}
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		//t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=6;i<=10;++i)
		{
			System.out.println("inside main method : "+i);
		}

	}

}
