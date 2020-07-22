package factorymethod;

public class HomeTableFactory implements TableFactory {
    @Override
    public Table createTable() {
        return new HomeTable();
    }
}
