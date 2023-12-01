package recursion;

public class FactorialRecursion {

	public static int recursionFunc(int n) {
		if (n > 1) {
			return n * (recursionFunc(n - 1));
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int ss = recursionFunc(n);
		System.out.println(ss);
	}
}
