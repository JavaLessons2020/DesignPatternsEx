package singleton;

public class Logger {
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

}
