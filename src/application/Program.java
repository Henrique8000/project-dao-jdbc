package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		
		System.out.println("\n=== TEST 3: seller findByDepartment ===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		/*
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Henrique", "henrique@gmail.com", new Date(), 2800.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted!");
		*/
		
		/*
		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Edison Arantes");
		sellerDao.update(seller);
		System.out.println("Updated completed");
		*/
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete test: ");
		Integer id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
		
	}

}
