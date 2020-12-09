
public class MyIntegerTest {

	public static void main(String[] args) {
		char[] array = { '1', '2', '3', '4' };
		System.out.println(MyInteger.parseInt(array));
		System.out.println(MyInteger.parseInt("1234"));
		System.out.println();
		MyInteger value = new MyInteger(7);
		System.out.println(value.getValue());
		System.out.println();
		System.out.println(value.isEven());
		System.out.println(value.isOdd());
		System.out.println(value.isPrime());
		System.out.println();
		System.out.println(MyInteger.isEven(2));
		System.out.println(MyInteger.isOdd(2));
		System.out.println(MyInteger.isPrime(2));
		System.out.println();
		System.out.println(MyInteger.isEven(value));
		System.out.println(MyInteger.isOdd(value));
		System.out.println(MyInteger.isPrime(value));
		System.out.println();
		System.out.println(value.equals(7));
		System.out.println(value.equals(value));
	}

}
