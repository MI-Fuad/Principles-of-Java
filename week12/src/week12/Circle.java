package week12;

public class Circle implements Area, Volume{

	double r;
	public Circle(double r) {
		this.r = r;
	}
	
	public double getVolume() {
		double pi = 3.14159;
		return pi*r*r;
	}

	public double getArea() {
		double pi = 3.14159;
		return pi*r*r;	
	}

}
