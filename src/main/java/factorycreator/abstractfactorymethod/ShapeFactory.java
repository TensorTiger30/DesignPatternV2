package factorycreator.abstractfactorymethod;

import factorycreator.color.IColor;
import factorycreator.shape.Circle;
import factorycreator.shape.IShape;
import factorycreator.shape.Rectangle;
import factorycreator.shape.Square;

import java.util.Objects;

public class ShapeFactory extends AbstractFactory {
    @Override
    public IShape getShape(String shapeType) {
        if (Objects.isNull(shapeType)) {
            return null;
        }

        return switch (shapeType.toUpperCase()) {
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            case "CIRCLE" -> new Circle();
            default -> null;
        };
    }

    @Override
    public IColor getColor(String colorType) {
        return null;
    }
}
