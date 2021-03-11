package week12;
public class Sphere implements Area, Volume{

	double r;
	public Sphere(double r) {
		this.r = r;
	}
	
	public double getVolume() {
		double pi = 3.14159;
		return (4*pi*r*r*r)/3;
	}

	public double getArea() {
		double pi = 3.14159;
		return 4*pi*r*r;	
	}

}
