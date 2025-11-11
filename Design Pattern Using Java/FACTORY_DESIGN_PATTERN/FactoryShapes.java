package FACTORY_DESIGN_PATTERN;

public class FactoryShapes {
    public Shape getShapes(String type){
        if(type.trim().equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(type.trim().equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        else if(type.trim().equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        else{
            return null;
        }
    }
}
