package com.vt.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import com.vt.onetomany.dao.EmployeeCompanyDao;
import com.vt.onetomany.dto.Company;
import com.vt.onetomany.dto.Employee;

public class EmployeeCompanyController {

	public static void main(String[] args) {
		
		EmployeeCompanyDao employeeCompanyDao = new EmployeeCompanyDao();
		
		Company company=new Company();
		
		company.setCid(1003);
		company.setName("tcs");
		company.setAddress("Airoli");
		company.setPno("782378234");
		
		
		Employee employee1 = new Employee();
		//employee1.setCompany(company);
		employee1.setEid(105);
		employee1.setEname("rahul");
		employee1.setMno("73892738");
		employee1.setEsal("100000");
		
		Employee employee2 = new Employee();
		//employee2.setCompany(company);
		employee2.setEid(106);
		employee2.setEname("pranay");
		employee2.setMno("7489234");
		employee2.setEsal("23800");
		
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		company.setEmployee(employees);
		
		employeeCompanyDao.saveCompany(company);
		
		
		
		//save Employee
//		
//		Employee employee = new Employee();
//		employee.setEid(103);
//		employee.setEname("rahul");
//		employee.setEsal("5999");
//		employee.setMno("52376253");
		
		
		
		
		
	}
}
