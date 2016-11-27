import shapes.Rectangle;

import shapes.Square;

import utils.Math;



public class Driver {

	public static void main(String[] args) {

		Square s1 = new Square(100);

		System.out.println("The area of s1 is " + s1.getArea());

		System.out.println("The approximate diagonal of s1 is " + s1.getDiagonal());

		Rectangle r1 = new Rectangle(80, 50);

		System.out.println("The area of r1 is " + r1.getArea());

		System.out.println("The approximate diagonal of r1 is " + r1.getDiagonal());

		

		double number = 15.6;

		int value = (int)(number);

		

		System.out.println(Math.factorial(value));

		System.out.println(Math.factorialLoop(value));

	}

}