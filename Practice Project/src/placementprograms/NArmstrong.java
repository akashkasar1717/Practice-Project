package placementprograms;

public class NArmstrong {
	public static void main(String[] args) {
		int number = 1634, originalNumber, remainder, result = 0, n = 0;

		originalNumber = number;

		for (; originalNumber != 0; originalNumber /= 10, n++);

		originalNumber = number;
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
			originalNumber /= 10;
		}

		if (result == number)
			System.out.println(number + " an Armstrong");
		else
			System.out.println(number + " not an Armstrong");
	}

}
