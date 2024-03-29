package com.lambton.Employee;

import com.lambton.Employee.PartTime;
import com.lambton.IPrintable;
import com.lambton.SalaryException;

public final class CommisionBasedPartTime extends PartTime implements IPrintable {


    // create variables for stroing values

    int commisionPercentage;

    // constructor to input all values


    public CommisionBasedPartTime(int employeeID, String employeeName, int employeeAge, float rate, int hoursWorked, int commisionPercentage) {
        super(employeeID, employeeName, employeeAge, rate, hoursWorked);
        this.commisionPercentage = commisionPercentage;
    }

    public int getCommisionPercentage() {
        return commisionPercentage;
    }

    public void setCommisionPercentage(int commisionPercentage) {
        this.commisionPercentage = commisionPercentage;
    }


    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {

            // initialize new variables to temporary store commision and salary
            float salary = this.getRate() * this.getHoursWorked();
            float commision = salary * commisionPercentage/100;
            float totalSalary = commision+salary;
            return totalSalary;

        }


    //overriding interface function
    @Override
    public void printMyData() {

        super.printMyData();
        System.out.println("Employee is PartTime/Fixed Amount Based ");


        System.out.println("Rate: " + this.getRate() + "$ per hour");
        System.out.println("Hours Worked: " + this.getHoursWorked());
        // try and catch to restrict percentage
        try{
            if(commisionPercentage<10)
            {
                throw  new SalaryException();
            }
            else
            {
                System.out.println("Commision Percentage: " + commisionPercentage + "%");


        }}
        catch (SalaryException e)
        {
            System.out.println(commisionPercentage+"% is not acceptable");
        }
        System.out.println("Total Earnings: " + calcEarnings() + "$");

    }


    }

