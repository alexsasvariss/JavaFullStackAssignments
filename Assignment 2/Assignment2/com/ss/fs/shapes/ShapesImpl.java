package com.ss.fs.shapes;

public class ShapesImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Initialisation of values. Change these to test different calculations
		Rectangle rect = new Rectangle(5.0, 5.0);
		Triangle tri = new Triangle(5.0, 5.0);
		Circle cir = new Circle(5.0);
		
		rect.calculateArea();
		tri.calculateArea();
		cir.calculateArea();
		
		System.out.println("*******************");
		rect.display();
		System.out.println("*******************");
		tri.display();
		System.out.println("*******************");
		cir.display();
		System.out.println("*******************");
	}

}
