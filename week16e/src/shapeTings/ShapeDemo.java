package shapeTings;

public abstract class ShapeDemo{
    public static void main(String[] args) {


        System.out.println("   **   ");
        System.out.println("  *  *  ");
        System.out.println(" *    * ");
        System.out.println("*      *");
        System.out.println(" *    * ");
        System.out.println("  *  *  ");
        System.out.println("   **   ");


        Shape circle = new circle(10);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println();
        System.out.println();


        System.out.println("********");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("********");

        Shape rect = new rect(10,10);
        System.out.println("Circle deets");
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
        System.out.println();
        System.out.println();

        System.out.println("   **   ");
        System.out.println("  *  *  ");
        System.out.println(" *    * ");
        System.out.println("*      *");
        System.out.println("**    **");
        System.out.println("* *  * *");
        System.out.println("*  **  *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println(" *    * ");
        System.out.println("  *  *  ");
        System.out.println("   **   ");
        Shape cylinder = new cylinder(10, 5);
        System.out.println("Cylinders deets init");
        System.out.println(cylinder.area());
        System.out.println(cylinder.perimeter());
        System.out.println();
        System.out.println();

        System.out.println("**      ");
        System.out.println("* *     ");
        System.out.println("*  *    ");
        System.out.println("*   *   ");
        System.out.println("*    *  ");
        System.out.println("*     * ");
        System.out.println("*      *");
        System.out.println("*********");

        Shape tri = new triangle(10,10,10);
        System.out.println("Tree side square init ");

        System.out.println("Triangle with 3 sides (no height)" + tri.area());
        System.out.println();
        System.out.println();

        System.out.println("   **   ");
        System.out.println("  *  *  ");
        System.out.println(" *    * ");
        System.out.println("*      *");
        System.out.println("********");

        Shape tri2 = new triangle(10,10);
        System.out.println("ninja throwing tree sided square ting");

        System.out.println("Triangle with height" + tri2.area());
        System.out.println(tri2.perimeter());

    }
}
