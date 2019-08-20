
public class Square implements TwoDimensionalShapeInterface{
	
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
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
		System.out.println("Side of square is : "+this.getSide()+" and it's area is : "+area);
		
		
	}

}
