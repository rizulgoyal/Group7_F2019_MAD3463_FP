package com.lambton.Vehicle;

import com.lambton.Employee.Employee;
import com.lambton.IPrintable;

public abstract class Vehicle extends Employee implements IPrintable {

    //declaring variables
    private String make;
    private String plate;
    private boolean vehicle;


    // Constructor

    public Vehicle(int employeeID, String employeeName, int employeeAge, String make, String plate, boolean vehicle) {
        super(employeeID, employeeName, employeeAge);
        this.make = make;
        this.plate = plate;
        this.vehicle = vehicle;
    }


    // Getter and Setter


    public boolean isVehicle() {
        return vehicle;
    }

    public void setVehicle(boolean vehicle) {
        this.vehicle = vehicle;
    }

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


    //Display function by using IPrintable Interface


    @Override
    public void printMyData() {
        super.printMyData();


    }


}
