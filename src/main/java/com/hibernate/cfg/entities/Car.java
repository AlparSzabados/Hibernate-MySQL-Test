package com.hibernate.cfg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
    @Id
    private String numberPlate;

    @Column(name = "ownerPIN")
    private int ownerPIN; //PersonalIdentificationNumber

    @Column(name = "model")
    private String model;

    @Column(name = "manufacturingDate")
    private int manufacturingDate;

    public Car() {
    }

    public Car(String numberPlate, int ownerPIN, String model, int manufacturingDate) {
        this.numberPlate = numberPlate;
        this.ownerPIN = ownerPIN;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
    }

    public int getOwnerPIN() {
        return ownerPIN;
    }

    public void setOwnerPIN(int ownerSocialSecurityNumber) {
        this.ownerPIN = ownerSocialSecurityNumber;
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
        return String.format("Car [ownerSocialSecurityNumber=%s, marca=%s, an_fabricatie=%d, numar_inmatriculare=%s]", ownerPIN, model, manufacturingDate, numberPlate);
    }

}
