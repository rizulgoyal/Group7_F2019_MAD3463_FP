package com.lambton;

public class FixedBasedPartTime extends PartTime implements IPrintable {
    int fixedAmount;


    public FixedBasedPartTime(int employeeID, String employeeName, int employeeAge, float rate, int hoursWorked, int fixedAmount) {
        super(employeeID, employeeName, employeeAge, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    @Override
    public float calcEarnings() {

        float salary = this.getRate() * this.getHoursWorked();
        float totalSalary = fixedAmount+salary;
        return totalSalary;
    }

}
