package recursion;

public class Abstraction1 extends Abstraction{

	@Override
	public void age() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		Abstraction abc=new Abstraction1();
		abc.age1();
		System.out.println(abc.a);
	}

}
