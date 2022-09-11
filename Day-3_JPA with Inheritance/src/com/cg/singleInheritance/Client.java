package com.cg.singleInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee
		Employee e=new Employee();
		e.setName("Akshay");
		e.setSalary(50000);
		em.persist(e);
		
		//create an employee
		Employee e1=new Employee();
		e1.setName("Vishal");
		e1.setSalary(75000);
		em.persist(e1);
		
		//create a manager
		Manager m=new Manager();
		m.setName("Amol");
		m.setSalary(90000);
		m.setDeptname("Information Technology");
		em.persist(m);em.getTransaction().commit();
		System.out.println("The Data is added");
		em.close();
		em.clear();
		
	}

}
