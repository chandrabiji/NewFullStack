package oops;

class CentralGovt
{
	public void tax() {
		System.out.println("Central Govt Tax");
	}
}
class StateGovt extends CentralGovt
{
	public void tax()
	{
		System.out.println("Central Govt Tax + State Govt Taxt");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		CentralGovt cg = new CentralGovt();
		cg.tax();
		StateGovt sg = new StateGovt();
		sg.tax();
		CentralGovt cg1 = new StateGovt();
		cg1.tax();

	}

}
