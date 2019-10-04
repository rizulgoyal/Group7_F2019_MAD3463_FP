package com.lambton.Vehicle;

import com.lambton.IPrintable;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Car extends Vehicle implements IPrintable {
    //declaring variables
    JSONObject jsonObject;
    String model;
    String yearOfmake;
    Boolean insurance;

    //Constructor of car class is created
    public Car(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
        super.make= (String) jsonObject.get("make");
        super.plate = (String) jsonObject.get("plate");
        model = (String) jsonObject.get("model");
        insurance = (Boolean) jsonObject.get("insurance");

}

    @Override
    public void printMyData() {
        System.out.println("Has a " +jsonObject.get("type"));
        System.out.println("Manufacturer: " + make );
        System.out.println("Licence Plate : " +plate);
        System.out.println("Model :" +model);
        if(insurance=true)
            System.out.println("Insurance : Yes");
        else
            System.out.println("Insurance : No");
    }
}
