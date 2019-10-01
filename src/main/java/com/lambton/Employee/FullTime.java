package com.lambton.Employee;

import com.lambton.IPrintable;

public class FullTime extends Employee implements IPrintable {

    // create variables for stroing values

    int salary;
    int bonus;

    // constructor to input all values

    public FullTime(int employeeID, String employeeName, int employeeAge, float salary, float bonus) {
        super(employeeID, employeeName, employeeAge);
        this.salary = (int) salary;
        this.bonus = (int) bonus;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = (int) salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = (int) bonus;
    }


    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {
        float totalSalary = salary+bonus;
        return totalSalary;

    }

    //overriding interface function
    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is Full Time ");
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Earnings: " + calcEarnings());
    }
}
