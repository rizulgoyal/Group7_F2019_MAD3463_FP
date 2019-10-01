package com.lambton.Employee;

import com.lambton.Employee.PartTime;
import com.lambton.IPrintable;

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

    @Override
    public void printMyData() {

        super.printMyData();
        System.out.println("Employee is PartTime/Commision Based ");
        System.out.println("Rate: " + this.getRate());
        System.out.println("Hours Worked: " + this.getHoursWorked());
        System.out.println("Fixed Amount: " + fixedAmount);
        System.out.println("Total Earnings: " + calcEarnings());

    }

}
