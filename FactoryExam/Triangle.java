public class Triangle implements Shape {
    private double side_a;
    private double side_b;
    private double side_c;

    public Triangle(){
        this.side_a = 3.0;
        this.side_b = 4.0;
        this.side_c = 5.0;
    }
    public double getArea(){
        double s = (side_a + side_b + side_c)/2;
        return Math.sqrt(s * (s-side_a) * (s-side_b) * (s-side_c));
    }
}
