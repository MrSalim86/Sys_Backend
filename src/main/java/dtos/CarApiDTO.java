package dtos;

public class CarApiDTO {

    private int id;
    private int make_id;
    private String name;

    public CarApiDTO(int id, int make_id, String name) {
        this.id = id;
        this.make_id = make_id;
        this.name = name;
    }

    public CarApiDTO() {
    }

    public CarApiDTO(CarDTO cardto) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMake_id() {
        return make_id;
    }

    public void setMake_id(int make_id) {
        this.make_id = make_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarApiDTO{" +
                "id=" + id +
                ", make_id=" + make_id +
                ", name='" + name + '\'' +
                '}';
    }
}
