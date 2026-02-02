public class Rectangle implements Shape {
    private double height;
    private double weight;

    public Rectangle(){
        this.height = 2.0;
        this.weight = 1.5;
    }
    public double getArea(){
        return height * weight;
    }
}
