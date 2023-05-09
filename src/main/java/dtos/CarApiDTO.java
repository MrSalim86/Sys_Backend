package dtos;

public class CarApiDTO {

    private int make_id;
    private String Make_Name;
    private int Model_ID;
    private String Model_Name;

    public CarApiDTO(CarDTO CDTO) {
        this.make_id = CDTO.getMake_id();
        this.Make_Name = CDTO.getMake_Name();
        this.Model_ID = CDTO.getModel_ID();
        this.Model_Name = CDTO.getModel_Name();
    }

    public CarApiDTO(CarApiDTO carapidto) {
    }

    public int getMake_id() {
        return make_id;
    }

    public void setMake_id(int make_id) {
        this.make_id = make_id;
    }

    public String getMake_Name() {
        return Make_Name;
    }

    public void setMake_Name(String make_Name) {
        Make_Name = make_Name;
    }

    public int getModel_ID() {
        return Model_ID;
    }

    public void setModel_ID(int model_ID) {
        Model_ID = model_ID;
    }

    public String getModel_Name() {
        return Model_Name;
    }

    public void setModel_Name(String model_Name) {
        Model_Name = model_Name;
    }
}
