
public class CircleTest {

	public static void main(String[] args) {
		Circle c0001 = new Circle();
		Circle c0002 = new Circle(25);
		Circle c0003 = new Circle(125);
		System.out.println(c0001.getRadius());
		System.out.println(c0002.getRadius());
		System.out.println(c0003.getRadius());
		System.out.println(c0001.getArea());
		System.out.println(c0001.getPerimeter());
		c0001.setRadius(10);
		System.out.println(c0001.getRadius());
	}

}
