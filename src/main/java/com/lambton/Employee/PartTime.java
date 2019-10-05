package com.lambton.Employee;

import com.lambton.IPrintable;

public abstract class PartTime extends Employee implements IPrintable {


    // create variables for Storing values
    private float rate;
    private int hoursWorked;


    // constructor to input all values


    public PartTime(int employeeID, String employeeName, int employeeAge, float rate, int hoursWorked) {
        super(employeeID, employeeName, employeeAge);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public float getRate() {
        return (float) rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }





    //overriding interface function
    @Override
    public void printMyData() {


    }
}
