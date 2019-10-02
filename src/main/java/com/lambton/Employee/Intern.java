package com.lambton.Employee;

import com.lambton.IPrintable;

public class Intern extends Employee implements IPrintable {

    // create variables for stroing values
    String schoolName;
    int salary;

    public Intern(int employeeID, String employeeName, int employeeAge, String schoolName, int salary) {
        super(employeeID, employeeName, employeeAge);
        this.schoolName = schoolName;
        this.salary = salary;
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
        System.out.println("Salary :" + salary);

    }
}
