package dtos;

import entities.Car;

import java.util.ArrayList;

public class CarDTO {
    private int make_id;
    private String Make_Name;
    private int Model_ID;
    private String Model_Name;
    private ArrayList<Car> cars;

    public int getMake_id() {
        return make_id;
    }

    public String getMake_Name() {
        return Make_Name;
    }

    public int getModel_ID() {
        return Model_ID;
    }

    public String getModel_Name() {
        return Model_Name;
    }
}
