package bridge;

public abstract class BridgeForest {

    Animal animal;

    public BridgeForest(Animal animal) {
        this.animal = animal;
    }

    public abstract void animalForest();
}
