public class Car extends Vehicle {

    private String type;

    public Car(String brand, String type) {
        super(brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}