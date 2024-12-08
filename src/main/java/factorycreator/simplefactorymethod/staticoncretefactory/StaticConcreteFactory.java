package factorycreator.simplefactorymethod.staticoncretefactory;

import factorycreator.shape.Circle;
import factorycreator.shape.Rectangle;
import factorycreator.shape.IShape;
import factorycreator.shape.Square;

import java.util.Objects;

public class StaticConcreteFactory {
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
