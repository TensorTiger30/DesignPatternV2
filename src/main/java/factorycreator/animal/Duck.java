package factorycreator.animal;

public class Duck implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Duck Says: Pack-pack");
    }
}
