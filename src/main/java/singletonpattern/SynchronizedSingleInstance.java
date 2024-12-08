package singletonpattern;

import java.util.Objects;

public class SynchronizedSingleInstance {
    private static SynchronizedSingleInstance singletonInstance = null;
    private int data = 0;

    private SynchronizedSingleInstance() {

    }

    // By Adding the synchronized keyword to getInstance method we force every thread
    // to wait its turn before it can enter the method
    public static synchronized SynchronizedSingleInstance getInstance() {

        if (Objects.isNull(singletonInstance)) {
            singletonInstance = new SynchronizedSingleInstance();
        }

        return singletonInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
