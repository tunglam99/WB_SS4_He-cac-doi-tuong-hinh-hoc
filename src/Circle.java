public class Circle extends Shape {
    private double radius =1;

    public Circle(){

    }

    public Circle( double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius* this.radius*Math.PI;
    }

    public double getPerimeter() {
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius = "+getRadius()+ " Which is subclass of "+super.toString();
    }
}
