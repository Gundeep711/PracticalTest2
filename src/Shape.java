import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shape {
	
	private ArrayList<Shape> shapeList;

	public Shape(ArrayList<Shape> shapeList) {
		super();
		this.shapeList = shapeList;
	}

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}

}
