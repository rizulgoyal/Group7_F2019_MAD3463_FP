package com.lambton.Vehicle;

import com.lambton.IPrintable;

public final class Car extends Vehicle implements IPrintable {
    //declaring variables

    private float carMaintenanceCost;
    private String insuranceCompany;
    private String insurance;

    //Constructor

    public Car(int employeeID, String employeeName, int employeeAge, boolean vehicle,String make, String plate, float carMaintenanceCost, String insuranceCompany, String insurance) {
        super(employeeID, employeeName, employeeAge, make, plate, vehicle);
        this.carMaintenanceCost = carMaintenanceCost;
        this.insuranceCompany = insuranceCompany;
        this.insurance = insurance;
    }


    //Getter and Setter

    public float getCarMaintenanceCost() {
        return carMaintenanceCost;
    }

    public void setCarMaintenanceCost(float carMaintenanceCost) {
        this.carMaintenanceCost = carMaintenanceCost;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsurance() {
        return insurance;
    }


    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }


    //Iprintable method is overloaded


    @Override
    public void printMyData() {

        super.printMyData();

        if(this.isVehicle() == true)
        {
            System.out.println("The Employee has car");
            System.out.println("The Make is : " +this.getMake());
            System.out.println("The Plate no is : "+this.getPlate());

            System.out.println("The Insurance Company name is : " + getInsuranceCompany());

            try {

                if (getInsurance().equalsIgnoreCase("TrUe")) {
                    System.out.println("The Insurance is Active ");
                } else if (getInsurance().equalsIgnoreCase("False")) {
                    System.out.println("The Insurance is Not Active ");
                } else throw new Exception("Please Insert True or False for Insurance Status");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            System.out.println("Maintenance Cost: " + carMaintenanceCost + "$");
        }
        else
        {
            System.out.println("The employee has no vehicle registered");
        }



    }

    @Override
    public float calcEarnings() {
        return 0;
    }
}