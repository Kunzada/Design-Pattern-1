package creational.abstractfactory;

public class FactoryProducer {
    public static abstractFactory getFactory(String factory){
        if(factory == null){
            return null;
        } else if(factory.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
