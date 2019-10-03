package com.lambton.Employee;

import com.lambton.IPrintable;

import java.time.LocalDate;

public abstract class Employee implements IPrintable {

    //declare variables

    private int employeeID;
    private String employeeName;
    private int employeeAge;
    private int BirthYear;

    //constructor
    public Employee(int employeeID, String employeeName, int employeeAge) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
    }


    // getter and setter
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

   // function to calculate year of birth
    public int calcBirthYear()
    {

        LocalDate now = LocalDate.now();
        int currentYear= now.getYear();
        BirthYear=currentYear-employeeAge;
        return BirthYear;



    }
    //overriding interface function
    @Override
    public void printMyData() {
        System.out.println("ID: "+ getEmployeeID());
        System.out.println("Name: "+getEmployeeName());
        System.out.println("Birth Year: " + calcBirthYear());

    }

    public abstract float calcEarnings();









}
