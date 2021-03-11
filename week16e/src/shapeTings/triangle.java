package shapeTings;

import static java.lang.Math.sqrt;


public class triangle implements TwoDShape{
    private double width;
    private double height;
    private double sizeA;
    private double sizeB;
    private double sizeC;
    private boolean threeSide;

    triangle(double width, double height){
        threeSide = false;
        this.height = height;
        this.width = width;
    }

    triangle(double sizeA, double sizeB, double sizeC){
        threeSide = true;
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeC = sizeC;

    }
    @Override
    public double area() {
        if(!threeSide) return (width * height) / 2;

        double temp = sizeA + sizeB + sizeC;

        double p = temp/2;

        double a = sqrt(p*(p-sizeA)*(p-sizeB)*(p-sizeC));

        return a;
    }


    @Override
    public double perimeter() {
        if(!threeSide){
            System.out.println("its a bit mad ngl g");
            return 2 * (width + height);
        }
        else{
            return sizeA + sizeB + sizeC;
        }
    }
}
