
public class ellipse extends rectangle{

	
public double getArea() {
	double A = 3.14 * getWidth() * getHeight();
	return (int)A;}

ellipse( int width, int height) {
	//super(2);
	this.width = width;
	this.height = height;
	// TODO Auto-generated constructor stub
}

public String toString() {
	return("AxisA"+width+"Axis B -"+getHeight()+"area"+getArea()+"sides"+getsides();}
	
}

}
