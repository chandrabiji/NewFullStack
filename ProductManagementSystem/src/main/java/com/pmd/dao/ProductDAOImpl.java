package com.pmd.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAO;
import com.pms.exception.ProductNotFound;
import com.pms.main.ProductManagementSystem;
import com.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {
	Scanner sc = new Scanner(System.in);
	static List<Product> productList = new ArrayList<Product>();
	static List<Product> tempList = new ArrayList<Product>();
	Product product=null;
	int n = 1;
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	File original = new File("product.txt");
	File temFile = new File("temp.txt");

	public void addProduct() {
		try {
			if(!original.exists()) {
				original.createNewFile();
			}
			while(n==1) {
				product = new Product();
				System.out.println("Enter Product Id ?");
				product.setPid(sc.nextInt());
				System.out.println("Enter Product Name ?");
				product.setPname(sc.next());
				System.out.println("Enter Product Qty ?");
				product.setQty(sc.nextInt());
				System.out.println("Enter Product Price ?");
				product.setPrice(sc.nextDouble());
				productList.add(product);
				System.out.println("Do you want to add more products press 1 else press any number ?");
				n = sc.nextInt();
			}
			fos = new FileOutputStream(original);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(productList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Product viewProduct(int pid) {
		Product p1 = new Product();
		try {
			fis = new FileInputStream(original);
			ois = new ObjectInputStream(fis);
			productList = (List<Product>) ois.readObject();
			
			for(Product p:productList) {
			  if(p.getPid()==pid) {
				  p1=p;
				  break;
			  }
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p1;
	}

	public List<Product> viewAllProducts() {
		if(productList.size()==0) {
			throw new ProductNotFound("Stock is not available");
		}
		return productList;
	}

	public void updateProduct(int pid) {
		tempList = new ArrayList<Product>();
		for(Product p2:productList)
		{
			if(p2.getPid()==pid) {
				System.out.println("Select Your Choice : 1. Name  2. Qty  3. Price ?");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("Enter Updating Product Name ?");
				       p2.setPname(sc.next());
				       break;
				case 2:System.out.println("Enter Updating Product Qty ?");
				       p2.setQty(sc.nextInt());
				       break;
				case 3:System.out.println("Enter Updating Product Price3 ?");
				       p2.setPrice(sc.nextDouble());
				       break;
				default:System.out.println("Please select Your choice 1-3 only");       
				}
				tempList.add(p2);
			}else {
				tempList.add(p2);
			}
		}
		productList = new ArrayList<Product>();
		for(Product p3:tempList) {
			productList.add(p3);
		}
		System.out.println("Successfully Product Updated.....");
		
	}

	public void deleteProduct(int pid) {
		tempList = new ArrayList<Product>();
		for(Product p2:productList)
		{
			if(p2.getPid()==pid) {
				
			}else {
				tempList.add(p2);
			}
		}
		productList = new ArrayList<Product>();
		for(Product p3:tempList) {
			productList.add(p3);
		}
		System.out.println("Successfully Product Deleted.....");
		
	}

	public void bill() {
		tempList = new ArrayList<Product>();
		Product buyProduct = new Product();
		for(Product p4:productList) {
			System.out.println(p4);
		}
		System.out.println("Which Product do you want to buy ?");
		buyProduct.setPid(sc.nextInt());
		System.out.println("How much Qty do you want ?");
		buyProduct.setQty(sc.nextInt());
		for(Product p5:productList) {
			if(p5.getPid()==buyProduct.getPid()) {
				System.out.println("----------------------------------------------");
				System.out.println("                   BILL                       ");
				System.out.println("----------------------------------------------");
				System.out.println("  Product Id          :   "+p5.getPid());
				System.out.println("  Product Name        :   "+p5.getPname());
				System.out.println("  Product Qty         :   "+buyProduct.getQty());
				System.out.println("  Product Price       :   "+p5.getPrice());
				System.out.println("-----------------------------------------------");
				System.out.println(" Total Amount         :   "+(buyProduct.getQty()*p5.getPrice()));
				System.out.println("-----------------------------------------------");
				p5.setQty(p5.getQty()-buyProduct.getQty());
				tempList.add(p5);
			}else {
				tempList.add(p5);
			}
		}
		productList = new ArrayList<Product>();
		for(Product p6:tempList) {
			productList.add(p6);
		}
		System.out.println("Thank you.Visit Once Again........");
		
	}

	public void back() {
		ProductManagementSystem.main(null);
		
	}

}
