package factorymethod;

public class CompTableFactory implements TableFactory {
    @Override
    public Table createTable() {
        return new CompTable();
    }
}
