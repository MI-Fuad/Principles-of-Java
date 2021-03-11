package week12;

public class Cylinder implements Area, Volume{

	double r;
	double h;
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}
	
	public double getVolume() {
		double pi = 3.14159;
		return pi*r*r*h;
	}

	public double getArea() {
		double pi = 3.14159;
		double aOc = pi*r*r;
		double aOs = 2*pi*r*h;
		return (aOc*2) + aOs;	
	}
}