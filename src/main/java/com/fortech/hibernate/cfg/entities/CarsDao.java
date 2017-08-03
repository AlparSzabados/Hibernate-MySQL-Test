package com.fortech.hibernate.cfg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

//ENTITY_MANAGER.createNativeQuery(arg0, arg1); pentru query uri mai complexe, cu join etc

public class CarsDao {
    public static final String DEFAULT_SELECT_QUERY = "SELECT u from Car u";
    public static final EntityManager ENTITY_MANAGER = Connection.getConnection();

    private static EntityTransaction transaction = ENTITY_MANAGER.getTransaction();

    public static List<Car> getAllCars() {
        Connection.getConnection().getTransaction().begin();
        Query selectAllQuery = Connection.getConnection().createQuery(DEFAULT_SELECT_QUERY);
        return selectAllQuery.getResultList();
    }

    public static Car getEntityById(String id) {
        return Connection.getConnection().find(Car.class, id);
    }

    public static void addNewCar(Car car) {
        ENTITY_MANAGER.getTransaction().begin();
        ENTITY_MANAGER.persist(car);
        ENTITY_MANAGER.getTransaction().commit();
    }

    public static Car createNewCar(String numberPlate, String ownerPin, String model, int manufacturingDate) {
        return new Car(numberPlate, ownerPin, model, manufacturingDate);
    }

    public static void deleteCar(Car car) {
        if (car == null) return;
        transaction.begin();
        ENTITY_MANAGER.remove(ENTITY_MANAGER.contains(car) ? car : ENTITY_MANAGER.merge(car));
        transaction.commit();
    }

    public static void updateCar(Car car) {
        if (car == null) return;
        ENTITY_MANAGER.getTransaction().begin();
        ENTITY_MANAGER.merge(car);
        ENTITY_MANAGER.getTransaction().commit();
    }

}
