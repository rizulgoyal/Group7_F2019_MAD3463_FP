package com.lambton.Employee;

import com.lambton.Employee.PartTime;
import com.lambton.IPrintable;
import com.lambton.SalaryException;

public final class FixedBasedPartTime extends PartTime implements IPrintable {

    // create variables for stroing values
    int fixedAmount;


    // getter and setter
    public int getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    // constructor to input all values


    public FixedBasedPartTime(int employeeID, String employeeName, int employeeAge, float rate, int hoursWorked, int fixedAmount) {
        super(employeeID, employeeName, employeeAge, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {

        float salary = this.getRate() * this.getHoursWorked();
        float totalSalary = fixedAmount+salary;
        return totalSalary;
    }


    //overriding interface function
    @Override
    public void printMyData() {

        super.printMyData();
        System.out.println("Employee is PartTime/Commision Based ");
        System.out.println("Rate: " + this.getRate() + "$ per hour");
        System.out.println("Hours Worked: " + this.getHoursWorked());

        // try and catch to restrict fixed amount bonus

        try{
            if(fixedAmount<300)
            {
                throw  new SalaryException();
            }
            else
            {
                System.out.println("Fixed Amount: " + fixedAmount + "$");            }


        }
        catch (SalaryException e)
        {
            System.out.println(fixedAmount+"$ is not acceptable");
        }


        System.out.println("Total Earnings: " + calcEarnings() + "$");

    }

}
