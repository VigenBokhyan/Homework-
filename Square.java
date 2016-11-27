package shapes;



public class Square {

	private int sideLength;

	private double diagonal;

	

	public Square(int length) {

		sideLength = length;

		diagonal = Math.sqrt(2) * length;

	}

	

	public Square(){

		sideLength = 10;

	}

	

	public int getArea(){

		return sideLength * sideLength;

	}

	

	public double getDiagonal() {

		return Math.floor(diagonal);

	}

}