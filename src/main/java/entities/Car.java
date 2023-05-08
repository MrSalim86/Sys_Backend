package entities;

public class Car {
    private String make;
    private String model;
    private int year;
    private String location;
    private int price;
    private String username;

    public Car(String make, String model, int year, String location, int price, String username) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.location = location;
        this.price = price;
        this.username = username;
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

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", username='" + username + '\'' +
                '}';
    }
}
