package abstractfactorymethod;

import color.IColor;
import shape.IShape;

public abstract class AbstractFactory {
    public abstract IShape getShape(String shapeType);
    public abstract IColor getColor(String colorType);
}
