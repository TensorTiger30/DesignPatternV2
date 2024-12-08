package singletonpattern;

public class DoubleCheckLockingSingleton {
    private volatile static DoubleCheckLockingSingleton uniqueInstance = null;
    private int data = 0;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {

        if (uniqueInstance == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckLockingSingleton();
                }
            }
        }

        return uniqueInstance;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
