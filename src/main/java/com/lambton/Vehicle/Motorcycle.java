package com.lambton.Vehicle;

public class Motorcycle extends Vehicle {
    //declaring variables

    private int carMaintainceCost;
    private String insuranceCompany;
    private Boolean insurance;

    //constructor

    public Motorcycle(String make, String plate, int carMaintainceCost, String insuranceCompany, Boolean insurance) {
        super(make, plate);
        this.carMaintainceCost = carMaintainceCost;
        this.insuranceCompany = insuranceCompany;
        this.insurance = insurance;
    }

    //Extra Constructor because boolean is not proper functionable
    public Motorcycle(String make, String plate, int carMaintainceCost, String insuranceCompany) {
        super(make, plate);
        this.carMaintainceCost = carMaintainceCost;
        this.insuranceCompany = insuranceCompany;

    }

    //Getter and Setter


    public int getCarMaintainceCost() {
        return carMaintainceCost;
    }

    public void setCarMaintainceCost(int carMaintainceCost) {
        this.carMaintainceCost = carMaintainceCost;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public Boolean getInsurance() {
        return insurance;
    }

    public void setInsurance(Boolean insurance) {
        this.insurance = insurance;
    }


    //Display function by using IPrintable Interface

    @Override
    public void printMyData() {
        System.out.println("The Make is : " +this.getMake());
        System.out.println("The Plate no is : "+this.getPlate());
        System.out.println("The Insurance Company name is : " +getInsuranceCompany());
        System.out.println("The Insurance is : "+getInsurance());
        System.out.println("The car maintaince cost is : "+getCarMaintainceCost());
    }
}
