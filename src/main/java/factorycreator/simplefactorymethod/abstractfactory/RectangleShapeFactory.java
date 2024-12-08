package factorycreator.simplefactorymethod.abstractfactory;

import factorycreator.shape.Rectangle;
import factorycreator.shape.IShape;

public class RectangleShapeFactory extends AbstractShapeFactory {
    @Override
    protected IShape factoryMethod() {
        return new Rectangle();
    }
}
