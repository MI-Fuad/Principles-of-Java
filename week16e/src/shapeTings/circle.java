package shapeTings;

public class circle implements TwoDShape{
    private double radius;
    private double pi = 3.14159;

    circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }
}
