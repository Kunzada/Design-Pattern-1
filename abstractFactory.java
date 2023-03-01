package creational.abstractfactory;

public abstract class abstractFactory {

        abstract IShape getShape(String shape);
        abstract IShape fillColor(String color);
    }
}
