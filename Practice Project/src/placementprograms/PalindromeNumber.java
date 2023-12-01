package placementprograms;

public class PalindromeNumber {
	public static void main(String[] args) {

		int num = 121;
		int sum = 0;
		int rem = 0;
		int num1 = num;
		while (num > 0) {
			rem = num % 10;
			sum = rem + sum * 10;
			num = num / 10;
		}
		if (sum == num1) {
			System.out.println("is pal");
		} else {
			System.out.println("is not pal");
		}

	}

}
