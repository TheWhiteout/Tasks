
public class MyInteger {
	private int value;

	MyInteger(int value) {
		setValue(value);
	}

	private void setValue(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}

	boolean isEven() {
		return isEven(value);
	}

	boolean isOdd() {
		return isOdd(value);
	}

	boolean isPrime() {
		return isPrime(value);
	}

	static boolean isEven(int value) {
		return value % 2 == 0;
	}

	static boolean isOdd(int value) {
		return !isEven(value);
	}

	static boolean isPrime(int value) {
		int sqrt = (int) Math.sqrt(value);
		if (isEven(value) && value != 2) {
			return false;
		}
		for (int i = 3; i <= sqrt; i += 2) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean isEven(MyInteger value) {
		return isEven(value.getValue());
	}

	static boolean isOdd(MyInteger value) {
		return isOdd(value.getValue());
	}

	static boolean isPrime(MyInteger value) {
		return isPrime(value.getValue());
	}

	boolean equals(int value) {
		return this.value == value;
	}

	boolean equals(MyInteger value) {
		return equals(value.getValue());
	}

// Няма пък да го сглабям в низ, това е много по-мощно.
	static int parseInt(char[] array) {
		int length = array.length;
		int value = 0;
		for (int i = 0; i < length; i++) {
			value += Character.getNumericValue(array[i]) * Math.pow(10, length - i - 1);
		}
		return value;
	}

	static int parseInt(String string) {
		return Integer.parseInt(string);
	}
}
