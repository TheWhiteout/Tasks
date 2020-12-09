
public class TimeTest {

	public static void main(String[] args) {
		Time t800 = new Time();
		Time t1000 = new Time(555550000);
		Time t10 = new Time(5, 23, 55);
		System.out.println("T-800");
		t800.getTime();
		System.out.println();
		System.out.println("T-1000");
		t1000.getTime();
		System.out.println();
		System.out.println("T-X");
		t10.getTime();
	}

}
