import java.util.ArrayList;

public class Square extends Shape implements TwoDimensionalShapeInterface{
	
	private double side;
	private String color;


	public Square(double side, String color) {
		super();
		this.side = side;
		this.color=color;
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double calculateArea() {
		double areaOfSquare;
		areaOfSquare=this.side * this.side;
		return areaOfSquare;
	}

	@Override
	public void printInfo() {
		double area=calculateArea();
		System.out.println("**************************************");
		System.out.println("Side of square is : "+this.getSide()+"\nArea of Square is : "+area+"\nColor of Square is : "+this.color);
		System.out.println("**************************************");
		
		
	}

}
