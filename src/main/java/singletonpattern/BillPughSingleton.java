package singletonpattern;

public class BillPughSingleton {
    private int data = 0;
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton uniqueInstance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
