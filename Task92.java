
public class Task92 {

	public static void main(String[] args) {
		int count = 1;
		System.out.print(2 + " ");
		for (int i = 3; count < 120; i += 2) {
			if (isPalindrome(i) && isPrime(i)) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}

	public static boolean isPrime(int check) {
		int sqr = (int) Math.sqrt(check);
		for (int i = 3; i <= sqr; i += 2) {
			if (check % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(int check) {
		String temp = Integer.toString(check);
		for (int i = 0; i < temp.length() / 2; i++) {
			if (temp.charAt(i) != temp.charAt(temp.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
