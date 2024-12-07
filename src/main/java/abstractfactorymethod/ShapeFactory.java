package abstractfactorymethod;

import color.IColor;
import shape.Circle;
import shape.IShape;
import shape.Rectangle;
import shape.Square;

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
