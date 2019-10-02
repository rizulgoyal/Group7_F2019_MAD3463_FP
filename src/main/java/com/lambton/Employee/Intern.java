package com.lambton.Employee;

import com.lambton.IPrintable;

public class Intern extends Employee implements IPrintable {

    // create variables for stroing values
    String schoolName;
    int salary;

    // constructor to input all values
    public Intern(int employeeID, String employeeName, int employeeAge, String school) {
        super(employeeID, employeeName, employeeAge);
        this.schoolName = school;
    }

    //override abstract function to calculate salary
    @Override
    public float calcEarnings() {
        return 0;
    }

    //overriding interface function
    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is Intern ");
        System.out.println("School Name: " + schoolName);

    }
}
