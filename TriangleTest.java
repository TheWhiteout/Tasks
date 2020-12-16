import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		double side1, side2, side3;
		Scanner input = new Scanner(System.in);
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		input.nextLine();
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(input.nextLine());
		triangle.setFilled(input.nextBoolean());
		System.out.println(triangle.toString());
		System.out.println(triangle.printTriangle());
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimeter());
	}

}
