package simplefactorymethod.abstractfactory;

import shape.Rectangle;
import shape.IShape;

public class RectangleShapeFactory extends AbstractShapeFactory {
    @Override
    protected IShape factoryMethod() {
        return new Rectangle();
    }
}
