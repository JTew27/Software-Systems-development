package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the {@link ShapeCollection} interface using an underlying ordered list.
 * 
 * @author mdixon
 */
public class ShapeList implements ShapeCollection {

	/**
	 * The list of shapes
	 */
	private List<Shape> shapes = new ArrayList<Shape>();

	///////////////////////////////////////////////////////////////////////

	@Override
	public int addShape(Shape shape) {

		// TODO PART4 : add the shape to the list, then return the size of the list once added.
		shapes.add(shape);
		return shapes.size();
	}

	@Override
	public boolean removeShape(Shape shape) {

		// TODO PART4 : remove the shape to the list, returning true if actually removed, else returning false.
		if (shapes.contains(shape)) {
			shapes.remove(shape);
			return true;
		}
		return false;
	}

	@Override
	public boolean containsShape(Shape shape) {

		// TODO PART4 : return true if the list contains the given shape, else return false.
		if (shapes.contains(shape)) {
			return true;
		}
		return false;
	}

	@Override
	public int shapeCount() {

		// TODO PART4 : return the size of the list
		
		return shapes.size();
	}

	@Override
	public void clearAllShapes() {

		// TODO PART4 : remove all elements from the list
		 shapes.clear();
	}

	@Override
	public int indexOfShape(Shape shape) {

		// TODO PART4 : locate the given shape in the list, returning its index position.
		Shape shapeF = shape;
		
		for (Shape s: shapes) {
			System.out.println(s);
			
		}
		
		return 0;
	}

	@Override
	public Shape getLargestShape() {

		double area = 0;
		Shape largest = null;

		// TODO PART4 : iterate the list, finding the shape with the largest area (hint: call getArea() for each shape)
		for (Shape shape : shapes) {
			double current = shape.getArea();
			if (current > area) {
				area = current ;
				largest = shape;
				
			}
		}
		return largest;
	}

	@Override
	public Shape getSmallestShape() {

		double area = Integer.MAX_VALUE;
		Shape smallest = null;

		// TODO PART4 : iterate the list, finding the shape with the smallest area
		for (Shape shape : shapes) {
			double current = shape.getArea();
			if (current < area) {
				area = current ;
				smallest = shape;
		
			}
		}
	
		return smallest;
	}

	@Override
	public int countShapeOfName(String name) {

		int count = 0;

		// TODO PART4 : Check if given name is null
		// TODO PART4 : iterate the list, counting the number of shapes with the given name (ignoring case).
		// hint: call getName() for each shape and compare with the given name using a method
		
		for(Shape shape : shapes) {
			if (name.equalsIgnoreCase(shape.getName())) {
				count ++;
				
			}
		}
		
		
		
		return count;
	}
	
	///////////////////////////////////////////////////////////////////////

}
