package application;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Department obj = new Department(1, "Tecnologia");
		
		Seller seller = new Seller(2, "Bob", "bob@gmail.com", new Date(), 2000.00, obj);
		System.out.println(seller);
	}

}
