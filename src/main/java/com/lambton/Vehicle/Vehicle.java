package com.lambton.Vehicle;

import com.lambton.Employee.Employee;
import com.lambton.IPrintable;

public abstract class Vehicle extends Employee implements IPrintable {

    //declaring variables
    private String make;
    private String plate;


    // Constructor

    public Vehicle(int employeeID,String make, String plate) {
        super(employeeID);
        this.make = make;
        this.plate = plate;
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


    //Display function by using IPrintable Interface


    @Override
    public void printMyData() {
        System.out.println("The Make is : " +getMake());
        System.out.println("The Plate no is : "+getPlate());

    }


}
