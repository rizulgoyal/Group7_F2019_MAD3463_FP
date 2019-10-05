package com.lambton;

import com.lambton.Employee.CommisionBasedPartTime;
import com.lambton.Employee.FixedBasedPartTime;
import com.lambton.Employee.FullTime;
import com.lambton.Employee.Intern;
import com.lambton.Vehicle.Car;
import com.lambton.Vehicle.Motorcycle;

public class MainExample {

    public static void main(String[] args) {


        CommisionBasedPartTime p1 = new CommisionBasedPartTime(
                1,
                "",21,
                (float)15.45,
                23,
                15);


            FixedBasedPartTime p2 = new FixedBasedPartTime(2,"",21,
                    (float)14.5,
                    40,
                    150);


        FullTime p3 = new FullTime(3,"",25,
                1000,
                250);


        Intern p4 = new Intern(4,"",21,"Saint Thomas", 800);


        Car car1 = new Car(1,"Rizul",24,true,"Honda","ABCD123",
                (float) 235.21,"Alexa","True");



        Motorcycle bike1 = new Motorcycle(2,"Anmol",26,true,
                "Harley","ABCD542",(float) 254.31,"TD","True");
        Motorcycle bike2 = new Motorcycle(3,"Harpreet",30,true,
                "Royal Enfield","XVFS 321",(float) 365.21,"Scotia","True");
        Car car2 = new Car(4,"Javed",20,false,"Chevrolet","USTF365",
                (float) 251.21,"Airhub","True");


        //function of if else to compare employee id to display his salary details of first employee
        if(p1.getEmployeeID() == car1.getEmployeeID() )
        { car1.printMyData(); p1.printMyData(); }
        else if(p1.getEmployeeID() == car2.getEmployeeID())
        {car2.printMyData(); p1.printMyData(); }
        else if(p1.getEmployeeID() == bike2.getEmployeeID())
        {bike2.printMyData(); p1.printMyData(); }
        else if(p1.getEmployeeID() == bike1.getEmployeeID())
        {bike1.printMyData();p1.printMyData(); }


        //function of if else to compare employee id to display his salary details of second employee
        if(p2.getEmployeeID() == car1.getEmployeeID() )
        { car1.printMyData(); p2.printMyData(); }
        else if(p2.getEmployeeID() == car2.getEmployeeID())
        {car2.printMyData(); p2.printMyData(); }
        else if(p2.getEmployeeID() == bike2.getEmployeeID())
        {bike2.printMyData(); p2.printMyData(); }
        else if(p2.getEmployeeID() == bike1.getEmployeeID())
        {bike1.printMyData();p2.printMyData(); }

        //function of if else to compare employee id to display his salary details of third employee
        if(p3.getEmployeeID() == car1.getEmployeeID() )
        { car1.printMyData(); p3.printMyData(); }
        else if(p3.getEmployeeID() == car2.getEmployeeID())
        {car2.printMyData(); p3.printMyData(); }
        else if(p3.getEmployeeID() == bike2.getEmployeeID())
        {bike2.printMyData(); p3.printMyData(); }
        else if(p3.getEmployeeID() == bike1.getEmployeeID())
        {bike1.printMyData();p3.printMyData(); }






            }




    }

