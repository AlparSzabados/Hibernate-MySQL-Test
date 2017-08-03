package com.fortech.hibernate.cfg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

//ENTITY_MANAGER.createNativeQuery(arg0, arg1); pentru query uri mai complexe, cu join etc

public class CarsDao {
    public static final String DEFAULT_SELECT_QUERY = "SELECT u from Car u";
    public static EntityManager entityManager = Connection.getConnection();

    public static List<Car> getAllCars() {
        Connection.getConnection().getTransaction().begin();
        Query selectAllQuery = Connection.getConnection().createQuery(DEFAULT_SELECT_QUERY);
        return selectAllQuery.getResultList();
    }

    public static Car getEntityById(String id) {
        return Connection.getConnection().find(Car.class, id);
    }

    public static void addNewCar(Car car) {
        entityManager.getTransaction().begin();
        entityManager.persist(car);
        entityManager.getTransaction().commit();
    }

    public static Car createNewCar(String numberPlate, String ownerPin, String model, int manufacturingDate) {
        return new Car(numberPlate, ownerPin, model, manufacturingDate);
    }

    public static void deleteCar(Car car) {
        if (car == null) return;
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(car) ? car : entityManager.merge(car));
        entityManager.getTransaction().commit();
    }

    public static void updateCar(Car car) {
        if (car == null) return;

        car.setManufacturingDate(2013);
        car.setOwnerPIN("333");
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(car);
        tx.commit();
    }

}
