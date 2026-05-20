package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		/*
		System.out.println("\n=== TEST 3: department insert ===");
		Department newDep = new Department(null, "Finance");
		departmentDao.insert(newDep);
		System.out.println("Inserted!");
		*/
		
		System.out.println("\n=== TEST 4: department update ===");
		Department depUpdate = departmentDao.findById(6);
		depUpdate.setName("Marketing");
		departmentDao.update(depUpdate);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 5: department delete ===");
		
	}

}
