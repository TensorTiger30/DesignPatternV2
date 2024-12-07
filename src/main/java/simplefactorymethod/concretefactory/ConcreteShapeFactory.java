package simplefactorymethod.concretefactory;

import shape.Circle;
import shape.Rectangle;
import shape.IShape;
import shape.Square;

import java.util.Objects;

public class ConcreteShapeFactory {
    public static IShape getShape(String shapeType) {

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
}
