import abstractfactorymethod.AbstractFactory;
import abstractfactorymethod.FactoryProducer;
import color.IColor;
import simplefactorymethod.abstractfactory.RectangleShapeFactory;
import simplefactorymethod.abstractfactory.SquareShapeFactory;
import animal.IAnimal;
import simplefactorymethod.challengefactory.AnimalFactory;
import simplefactorymethod.concretefactory.ConcreteShapeFactory;
import shape.IShape;
import simplefactorymethod.staticoncretefactory.StaticConcreteFactory;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        // Client Interaction -> Abstract Factory
        IShape shape1 = new RectangleShapeFactory().getShape();
        shape1.draw();

        IShape shape2 = new SquareShapeFactory().getShape();
        shape2.draw();


        // Client Interaction -> Concrete Factory
        // Instantiate Concrete Shape Factory
        ConcreteShapeFactory concreteShapeFactory = new ConcreteShapeFactory();
        // Get Shape Instance from concreteShapeFactory
        IShape shape3 = concreteShapeFactory.getShape("SQUARE");
        Objects.requireNonNull(shape3).draw();

        IShape shape4 = concreteShapeFactory.getShape("RECTANGLE");
        Objects.requireNonNull(shape4).draw();

        IShape shape5 = concreteShapeFactory.getShape("CIRCLE");
        Objects.requireNonNull(shape5).draw();

        // Client Interaction -> Static Concrete Factory
        IShape shape6 = StaticConcreteFactory.getShape("SQUARE");
        Objects.requireNonNull(shape6).draw();

        IShape shape7 = StaticConcreteFactory.getShape("RECTANGLE");
        Objects.requireNonNull(shape7).draw();

        IShape shape8 = StaticConcreteFactory.getShape("CIRCLE");
        Objects.requireNonNull(shape8).draw();

        // Client Interaction -> Challenge Static Animal Concrete Factory
        IAnimal animal1 = AnimalFactory.getAnimal("TIGER");
        Objects.requireNonNull(animal1).speak();

        IAnimal animal2 = AnimalFactory.getAnimal("DUCK");
        Objects.requireNonNull(animal2).speak();

        // Client Interaction -> Abstract Factory
        AbstractFactory abstractFactory = FactoryProducer.getFactory("SHAPE");

        IShape circle = Objects.requireNonNull(abstractFactory).getShape("CIRCLE");
        circle.draw();
        IShape rectangle = Objects.requireNonNull(abstractFactory).getShape("RECTANGLE");
        rectangle.draw();
        IShape square = Objects.requireNonNull(abstractFactory).getShape("SQUARE");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        IColor red = Objects.requireNonNull(colorFactory).getColor("RED");
        red.fill();
        IColor green = Objects.requireNonNull(colorFactory).getColor("GREEN");
        green.fill();
        IColor blue = Objects.requireNonNull(colorFactory).getColor("BLUE");
        blue.fill();


    }
}
