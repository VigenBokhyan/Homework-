package shapes;



public class Rectangle {

	private int startHeight;

	private int startWidth;

	private double diagonal;

	

	public Rectangle(int height, int width) {

		this.startWidth = width;

		this.startHeight = height;

		this.diagonal = Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));

	}

	

	public Rectangle() {

		this.startHeight = 10;

		this.startWidth = 15;

	}

	

	public int getArea(){

		return startHeight * startWidth;

	}

	

	public double getDiagonal(){

		return Math.floor(diagonal);

	}

}