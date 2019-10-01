package com.lambton;

import java.time.LocalDate;

public abstract class Employee {

    //declare variables

    private int employeeID;
    private char employeeName;
    private int employeeAge;
    private int BirthYear;


    public Employee(int employeeID, char employeeName, int employeeAge) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public char getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(char employeeName) {
        this.employeeName = employeeName;
    }


    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public int calcBirthYear()
    {

        LocalDate now = LocalDate.now();
        int currentYear= now.getYear();
        this.BirthYear=currentYear-this.employeeAge;
        return this.BirthYear;



    }

    public int getBirthYear() {
        return BirthYear;
    }

    public abstract void calcEarnings();









}
