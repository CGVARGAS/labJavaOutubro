package entities;

public class Rectangle {
	public double widht;
	public double height;
	
	
	public Rectangle(double widht, double height) {
		this.widht = widht;
		this.height = height;
	}
	
	public double area() {
		return widht * height;
	}
	
	public double perimetro() {
		return (2*widht) + (2*height);
	}
	
	public double diagonal() {
		return Math.sqrt((height*height) + (widht*widht)) ;
	}

	@Override
	public String toString() {
		return "\nRetangulo: \n=========\nArea: " 
					+ String.format("%.2f",area()) 
					+ " \nPerimetro: " 
					+ String.format("%.2f",perimetro()) 
					+ " \nDiagonal: " 
					+ String.format("%.2f",diagonal());
	}

}
