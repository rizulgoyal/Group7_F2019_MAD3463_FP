package com.lambton.Vehicle;

public class Car extends Vehicle {
    //declaring variables

    private String carMaintenanceCost;
    private String insuranceCompany;
    private Boolean insurance;

    //Constructor

    public Car(String make, String plate, String carMaintainceCost, String insuranceCompany, Boolean insurance) {
        super(make, plate);
        this.carMaintenanceCost = carMaintainceCost;
        this.insuranceCompany = insuranceCompany;
        this.insurance = insurance;
    }


    //Getter and Setter

    public String getCarMaintenanceCost() {
        return carMaintenanceCost;
    }

    public void setCarMaintenanceCost(String carMaintenanceCost) {
        this.carMaintenanceCost = carMaintenanceCost;
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

    //Iprintable method is overloaded


    @Override
    public void printMyData() {
        System.out.println("The Make is : " +this.getMake());
        System.out.println("The Plate no is : "+this.getPlate());
        System.out.println("The Insurance Company name is : " +getInsuranceCompany());
        System.out.println("The Insurance is : "+getInsurance());

    }
}
