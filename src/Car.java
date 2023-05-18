public class Car {
    private int id;
    private String name_car;

    public Car() {
    }

    public Car(int id, String name_car) {
        this.id = id;
        this.name_car = name_car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_car() {
        return name_car;
    }

    public void setName_car(String name_car) {
        this.name_car = name_car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name_car='" + name_car + '\'' +
                '}';
    }
}
