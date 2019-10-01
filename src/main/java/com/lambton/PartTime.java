package com.lambton;

public class PartTime extends Employee {



    private float rate;
    private int hoursWorked;
    private float totalSalary;


    public PartTime(int employeeID, char employeeName, int employeeAge) {
        super(employeeID, employeeName, employeeAge);
    }

    @Override

    public float calcEarnings() {
        totalSalary=rate*hoursWorked;
        return totalSalary;

    }


}
