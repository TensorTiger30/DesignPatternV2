package simplefactorymethod.concretefactory;

import color.Blue;
import color.Green;
import color.IColor;
import color.Red;

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
