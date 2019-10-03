package com.lambton.Vehicle;

public class Car extends Vehicle {
    //declaring variables

    private String carMaintainceCost;

    //Constructor

    public Car(String make, String plate, String insuranceCompany, float insuranceCost,String carMaintainceCost) {
        super(make, plate, insuranceCompany, insuranceCost);
        this.carMaintainceCost = carMaintainceCost;

    }

    //Getter and Setter

    public String getCarMaintainceCost() {
        return carMaintainceCost;
    }

    public void setCarMaintainceCost(String carMaintainceCost) {
        this.carMaintainceCost = carMaintainceCost;
    }

    //Iprintable method is overloaded


    @Override
    public void printMyData() {
        super.printMyData();
    }
}
