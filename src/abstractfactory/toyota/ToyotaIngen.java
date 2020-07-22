package abstractfactory.toyota;

import abstractfactory.Ingener;

public class ToyotaIngen implements Ingener {
    @Override
    public void designCar() {
        System.out.println("Design Toyota car");
    }
}
