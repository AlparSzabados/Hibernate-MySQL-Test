package com.hibernate.cfg.entities;

public class Tester {

    public static void main(String[] args) {

        System.out.println("Getting car" + CarsDao.getEntityById("SV23ELO"));

        Car deleteCar = CarsDao.getEntityById("CJ17LKL");

        CarsDao.deleteCar(deleteCar);

        Car newCar = CarsDao.createNewCar("CJ17LKL", "333", "Honda", 2007);
        CarsDao.addNewCar(newCar);

        Car modifyCar = CarsDao.getEntityById("CJ17LKL");
        modifyCar.setManufacturingDate(2000);
        modifyCar.setModel("Opel Corsa D");

        CarsDao.updateCar(modifyCar);

        printEntries();
    }

    private static void printEntries() {
        CarsDao.getAllCars().forEach(System.out::println);
    }
}
