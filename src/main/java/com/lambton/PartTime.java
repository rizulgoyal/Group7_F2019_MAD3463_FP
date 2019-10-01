package com.lambton;

public class PartTime extends Employee implements IPrintable{



    private float rate;
    private int hoursWorked;


    public PartTime(int employeeID, String employeeName, int employeeAge, float rate, int hoursWorked) {
        super(employeeID, employeeName, employeeAge);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public float getRate() {
        return (float) rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override

    public float calcEarnings() {
        float totalSalary = rate * hoursWorked;
        return totalSalary;

    }


    @Override
    public void printMyData() {

        super.printMyData();

        System.out.println("Employee is PartTime");
        System.out.println("Rate: " + rate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Earnings: " + calcEarnings());

    }
}
