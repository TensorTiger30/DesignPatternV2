package factorycreator.simplefactorymethod.abstractfactory;

import factorycreator.shape.IShape;
import factorycreator.shape.Square;

public class SquareShapeFactory extends AbstractShapeFactory {
    @Override
    protected IShape factoryMethod() {
        return new Square();
    }
}
