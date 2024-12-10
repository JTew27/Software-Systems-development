
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class test extends Triangle{
@Before
public void setUpBeforeClass() throws Exception{
	System.out.println("Nothing to do");
	
}

@After
public void tearDownAfterClass() throws Exception{
	System.out.println("Complete");
}
	
@Test
 public void IsococelesTestT() {
		Triangle Triangle = new Triangle(60,40,60);
		assertTrue(Triangle.isIsosceles());
				
	}

@Test
public void isEquilateralTestT() {
	Triangle Triangle = new Triangle(60,60,60);
	assertTrue(Triangle.isEquilateral());
}

@Test
public void isScaleneTestT() {
	Triangle Triangle = new Triangle(45,60,69);
	assertTrue(Triangle.isScalene());	
}

@Test
public void multiConstructor() {
	Triangle tri = new Triangle(10,10,10);
	
	assertTrue(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertFalse(tri.isIsosceles());
	
	tri = new Triangle(10,10,20);
	
	assertFalse(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertTrue(tri.isIsosceles());
	
	tri = new Triangle(10,20,30);
	
	assertFalse(tri.isEquilateral());
	assertTrue(tri.isScalene());
	assertFalse(tri.isIsosceles());
	
}

@Test
public void setSidesTest() {
	Triangle tri = new Triangle();
	
	tri.setSides(10, 20, 30);
			
	assertFalse(tri.isEquilateral());
	assertTrue(tri.isScalene());
	assertFalse(tri.isIsosceles());
	
	tri.setSides(10, 10, 10);
	
	assertTrue(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertFalse(tri.isIsosceles());
	
	tri.setSides(20, 20, 30);
	
	assertFalse(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertTrue(tri.isIsosceles());
	
	tri.setSides(20, -20, 30);
	
	assertFalse(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertTrue(tri.isIsosceles());
	
	tri.setSides(20, 20, -30);
	
	assertFalse(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertTrue(tri.isIsosceles());
   }
   
@Test
public void testSetTwoSides() {
	
	Triangle tri = new Triangle();
	
	tri.setSides(20, 30);
			
	assertFalse(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertTrue(tri.isIsosceles());
	
	tri.setSides(90, 1);
	
	assertFalse(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertTrue(tri.isIsosceles());
	
	tri.setSides(10, 10);
	
	assertFalse(tri.isEquilateral());	// FAILS: showing comment on code is wrong!
	assertFalse(tri.isScalene());	
	assertTrue(tri.isIsosceles());		// FAILS: showing comment on code is wrong!
}

@Test
public void testSetOneSIde() {
	Triangle tri = new Triangle();
	
	tri.setSides(10);
	
	assertTrue(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertFalse(tri.isIsosceles());
	
	tri.setSides(-10);
	
	assertTrue(tri.isEquilateral());
	assertFalse(tri.isScalene());
	assertFalse(tri.isIsosceles());
}
}