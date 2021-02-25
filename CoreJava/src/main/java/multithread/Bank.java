package multithread;

class Customer
{
	public double balance = 10000;
	
	public synchronized void withdraw(double wamount)
	{
		if(balance>=wamount) {
			System.out.println("Current Account Balance = "+balance);
			balance -=wamount;
			System.out.println("Successfully Withdraw completed.Now Updated Balance : "+balance);
		}else {
			System.out.println("Your Balance is Low.Please depoist and continue...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance -=wamount;
			System.out.println("Successfully Withdraw completed.Now Updated Balance : "+balance);
		}
	}
	public synchronized void deposit(double damount)
	{
		balance +=damount;
		System.out.println("Successfully Deposit Completed : "+balance);
		notify();
	}
}
public class Bank {

	public static void main(String[] args) {
	final Customer c = new Customer();
	Thread t1 = new Thread() {
		public void run()
		{
			c.withdraw(15000);
		}
	};
	t1.start();
	Thread t2 = new Thread() {
		public void run()
		{
			c.deposit(10000);
		}
	};
	t2.start();

	}

}
