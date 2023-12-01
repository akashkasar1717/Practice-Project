package recursion;

public interface InterfaceNewChng {
	public static final String ABC="Akash";

	default void m1() {
		System.out.println("Hi");
	}

	static int cube(int x) {
		return x * x * x;
	}

	private static int m2() {
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println(cube(5));
		System.out.println(m2());
	}

}
