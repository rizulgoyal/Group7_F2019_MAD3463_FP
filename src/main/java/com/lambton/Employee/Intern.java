package com.lambton.Employee;

import com.lambton.IPrintable;

public class Intern extends Employee implements IPrintable {


    public Intern(int employeeID, String employeeName, int employeeAge) {
        super(employeeID, employeeName, employeeAge);
    }

    @Override
    public float calcEarnings() {
        return 0;
    }
}
