package com.fortech.hibernate.cfg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	private static final String PERSISTENCE_UNIT_NAME = "hibernate";
	private static EntityManagerFactory factory;
	
	public static EntityManager getConnection(){
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		return em;
	}
}
