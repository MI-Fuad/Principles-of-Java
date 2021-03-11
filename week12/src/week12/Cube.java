package week12;

public class Cube implements Area, Volume{

	double nOs;
	double w;
	double h;
	public Cube(double nOs, double w, double h) {
		this.w = w;
		this.h= h;
		this.nOs = nOs;
	}
	
	public double getVolume() {
		return w*h*h;
	}

	public double getArea() {
		double worked = w*h;
		return worked * nOs;	
	}

}