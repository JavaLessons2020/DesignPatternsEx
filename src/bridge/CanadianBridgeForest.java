package bridge;

public class CanadianBridgeForest extends BridgeForest {


    public CanadianBridgeForest(Animal animal) {
        super(animal);
    }

    @Override
    public void animalForest() {
        System.out.println("Canadian forest has animals");
        animal.walk();
    }
}
