public class FactoryPatternDemo {
    
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        System.out.println("CIRCLE AREA:" +circle.getArea());

        Shape rectangle = factory.getShape("RECTANGLE");
        System.out.println("RECTANGLE AREA :" +rectangle.getArea());

        Shape triangle = factory.getShape("TRIANGLE");
        System.out.println("TRIANGLE AREA :" +triangle.getArea());

    }
}
