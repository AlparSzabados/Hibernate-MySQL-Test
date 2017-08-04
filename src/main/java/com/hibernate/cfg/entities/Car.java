package com.hibernate.cfg.entities;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "number_plate")
    private String numberPlate;

    @Column(name = "owner_pin")
    private int ownerPin;

    @Column(name = "car_model")
    private String model;

    @Column(name = "manufacturing_date")
    private int manufacturingDate;

    public Car() {
    }

    public Car(String numberPlate, int ownerPersonalIdentificationNumber, String model, int manufacturingDate) {
        this.numberPlate = numberPlate;
        this.ownerPin = ownerPersonalIdentificationNumber;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
    }

    public int getOwnerPin() {
        return ownerPin;
    }

    public void setOwnerPin(int ownerSocialSecurityNumber) {
        this.ownerPin = ownerSocialSecurityNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(int manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    @Override
    public String toString() {
        return String.format("Car{numberPlate='%s', ownerPIN=%d, model='%s', manufacturingDate=%d}", numberPlate, ownerPin, model, manufacturingDate);
    }
}
