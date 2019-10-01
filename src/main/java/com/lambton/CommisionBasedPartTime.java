package com.lambton;

public class CommisionBasedPartTime extends PartTime implements IPrintable{

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

    @Override
    public float calcEarnings() {

            // initialize new variables to temporary store commision and salary
            float salary = this.getRate() * this.getHoursWorked();
            float commision = salary * commisionPercentage/100;
            float totalSalary = commision+salary;
            return totalSalary;

        }

    @Override
    public void printMyData() {
        System.out.println("Employee is PartTime/Commision Based ");
        super.printMyData();
        // print data from parttime class with super function

        System.out.println("Commision Percentage: " + commisionPercentage);
        System.out.println("Total Earnings: " + calcEarnings());

    }


    }

