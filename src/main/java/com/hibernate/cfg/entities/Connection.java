package com.hibernate.cfg.entities;

import javax.persistence.EntityManager;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class Connection {
    private static final String PERSISTENCE_UNIT_NAME = "hibernate";

    public static EntityManager getConnection() {
        return createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    }
}
