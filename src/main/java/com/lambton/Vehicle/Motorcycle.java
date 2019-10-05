package com.lambton.Vehicle;

import com.lambton.IPrintable;

public final class Motorcycle extends Vehicle implements IPrintable {
    //declaring variables

    private float bikeMaintenanceCost;
    private String insuranceCompany;
    private String insurance;

    //constructor

    public Motorcycle(int employeeID, String employeeName, int employeeAge, boolean vehicle,String make, String plate, float carMaintenanceCost, String insuranceCompany, String insurance) {
        super(employeeID, employeeName, employeeAge, make, plate, vehicle);
        this.bikeMaintenanceCost = carMaintenanceCost;
        this.insuranceCompany = insuranceCompany;
        this.insurance = insurance;
    }


    //Getter and Setter


    public float getBikeMaintenanceCost() {
        return bikeMaintenanceCost;
    }

    public void setBikeMaintenanceCost(float bikeMaintenanceCost) {
        this.bikeMaintenanceCost = bikeMaintenanceCost;
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


    //Display function by using IPrintable Interface

    @Override
    public void printMyData() {

        super.printMyData();

        if(this.isVehicle() == true)
        {
            System.out.println("The Employee has Motorcycle");
            System.out.println("The Make is : " +this.getMake());
            System.out.println("The Plate no is : "+this.getPlate());

            System.out.println("The Insurance Company name is : " + getInsuranceCompany());
            //try and catch to input correct boolean value as string
            try {

                if (getInsurance().equalsIgnoreCase("TrUe")) {
                    System.out.println("The Insurance is Active ");
                } else if (getInsurance().equalsIgnoreCase("False")) {
                    System.out.println("The Insurance is Not Active ");
                } else throw new Exception("Please Insert True or False for Insurance Status");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            System.out.println("Maintenance Cost: " + bikeMaintenanceCost + "$");

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
