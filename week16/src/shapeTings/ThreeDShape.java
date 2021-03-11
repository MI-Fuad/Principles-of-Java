package shapeTings;

public abstract class ThreeDShape implements Shape{
    class cylinder{
        private double height;
        private double radius;
        private double pi = 3.14159;

        cylinder(double height, double radius){
            this.height = height;
            this.radius = radius;
        }

        ThreeDShape o = new ThreeDShape() {
            @Override
            public double area() {
                return (2 * pi * radius * height) + areaOfTheCircle();
            }

            @Override
            public double perimeter() {
                return 2 * (pi * (radius*2) + height);
            }
        };

        private double areaOfTheCircle(){
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

            TwoDShape.circle temp = o.new circle(radius);

            return temp.getArea();

        }

        double getArea(){
            return o.area();
        }

        double getPerimeter(){
            return o.perimeter();
        }
    }
}
