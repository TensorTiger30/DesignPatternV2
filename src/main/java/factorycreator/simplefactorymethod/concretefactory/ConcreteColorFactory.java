package factorycreator.simplefactorymethod.concretefactory;

import factorycreator.color.Blue;
import factorycreator.color.Green;
import factorycreator.color.IColor;
import factorycreator.color.Red;

import java.util.Objects;

public class ConcreteColorFactory {
    public static IColor getColor(String colorType) {

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
