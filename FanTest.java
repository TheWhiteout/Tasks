
public class FanTest {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setSwitchedOn(true);
		fan2.setSpeed(Fan.MEDIUM);
		System.out.println(fan1.toString());
		System.out.println();
		System.out.println(fan2.toString());
	}
}
