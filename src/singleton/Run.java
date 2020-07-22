package singleton;

public class Run {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        System.out.println(logger1.hashCode());
        logger1.setData("data1");
        logger2.setData("data2");

        System.out.println(logger1.getData());
        System.out.println(logger2.getData());

    }
}
