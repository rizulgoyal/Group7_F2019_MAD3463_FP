package com.lambton.Vehicle;

public abstract class Vehicle {

    //declaring variables
    private String make;
    private String plate;
    private String insuranceCompany;
    private float insuranceCost;

    // Constructor

    public Vehicle(String make, String plate, String insuranceCompany, float insuranceCost) {
        this.make = make;
        this.plate = plate;
        this.insuranceCompany = insuranceCompany;
        this.insuranceCost = insuranceCost;
    }


}
