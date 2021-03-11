package shapeTings;

public class cylinder implements ThreeDShape{
    private double height;
    private double radius;
    private double pi = 3.14159;

    cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double area() {
        return (2 * pi) * radius * height + 2*areaOfTheCircle();
    }

    @Override
    public double perimeter() {
        return 2 * (pi * (radius*2) + height);
    }

    private double areaOfTheCircle() {
        Shape temp = new circle(radius);

        return temp.area();

    }
}