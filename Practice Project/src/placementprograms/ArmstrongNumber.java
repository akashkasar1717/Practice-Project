package placementprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 1634;
		int sum = 0;
		int rem = 0;
		int num1 = num;

		while (num > 0) {
			rem = num % 10;
			sum += Math.pow(rem, 4);
			num = num / 10;
		}
		if (sum == num1) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
