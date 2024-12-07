package simplefactorymethod.abstractfactory;

import shape.IShape;
import shape.Square;

public class SquareShapeFactory extends AbstractShapeFactory {
    @Override
    protected IShape factoryMethod() {
        return new Square();
    }
}
