public abstract class shape{
	
	private int sides;

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	//abstract public double getArea();
	
	abstract public double getArea();
	
	shape(int sides){
		this.sides = sides;
		
	}

	
	}
	
	

