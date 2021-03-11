package week12;

public class Square implements Area, Volume{

	double w;
	double h;
	public Square(double w, double h) {
		this.w = w;
		this.h = h;
	}
	
	public double getVolume() {
		return w*h;
	}

	public double getArea() {
		return w*h;
	}

}
