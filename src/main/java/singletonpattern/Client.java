package singletonpattern;

public class Client {
    public static void main(String[] args) {
        LazySingleton s = LazySingleton.getInstance();

        s.setData(100);
        System.out.println("First instance data: " + s.getData());

        s = null;
        s = LazySingleton.getInstance();
        System.out.println("Second instance data: " + s.getData());

        SynchronizedSingleInstance s2 = SynchronizedSingleInstance.getInstance();

        s2.setData(100);
        System.out.println("First instance data: " + s2.getData());

        s2 = null;
        s2 = SynchronizedSingleInstance.getInstance();
        System.out.println("Second instance data: " + s2.getData());

        DoubleCheckLockingSingleton s3 = DoubleCheckLockingSingleton.getInstance();

        s3.setData(100);
        System.out.println("First instance data: " + s3.getData());

        s3 = null;
        s3 = DoubleCheckLockingSingleton.getInstance();
        System.out.println("Second instance data: " + s3.getData());

        EagerSingleton s4 = EagerSingleton.getInstance();

        s4.setData(100);
        System.out.println("First instance data: " + s4.getData());

        BillPughSingleton s5 = BillPughSingleton.getInstance();

        s5.setData(100);
        System.out.println("First instance data: " + s5.getData());
    }
}
