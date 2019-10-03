package com.lambton.Vehicle;

public class Motorcycle extends Vehicle {
    //declaring variables

    private String carMaintainceCost;
    private String insuranceCompany;
    private Boolean insurance;

    //constructor

    public Motorcycle(String make, String plate, String carMaintainceCost, String insuranceCompany, Boolean insurance) {
        super(make, plate);
        this.carMaintainceCost = carMaintainceCost;
        this.insuranceCompany = insuranceCompany;
        this.insurance = insurance;
    }


    //Getter and Setter


    public String getCarMaintainceCost() {
        return carMaintainceCost;
    }

    public void setCarMaintainceCost(String carMaintainceCost) {
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
        super.printMyData();
        System.out.println("The Make is : " +this.getMake());
        System.out.println("The Plate no is : "+this.getPlate());
        System.out.println("The Insurance Company name is : " +getInsuranceCompany());
        System.out.println("The Insurance is : "+getInsurance());
        System.out.println("The car maintaince cost is : "+getCarMaintainceCost());
    }
}
