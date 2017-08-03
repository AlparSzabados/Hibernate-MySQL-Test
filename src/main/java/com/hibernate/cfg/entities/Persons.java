package com.hibernate.cfg.entities;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pin;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "parent_pin")
    private int parentPin;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getParentPin() {
        return parentPin;
    }

    public void setParentPin(int parentPin) {
        this.parentPin = parentPin;
    }

    @Override
    public String toString() {
        return String.format("Persons{pin=%d, firstName='%s', lastName='%s', age=%d, dateOfBirth='%s', parentPin=%d}", pin, firstName, lastName, age, dateOfBirth, parentPin);
    }
}
