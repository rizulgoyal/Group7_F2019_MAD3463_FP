package com.lambton.Employee;

import com.lambton.IPrintable;
import com.lambton.SalaryException;

public final class FullTime extends Employee implements IPrintable {

    // create variables for stroing values

    int salary;
    int bonus;

    // constructor to input all values


    public FullTime(int employeeID, String employeeName, int employeeAge, int salary, int bonus) {
        super(employeeID, employeeName, employeeAge);
        this.salary = salary;
        this.bonus = bonus;
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
        System.out.println("Employee is Full Time ");



        try{
            if(salary<1000)
            {
                throw  new SalaryException();
            }
            else
            {
                System.out.println("Salary :" + salary + "$");
            }


        }
        catch (SalaryException e)
        {
            System.out.println(salary+"$ Salary is not acceptable");
        }
        System.out.println("Bonus: " + bonus + "$");


        System.out.println("Total Earnings: " + calcEarnings() + "$");
    }
}
