package factorycreator.abstractfactorymethod;

import factorycreator.color.IColor;
import factorycreator.shape.IShape;

public abstract class AbstractFactory {
    public abstract IShape getShape(String shapeType);
    public abstract IColor getColor(String colorType);
}
