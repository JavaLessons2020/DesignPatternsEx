package adapter;

public class AdapterPlasticTable implements Table {

    private PlasticTable plastic;


    @Override
    public void material() {
        if (plastic != null) {
            plastic.plastic();
        }
    }

    @Override
    public void amountLags() {
        plastic.lags();
    }

    @Override
    public void color() {
        plastic.colorTable();
    }
}
