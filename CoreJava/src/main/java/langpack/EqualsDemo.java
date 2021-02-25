package langpack;

class Emp
{
	public int eid;
	public String ename;
	public double price;
	public Emp(int eid, String ename, double price) {
		this.eid = eid;
		this.ename = ename;
		this.price = price;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + eid; result = prime * result + ((ename == null) ? 0
	 * : ename.hashCode()); long temp; temp = Double.doubleToLongBits(price); result
	 * = prime * result + (int) (temp ^ (temp >>> 32)); return result; }
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	public String toString()
	{
		return eid+"\t"+ename+"\t"+price;
	}
	
}

public class EqualsDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp(100,"abc",5000);
		Emp e2 = new Emp(100,"abc",5000);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		if(e1.equals(e2)) {
			System.out.println("e1 and e2 are Equals");
		}else {
			System.out.println("e1 and e2 are NotEquals");
		}
		System.out.println(e1.getClass());
		System.out.println(e1);
	}

}
