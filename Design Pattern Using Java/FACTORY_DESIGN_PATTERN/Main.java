package FACTORY_DESIGN_PATTERN;

public class Main {
    public static void main(String[] args) {
        FactoryShapes factoryShapes=new FactoryShapes();
        Shape shape1= factoryShapes.getShapes("Circle");
        Shape shape2= factoryShapes.getShapes("Rectangle");
        Shape shape3= factoryShapes.getShapes("Triangle");

        shape1.draw();
        shape2.draw();
        shape3.draw();
       }
}
