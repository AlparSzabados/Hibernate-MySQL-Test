package com.hibernate.cfg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

//ENTITY_MANAGER.createNativeQuery(arg0, arg1); pentru query uri mai complexe, cu join etc

public class CarsDao {
    private static final String DEFAULT_SELECT_QUERY = "SELECT u from Car u";
    private static final EntityManager ENTITY_MANAGER = Connection.getConnection();
    private static final EntityTransaction TRANSACTION = ENTITY_MANAGER.getTransaction();

    public static List<Car> getAllCars() {
        TypedQuery<Car> selectAllQuery = ENTITY_MANAGER.createQuery(DEFAULT_SELECT_QUERY, Car.class);
        return selectAllQuery.getResultList();
    }

    public static Car getEntityById(String id) {
        return ENTITY_MANAGER.find(Car.class, id);
    }

    public static void addNewCar(Car car) {
        TRANSACTION.begin();
        ENTITY_MANAGER.persist(car);
        TRANSACTION.commit();
    }

    public static Car createNewCar(String numberPlate, int ownerPin, String model, int manufacturingDate) {
        return new Car(numberPlate, ownerPin, model, manufacturingDate);
    }

    public static void deleteCar(Car car) {
        if (car == null) return;
        TRANSACTION.begin();
        ENTITY_MANAGER.remove(ENTITY_MANAGER.contains(car) ? car : ENTITY_MANAGER.merge(car));
        TRANSACTION.commit();
    }

    public static void updateCar(Car car) {
        if (car == null) return;
        TRANSACTION.begin();
        ENTITY_MANAGER.merge(car);
        TRANSACTION.commit();
    }

}
