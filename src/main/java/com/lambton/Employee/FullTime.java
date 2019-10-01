package com.lambton.Employee;

import com.lambton.IPrintable;

public class FullTime extends Employee implements IPrintable {

    float salary;
    float bonus;

    public FullTime(int employeeID, String employeeName, int employeeAge, float salary, float bonus) {
        super(employeeID, employeeName, employeeAge);
        this.salary = salary;
        this.bonus = bonus;
    }
    

    @Override
    public float calcEarnings() {
        return 0;
    }
}
