package com.pms.menus;

import java.util.List;
import java.util.Scanner;

import com.pmd.dao.ProductDAOImpl;
import com.pms.main.ProductManagementSystem;
import com.pms.model.Product;

public class ProductDetails {

	static Scanner sc = new Scanner(System.in);
	static ProductDAOImpl productDAO = new ProductDAOImpl();

	public static void adminMenu() {
		System.out.println("--------------------------");
		System.out.println("|    ADMIN MAIN MENU     |");
		System.out.println("--------------------------");
		System.out.println("|  1. ADD PRODUCT        |");
		System.out.println("|  2. VIEW PRODUCT       |");
		System.out.println("|  3. VIEW ALL PRODUCTS  |");
		System.out.println("|  4. UPDATE PRODUCT     |");
		System.out.println("|  5. DELETE PRODUCT     |");
		System.out.println("|  6. BACK               |");
		System.out.println("--------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			productDAO.addProduct();
			adminMenu();
			break;
		case 2:
			System.out.println("Enter Search Product Id ?");
			Product product = productDAO.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			System.out.println(product);
			adminMenu();
			break;
		case 3:
			List<Product> products = productDAO.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			for (Product p : products) {
				System.out.println(p);
			}
			adminMenu();
			break;
		case 4:
			System.out.println("Which Product do you want to update ?");
			productDAO.updateProduct(sc.nextInt());
			adminMenu();
			break;
		case 5:
			System.out.println("Which Product do you want to delete ?");
			productDAO.deleteProduct(sc.nextInt());
			adminMenu();
			break;
		case 6:
			productDAO.back();
			break;
		default:
			System.out.println("Please select Your choice range 1-6 only");
		}
	}

	public static void customerMenu() {
		System.out.println("--------------------------");
		System.out.println("|  CUSTOMER MAIN MENU     |");
		System.out.println("--------------------------");
		System.out.println("|  1. VIEW PRODUCT       |");
		System.out.println("|  2. VIEW ALL PRODUCTS  |");
		System.out.println("|  3. BILL               |");
		System.out.println("|  4. BACK               |");
		System.out.println("--------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Search Product Id ?");
			Product product = productDAO.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			System.out.println(product);
			customerMenu();
			break;
		case 2:
			List<Product> products = productDAO.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			for (Product p : products) {
				System.out.println(p);
			}
			customerMenu();
			break;
		case 3:

			productDAO.bill();
			customerMenu();
			break;

		case 4:
			productDAO.back();
			break;
		default:
			System.out.println("Please select Your choice range 1-4 only");
		}
	}

}
