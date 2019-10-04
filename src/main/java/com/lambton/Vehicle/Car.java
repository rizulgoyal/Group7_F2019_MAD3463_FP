package com.lambton.Vehicle;

import com.lambton.IPrintable;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Car extends Vehicle implements IPrintable {
    //declaring variables
    JSONObject jsonObject;
    String carMaintainceCost;
    String insuranceCompany;
    Boolean insurance;

    public Car(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
        super.make= (String) jsonObject.get("make");
        super.Plate = (String) jsonObject.get("plate");
        model = (String) jsonObject.get("model");
        insurance = (Boolean) jsonObject.get("insurance");

}





    @Override
    public void printMyData() {
        System.out.println("The Make is : " +this.getMake());
        System.out.println("The Plate no is : "+this.getPlate());
        System.out.println("The Insurance Company name is : " +getInsuranceCompany());
        System.out.println("The Insurance is : "+getInsurance());

    }
}
