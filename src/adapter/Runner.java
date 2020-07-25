package adapter;

public class Runner {
    public static void main(String[] args) {
        Table table = new AdapterPlasticTable();
        table.material();
        table.amountLags();
        table.color();
    }
}
