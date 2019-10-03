package com.lambton.Vehicle;

public class Motorcycle extends Vehicle {
    //declaring variables

    private float carMaintenanceCost;
    private String insuranceCompany;
    private Boolean insurance;

    //constructor

    public Motorcycle(int employeeID, String make, String plate, float carMaintenanceCost, String insuranceCompany, Boolean insurance) {
        super(employeeID, make, plate);
        this.carMaintenanceCost = carMaintenanceCost;
        this.insuranceCompany = insuranceCompany;
        this.insurance = insurance;
    }


    //Getter and Setter


    public float getCarMaintenanceCost() {
        return carMaintenanceCost;
    }

    public void setCarMaintenanceCost(float carMaintenanceCost) {
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


    //Display function by using IPrintable Interface

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("The Insurance Company name is : " +getInsuranceCompany());
        System.out.println("The Insurance is : "+getInsurance());
        System.out.println("The car maintaince cost is : "+ getCarMaintenanceCost());
    }

    @Override
    public float calcEarnings() {
        return 0;
    }
}
