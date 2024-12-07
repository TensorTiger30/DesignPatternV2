package simplefactorymethod.challengefactory;

import animal.IAnimal;
import animal.Duck;
import animal.Tiger;

import java.util.Objects;

public class AnimalFactory {
    public static IAnimal getAnimal(String animalType) {

        if (Objects.isNull(animalType)) {
            return null;
        }

        return switch (animalType.toUpperCase()) {
            case "TIGER" -> new Tiger();
            case "DUCK" -> new Duck();
            default -> null;
        };
    }
}
