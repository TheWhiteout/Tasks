
public class RegularPolygon {
	// Number of sides
	private int n = 3;
	private double sideLength = 1;
	// Coordinates of the center of the polygon
	private double x = 0;
	private double y = 0;

	RegularPolygon() {
	}

	RegularPolygon(int n, double sideLength) {
		this.n = n;
		this.sideLength = sideLength;
	}

	RegularPolygon(int n, double sideLength, double x, double y) {
		this.n = n;
		this.sideLength = sideLength;
		this.x = x;
		this.y = y;
	}

	void setSideNumber(int n) {
		this.n = n;
	}

	void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	void setCenterX(double x) {
		this.x = x;
	}

	void setCenterY(double y) {
		this.y = y;
	}

	int getSideNumber() {
		return n;
	}

	double getSideLength() {
		return sideLength;
	}

	double getCenterX() {
		return x;
	}

	double getCenterY() {
		return y;
	}

	double getPerimeter() {
		return n * sideLength;
	}

	double getArea() {
		return (n * sideLength * sideLength) / (4 * Math.tan(Math.PI / n));
	}
}
