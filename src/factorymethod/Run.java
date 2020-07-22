package factorymethod;

public class Run {
    public static void main(String[] args) {

        TableFactory tableFactory = configure("HOME");
        Table table = tableFactory.createTable();
        table.info();
    }


    static TableFactory configure(String type) {
        if (type.equals("PC")) {
            return new CompTableFactory();
        } else if(type.equals("HOME")){
            return new HomeTableFactory();
        }
            System.err.println("This table is not create");
            return null;
        }

    }

