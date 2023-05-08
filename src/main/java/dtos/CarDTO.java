package dtos;

import entities.Car;

import java.util.ArrayList;

public class CarDTO {

    private String make;
    private String model;
    private int year;
    private String location;
    private int price;
    private String username;
    private ArrayList<Car> cars;

    public CarDTO(String make, String model, int year, String location, int price, String username, ArrayList<Car> cars) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.location = location;
        this.price = price;
        this.username = username;
        this.cars = cars;
    }

    public CarDTO() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", username='" + username + '\'' +
                ", cars=" + cars +
                '}';
    }
}
