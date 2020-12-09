
public class MyPoint {
	private double x = 0;
	private double y = 0;

	MyPoint() {
	}

	MyPoint(double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	double distance(MyPoint point) {
		return distance(point.getX(), point.getY());
	}

	double distance(double x, double y) {
		return Math.sqrt(Math.pow(x - this.getX(), 2) + Math.pow(y - this.getY(), 2));
	}

	static double distance(MyPoint point1, MyPoint point2) {
		return point1.distance(point2.getX(), point2.getY());
	}
}
