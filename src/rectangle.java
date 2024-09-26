
public class rectangle extends shape{
	
	rectangle(int width, int height) {
		super(4);
		this.width = width;
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	protected double width;
	protected double height;

		
	
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	public String toString() {
		return "The area of the rectangle with the height "+height+" and width "+width+" is "+getArea();
	}
	
}

