package week12;

public class shapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(10,10);
		Circle c = new Circle(10);
		Cube cube = new Cube(5,10,10);
		Sphere sp = new Sphere(10);
		Cylinder cy = new Cylinder(10, 10);
		
		System.out.println(s.getArea());
		System.out.println(s.getVolume());
		System.out.println();
		System.out.println(c.getArea());
		System.out.println(c.getVolume());
		System.out.println();
		System.out.println(cube.getArea());
		System.out.println(cube.getVolume());
		System.out.println();
		System.out.println(sp.getArea());
		System.out.println(sp.getVolume());
		System.out.println();
		System.out.println(cy.getArea());
		System.out.println(cy.getVolume());
	}

}
