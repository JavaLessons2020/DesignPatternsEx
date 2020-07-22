package builder;

public class Car {
    String name;
    int maxSpeed;
    String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                '}';
    }
}
