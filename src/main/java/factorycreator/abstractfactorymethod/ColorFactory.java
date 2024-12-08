package factorycreator.abstractfactorymethod;

import factorycreator.color.Blue;
import factorycreator.color.Green;
import factorycreator.color.IColor;
import factorycreator.color.Red;
import factorycreator.shape.IShape;

import java.util.Objects;

public class ColorFactory extends AbstractFactory {
    @Override
    public IShape getShape(String shapeType) {
        return null;
    }

    @Override
    public IColor getColor(String colorType) {
        if (Objects.isNull(colorType)) {
            return null;
        }

        return switch (colorType.toUpperCase()) {
            case "RED" -> new Red();
            case "BLUE" -> new Blue();
            case "GREEN" -> new Green();
            default -> null;
        };
    }
}
