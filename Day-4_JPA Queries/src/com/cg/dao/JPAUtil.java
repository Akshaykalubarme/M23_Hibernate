package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
	/*This is the java persistence application utility file to call persistrnce.xml file 
	it will check any object is created or not if not it will create by EntityManager*/
	private static EntityManagerFactory factory;
	private static EntityManager em;
	static
	{
	factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager()
	{
	if(em==null || !em.isOpen()) 
	{
		em = factory.createEntityManager();
	}
	return em;
	}

}
