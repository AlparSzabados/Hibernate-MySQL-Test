package com.fortech.hibernate.cfg.entities;

public class Tester {

    public static void main(String[] args) {

        System.out.println("Getting car" + CarsDao.getEntityById("SV23ELO"));

        Car deleteCar = CarsDao.getEntityById("CJ17LKL");

        if (deleteCar != null) {
            CarsDao.deleteCar(deleteCar);
        }

        printEntries();

        Car newCar = CarsDao.createNewCar("CJ17LKL", "333", "Honda", 2007);
        CarsDao.addNewCar(newCar);

        CarsDao.deleteCar(CarsDao.getEntityById("CJ17LKL"));

        CarsDao.updateCar("CJ17LKL");


        printEntries();

    }

    private static void printEntries() {
        for (Car m : CarsDao.getAllCars()) {
            System.out.println(m.toString());
        }
    }
}
