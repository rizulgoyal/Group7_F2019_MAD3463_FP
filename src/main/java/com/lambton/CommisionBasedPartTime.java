package com.lambton;

public class CommisionBasedPartTime extends PartTime implements IPrintable{

    int commisionPercentage;

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
}
