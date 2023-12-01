package recursion;

public abstract class Abstraction {

	public abstract void age();
	public void age1() {System.err.println("A");}
	public static final void m1() {System.out.println("B");}
	static int  a=10;
	public static void main(String args[]) {
		System.out.println(a);
	}
}
