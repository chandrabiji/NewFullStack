package oops;
//class = common(variables + methods)
public class Person {
	
	//common variables
	public int pid;
	public String personName;
	public int age;
	
	//common methods
	public void eat()
	{
		System.out.println("Eat Nice Food");
	}
	public void sleep()
	{
		System.out.println("Sleep at least 8 Hours Mr. "+personName);
	}
	

	public static void main(String[] args) {
	Person child = new Person();//instance or object
	child.pid=100;
	child.personName="Charan";
	child.age=8;
	child.eat();
	child.sleep();

	}

}
