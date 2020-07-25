package bridge;

public class UkrainianBridgeForest extends BridgeForest {


    public UkrainianBridgeForest(Animal animal) {
        super(animal);
    }

    @Override
    public void animalForest() {
        System.out.println("Ukrainian forest has animals");
        animal.walk();
    }
}
