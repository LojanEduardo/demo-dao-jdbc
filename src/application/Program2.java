package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDAO departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Test 1: Department insert ====");
		Department newDepartment = new Department(null, "Electro");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("==== Test 2: Department Update ====");
		newDepartment = departmentDao.findById(4);
		newDepartment.setName("Novo Nome");
		departmentDao.update(newDepartment);
		System.out.println("Update completed");
		
		System.out.println("==== Test 3: Department DeleteById ====");
		departmentDao.deleteById(11);
		departmentDao.deleteById(12);
		departmentDao.deleteById(13);
		departmentDao.deleteById(10);
		System.out.println("Delete completed");
		
		System.out.println("==== Test 4: Department FindById ====");
		newDepartment = departmentDao.findById(2);
		System.out.println(newDepartment);
		
		System.out.println("==== Test 5: Department FindAll ====");
		List<Department> dep = new ArrayList<>();
		dep = departmentDao.findAll();
		System.out.println(dep);
		
		
		
		sc.close();
		
	}

}
