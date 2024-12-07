package simplefactorymethod.abstractfactory;

import shape.IShape;

public abstract class AbstractShapeFactory {
    protected abstract IShape factoryMethod();

    public IShape getShape() {
        return factoryMethod();
    }
}
