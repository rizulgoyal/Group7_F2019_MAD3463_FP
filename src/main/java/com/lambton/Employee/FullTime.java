package com.lambton.Employee;

import com.lambton.IPrintable;

public class FullTime extends Employee implements IPrintable {
    
    public FullTime(int employeeID, String employeeName, int employeeAge) {
        super(employeeID, employeeName, employeeAge);
    }

    @Override
    public float calcEarnings() {
        return 0;
    }
}
