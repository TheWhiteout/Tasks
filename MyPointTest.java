
public class MyPointTest {

	public static void main(String[] args) {
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		System.out.println(point1.distance(point2));
		System.out.println(point1.distance(point2.getX(), point2.getY()));
		System.out.println(MyPoint.distance(point1, point2));
	}

}
