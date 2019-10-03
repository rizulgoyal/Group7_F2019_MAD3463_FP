package com.lambton.Vehicle;

public class Motorcycle extends Vehicle {
    //declaring variables

    private float carMaintenanceCost;
    private String insuranceCompany;
    private String insurance;

    //constructor

    public Motorcycle(int employeeID, String make, String plate, float carMaintenanceCost, String insuranceCompany, String insurance) {
        super(employeeID, make, plate);
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


    //Display function by using IPrintable Interface

    @Override
    public void printMyData() {
        System.out.println("The employee has Motorcycle");
        super.printMyData();
        System.out.println("The Insurance Company name is : " +getInsuranceCompany());
        try{

            if(getInsurance().equalsIgnoreCase("TrUe")) {
                System.out.println("The Insurance is Active ");
            }
            else if (getInsurance().equalsIgnoreCase("False"))
            {
                System.out.println("The Insurance is Not Active ");
            }
            else throw new Exception("Please Insert True or False for Insurance Status");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("The car maintaince cost is : "+ getCarMaintenanceCost());
    }

    @Override
    public float calcEarnings() {
        return 0;
    }
}
