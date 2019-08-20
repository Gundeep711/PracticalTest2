public class Triangle implements TwoDimensionalShapeInterface {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
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
		System.out.println("Area of triangle is : "+area);

	}

}
