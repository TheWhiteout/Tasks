
public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon rp0001 = new RegularPolygon();
		RegularPolygon rp0002 = new RegularPolygon(6, 4);
		RegularPolygon rp0003 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println(rp0001.getSideNumber());
		System.out.println(rp0001.getSideLength());
		System.out.println(rp0001.getPerimeter());
		System.out.println(rp0001.getArea());
		System.out.println();
		System.out.println(rp0002.getSideNumber());
		System.out.println(rp0002.getSideLength());
		System.out.println(rp0002.getPerimeter());
		System.out.println(rp0002.getArea());
		System.out.println();
		System.out.println(rp0003.getSideNumber());
		System.out.println(rp0003.getSideLength());
		System.out.println(rp0003.getPerimeter());
		System.out.println(rp0003.getArea());
		System.out.println();

	}

}
