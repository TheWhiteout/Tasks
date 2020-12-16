
public class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	Triangle() {
	}

	Triangle(double side1, double side2, double side3) {
		setSide1(side1);
		setSide2(side2);
		setSide3(side3);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	double getArea() {
		return Math.sqrt((side1 + side2 + side3) * (side1 + side2 - side3) * (side1 + side3 - side2)
				* (side2 + side3 - side1) / 16);
	}

	double getPerimeter() {
		return side1 + side2 + side3;
	}

	String printTriangle() {
		return "Triangle:\n" + side1 + "\n" + side2 + "\n" + side3;
	}
}
