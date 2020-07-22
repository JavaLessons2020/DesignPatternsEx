package builder;

public class Run {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .carName("Tesla")
                .carMaxSpeed(210)
                .carType("sedan")
                .createCar();

        System.out.println(car);

    }
}
