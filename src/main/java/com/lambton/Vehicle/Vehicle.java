package com.lambton.Vehicle;

import com.lambton.IPrintable;

public abstract class Vehicle implements IPrintable {

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

    // Getter and Setter

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public float getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(float insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    //Disaplay function by using IPrintable Interface


    @Override
    public void printMyData() {
        System.out.println("The Make is : " +getMake());
        System.out.println("The Plate no is : "+getPlate());
        System.out.println("The Insurance Company name is : "+getInsuranceCompany());
        System.out.println("The Insurance Cost is : "+getInsuranceCost() );
    }
}
