package factorycreator.simplefactorymethod.abstractfactory;

import factorycreator.shape.IShape;

public abstract class AbstractShapeFactory {
    protected abstract IShape factoryMethod();

    public IShape getShape() {
        return factoryMethod();
    }
}
