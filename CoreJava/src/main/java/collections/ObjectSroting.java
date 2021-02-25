package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product implements Comparable<Product>
{
	public int pid;
	public String pname;
	public int qty;
	public double price;
	
	public Product(int pid, String pname, int qty,double price) {
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price= price;
	}
	
	public String toString()
	{
		return pid+"\t"+pname+"\t"+qty+"\t"+price;
	}

	@Override
	public int compareTo(Product p) {
		
		//return pname.compareTo(p.pname);
		if(qty>p.qty) {
			return 1;
		}else if(qty<p.qty) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
class ProductPriceSorting implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.price>p2.price) {
			return -1;
		}else if(p1.price<p2.price) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
public class ObjectSroting {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(200,"pqr",56,850));
		productList.add(new Product(300,"xyz",36,257));
		productList.add(new Product(100,"abc",66,990));
		System.out.println("without sorting product list");
		for(Product p:productList) {
			System.out.println(p);
		}
		Collections.sort(productList);
		System.out.println("After Sorting Product List");
		for(Product p:productList) {
			System.out.println(p);
		}
		System.out.println("Product Price Based Sorting");
		Collections.sort(productList,new ProductPriceSorting());
		for(Product p:productList) {
			System.out.println(p);
		}
		
		

	}

}
