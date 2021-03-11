package shapeTings;

public class rect implements  TwoDShape{
        private double width;
        private double height;

    rect(double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

