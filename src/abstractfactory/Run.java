package abstractfactory;

import abstractfactory.toyota.ToyotaFactory;

public class Run {
    public static void main(String[] args) {
        CarFactory carFactory = new ToyotaFactory();
        Ingener ingener = carFactory.getIngener();
        Worker worker = carFactory.getWorker();

        ingener.designCar();
        worker.createCar();
    }
}
