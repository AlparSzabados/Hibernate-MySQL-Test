package com.hibernate.cfg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	private static final String PERSISTENCE_UNIT_NAME = "hibernate";

	public static EntityManager getConnection(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		return factory.createEntityManager();
	}
}
