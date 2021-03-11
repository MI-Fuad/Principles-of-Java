package week12;

interface Area{
	double getArea();
}

interface Volume{
	double getVolume();
}

public abstract class Shape{
	public Shape(String id) {
		this.id = id;
	}
	private String id;
}

