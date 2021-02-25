package oops;

abstract class Bike
{
	public void color()
	{
		System.out.println("Red Color");
	}
	
	public abstract void run();
}
class ActiveHonda extends Bike
{
	public void run()
	{
		System.out.println("Good @ Hyderabad Roads");
	}
}
class FZ extends Bike
{
	public void run()
	{
		System.out.println("Feel Like Sports Bike");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Bike b1 = new ActiveHonda();
		b1.color();
		b1.run();
		
		Bike b2 = new FZ();
		b2.color();
		b2.run();

	}

}
