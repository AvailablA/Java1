package com.vt.onetomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vt.onetomany.dto.Company;
import com.vt.onetomany.dto.Employee;

public class EmployeeCompanyDao {

//	private EntityManager entityManager=null;
//	
//	public EntityManager getEntityManager() {
//		return Persistence.createEntityManagerFactory("vt").createEntityManager();
//	}
	
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vt");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void saveCompany(Company company) {
//		entityManager=getEntityManager();
//		entityManager.getTransaction().begin();
//		entityManager.persist(company);
//		entityManager.getTransaction().commit();
		
		List<Employee> list = company.getEmployee();
		for (Employee employee : list) {
			employee.setCompany(company);
		}
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
		
		
	}
	
	public void saveEmployee(int id ,Employee employee) {

		
		
		
		entityTransaction.begin();
		Company dbCompany = entityManager.find(Company.class, id);
		employee.setCompany(dbCompany);
		entityManager.persist(employee);
		entityTransaction.commit();
	}
}
