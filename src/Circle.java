
public class Circle extends shape {
	Circle(int radius) {
		super(2);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	private int radius;
	
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	int getRadius()
	{
		return (radius);	}



public double getArea() {
	double area = (radius * radius * 3.14);
	return (int)area;}
	
	
	public String toString() {
		return("radius "+radius+" area "+getArea());
	}

}
