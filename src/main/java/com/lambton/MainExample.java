package com.lambton;

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




            }




    }

