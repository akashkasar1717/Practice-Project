package placementprograms;

public class ArmstrongInRange {
	public static void getAllNumbers(int num) {
		int sum = 0;
		int rem = 0;
		int num1 = num;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (sum == num1) {
			System.out.println(num1+" ");
		}
	}

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {			
			getAllNumbers(i);		
		}
	}
}
