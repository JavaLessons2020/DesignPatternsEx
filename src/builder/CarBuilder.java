package builder;

public class CarBuilder {

    String carName;
    int carSpeed;
    String carType;

    CarBuilder carName(String carName){
        this.carName = carName;
        return this;
    }

    CarBuilder carMaxSpeed(int carSpeed){
        this.carSpeed = carSpeed;
        return this;
    }

    CarBuilder carType(String carType){
        this.carType = carType;
        return this;
    }


    public  Car createCar() {
        Car car = new Car();
        car.setName(carName);
        car.setMaxSpeed(carSpeed);
        car.setType(carType);
        return car;
    }
}
