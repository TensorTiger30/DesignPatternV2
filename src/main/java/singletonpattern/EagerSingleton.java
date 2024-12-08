package singletonpattern;

public class EagerSingleton {

    // create an instance of singleton in a static initializer, code is guaranteed to be thread safe
    private static final EagerSingleton uniqueInstance = new EagerSingleton();
    private int data = 0;

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
