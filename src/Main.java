
public class Main {


	
	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		rectangle s1 = new rectangle(2,4);
		Circle c1 = new Circle(4);
		ellipse e1 = new ellipse(8,10);
		
		double r = s1.getArea();
		String wordR = s1.toString();
		System.out.println(wordR);
		
		double c = c1.getArea();
		String wordC = c1.toString();
		System.out.println(wordC);
		
		double E = e1.getArea();
		String wordE = e1.toString();
		System.out.println(wordE);
	}
}



	


