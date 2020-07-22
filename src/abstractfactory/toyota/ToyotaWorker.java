package abstractfactory.toyota;

import abstractfactory.Worker;

public class ToyotaWorker implements Worker {
    @Override
    public void createCar() {
        System.out.println("create Toyota car");
    }
}
