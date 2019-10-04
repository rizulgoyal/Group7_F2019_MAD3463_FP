package com.lambton.Vehicle;

import com.lambton.IPrintable;
import org.json.simple.JSONObject;

public class Motorcycle extends Vehicle implements IPrintable{
    //declaring variables

    JSONObject jsonObject;
    String model;
    String make;
    Boolean insurance;

    //constructor


    public Motorcycle(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
        super.make= (String) jsonObject.get("make");
        super.plate = (String) jsonObject.get("plate");
        model = (String) jsonObject.get("model");
        insurance = (Boolean) jsonObject.get("insurance");
    }


    //iprintable method


    @Override
    public void printMyData() {
            System.out.println("Has a " +jsonObject.get("type") );
            System.out.println("Manufacturer Name : " + make );
            System.out.println("Licence Plate : " +plate);
            System.out.println("Model Code :" +model);
            if(insurance=true)
                System.out.println("Insurance : Yes");
            else
                System.out.println("Insurance : No");
    }
}
