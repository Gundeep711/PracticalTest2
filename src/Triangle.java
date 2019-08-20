public class Triangle extends Shape  implements TwoDimensionalShapeInterface {

	private double base;
	private double height;
	private String color;

	public Triangle(double base, double height, String color) {
		super();
		this.base = base;
		this.height = height;
		this.color=color;
	}

	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double calculateArea() {
		double areaOfTriangle;
		areaOfTriangle = 0.5 * this.base * this.height;
		return areaOfTriangle;
	}

	@Override
	public void printInfo() {
		double area=calculateArea();
		System.out.println("Base of triangle is : "+this.getBase());
		System.out.println("Height of triangle is : "+this.getHeight());
		System.out.println("Color of triangle is : "+this.color);
		System.out.println("Area of triangle is : "+area);
		

	}

}
