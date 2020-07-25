package bridge;

public class Run {
    public static void main(String[] args) {

        BridgeForest ukr = new UkrainianBridgeForest(new Fox());
        BridgeForest can = new CanadianBridgeForest(new Wolf());

        ukr.animalForest();
        can.animalForest();
    }
}
