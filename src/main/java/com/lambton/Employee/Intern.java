package com.lambton.Employee;

import com.lambton.IPrintable;

public class Intern extends Employee implements IPrintable {

    String school;

    public Intern(int employeeID, String employeeName, int employeeAge, String school) {
        super(employeeID, employeeName, employeeAge);
        this.school = school;
    }


    @Override
    public float calcEarnings() {
        return 0;
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is Intern ");
        System.out.println("School Name: " + school);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Earnings: " + calcEarnings());

    }
}
