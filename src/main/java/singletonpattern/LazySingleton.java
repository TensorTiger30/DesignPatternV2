package singletonpattern;

import java.util.Objects;

public class LazySingleton {
    private static LazySingleton singletonInstance = null;
    private int data = 0;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {

        if (Objects.isNull(singletonInstance)) {
            singletonInstance = new LazySingleton();
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
