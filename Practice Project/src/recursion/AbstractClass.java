package recursion;

//An instance of an abstract class can not be created.
//There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final
//if the outer class is abstract then inner class must be abstract
public abstract class AbstractClass {
	public static void m1() {// We can define static methods in an abstract class
	};// it allows abstract as well as Concrete methods.

	public abstract void m2();// it allows abstract methods

	public static final int p = 1;

	public AbstractClass() {
		// Constructors are allowed.
	}

	static {
		{
			System.out.println("A " + p);
			{
				System.out.println("B");
			}

		}
		System.out.println("C");
	}

	abstract static class B {
		public static void m3() {
			System.out.println("Akash");
		};
	}

}
/*
 * 4. Why abstract class is faster than interface?
 * 
 * An abstract class is faster than an interface because the interface involves
 * a search before calling any overridden method in Java whereas abstract class
 * can be directly used.
 */
