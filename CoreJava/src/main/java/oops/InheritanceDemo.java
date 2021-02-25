package oops;
class Employee
{
	public double salary = 5000;
}
class HourlyEmployee extends Employee
{
	public double bonus = 500;
}
class RegularEmployee extends Employee
{
	public double bonus = 1000;
}
public class InheritanceDemo {

	public static void main(String[] args) {
		HourlyEmployee he = new HourlyEmployee();
		RegularEmployee re = new RegularEmployee();
		System.out.println("----------------HourlyEmployee PaySlip-----------------------");
		System.out.println(" HourlyEmployee   Salary        : "+he.salary);
		System.out.println(" HourlyEmployee   Bonus         : "+he.bonus);
		System.out.println("-------------------------------------------------------------");
		System.out.println(" Total Salary                   :  "+(he.salary+he.bonus));
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("----------------RegulrEmployee PaySlip-----------------------");
		System.out.println(" RegulrEmployee   Salary        : "+re.salary);
		System.out.println(" RegulrEmployee   Bonus         : "+re.bonus);
		System.out.println("-------------------------------------------------------------");
		System.out.println(" Total Salary                   :  "+(re.salary+re.bonus));
		System.out.println("--------------------------------------------------------------");
		

	}

}
