package com.lambton;

import com.lambton.Employee.CommisionBasedPartTime;
import com.lambton.Employee.FixedBasedPartTime;
import com.lambton.Employee.FullTime;
import com.lambton.Employee.Intern;

public class MainExample {

    public static void main(String[] args) {


        CommisionBasedPartTime p1 = new CommisionBasedPartTime(
                1,
                "Rizul",
                25,
                (float)15.45,
                23,
                15);
            p1.printMyData();

            FixedBasedPartTime p2 = new FixedBasedPartTime(2,
                    "Anmol",
                    22,
                    (float)14.5,
                    40,
                    150);
            p2.printMyData();

        FullTime p3 = new FullTime(3,
                "Harpreet",
                28,
                1000,
                250);
        p3.printMyData();

        Intern p4 = new Intern(4,"Javed",35,"Saint Thomas", 800);
        p4.printMyData();





            }




    }

