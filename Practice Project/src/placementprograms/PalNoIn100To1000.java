package placementprograms;

public class PalNoIn100To1000 {
	public static void getPal(int num) {
		int sum = 0;
		int rem = 0;
		int num1 = num;
		while (num > 0) {
			rem = num % 10;
			sum = rem + sum * 10;
			num = num / 10;
		}
		if (num1 == sum) {
			System.out.print(num1 + " ");
		}
	}

	public static void main(String[] args) {
		for (int i = 100; i <= 1000; i++) {
			getPal(i);
		}
	}

}
