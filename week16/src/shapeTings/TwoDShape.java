package shapeTings;

public abstract class TwoDShape implements Shape{

    class rectangle{
        private double width;
        private double height;

        rectangle(double width, double height){
            this.height = height;
            this.width = width;
        }

        TwoDShape o = new TwoDShape() {
            @Override
            public double area() {
                return width * height;
            }

            @Override
            public double perimeter() {
                return 2 * (width + height);
            }
        };


        double getArea(){
            return o.area();
        }

        double getPerimeter(){
            return o.perimeter();
        }
    }

    class circle{
        private double radius;
        private double pi = 3.14159;

        circle(double radius){
            this.radius = radius;
        }

        TwoDShape o = new TwoDShape() {
            @Override
            public double area() {
                return pi * radius * radius;
            }

            @Override
            public double perimeter() {
                return 2 * pi * radius;
            }
        };

        double getArea(){
            return o.area();
        }

        double getPerimeter(){
            return o.perimeter();
        }
    }
}
