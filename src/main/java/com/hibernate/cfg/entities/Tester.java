package com.hibernate.cfg.entities;

import java.util.Arrays;
import java.util.List;

public class Tester {

    public static void main(String[] args) {

        System.out.println("Getting car" + CarsDao.getEntityById("SV23ELO"));

        Car deleteCar = CarsDao.getEntityById("CJ17LKL");

        CarsDao.deleteCar(deleteCar);

        Car newCar = CarsDao.createNewCar("CJ17LKL", 333, "Honda", 2007);
        CarsDao.addNewCar(newCar);

        Car modifyCar = CarsDao.getEntityById("CJ17LKL");
        modifyCar.setManufacturingDate(2000);
        modifyCar.setModel("Opel Corsa D");

        CarsDao.updateCar(modifyCar);

        String leftOuterJoin = "SELECT p.firstName, p.lastName, c.model, c.numberPlate FROM Persons p LEFT JOIN Car c ON p.pin = c.ownerPin";
        List<Object[]> resultList = Connection.getConnection().createQuery(leftOuterJoin, Object[].class).getResultList();

        resultList.stream()
                  .map(Arrays::toString)
                  .forEach(System.out::println);

        printCarEntries();

    }

    private static void printCarEntries() {
        CarsDao.getAllCars().forEach(System.out::println);
    }
}
