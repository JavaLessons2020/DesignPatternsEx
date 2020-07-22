package abstractfactory.toyota;

import abstractfactory.CarFactory;
import abstractfactory.Ingener;
import abstractfactory.Worker;

public class ToyotaFactory implements CarFactory {
    @Override
    public Ingener getIngener() {
        return new ToyotaIngen();
    }

    @Override
    public Worker getWorker() {
        return new ToyotaWorker();
    }
}
